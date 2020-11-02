package sn.senforage.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sn.senforage.entities.User;


public class UserImpl implements IUser {
	private EntityManager em;
	
	public UserImpl () {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SenForagePU");
		em = emf.createEntityManager();
	}
	
	@Override
	public int add (User user) {
		try {
			em.getTransaction().begin();
			em.persist(user);
			em.getTransaction().commit();
			return 1;
			
		}catch (Exception e) {
			e.printStackTrace();
			return 0 ; 
		}
		
	}

	@Override
	public User getConnection(String email, String password) {
		try {
			User user =new User();
			user =(User) em.createQuery("SELECT u FROM User u WHERE u.email=:eml AND u.password=:pwd")
					       .setParameter("eml", email)
			               .setParameter("pwd", password)
			                .getSingleResult();
			return user;
		} catch (Exception e) {
			return null;
		}
	}

}
