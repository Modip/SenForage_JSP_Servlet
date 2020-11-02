package sn.senforage.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sn.senforage.entities.Client;

public class ClientImpl implements IClient {
	private EntityManager em;
	public ClientImpl () {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SenForagePU");
		em = emf.createEntityManager();
	}
@Override
public int add (Client client) {
	try {
		em.getTransaction().begin();
		em.persist(client);
		em.getTransaction().commit();
		return 1;
		} catch (Exception e) {
		e.printStackTrace();
		return 0;
		}
	}

	@Override
	public List<Client> getAll() {
		return em.createQuery("SELECT c FROM Client c").getResultList();
	}
	@Override
	public Client getClient(int id) {
		return (Client)em.createQuery("SELECT client FROM Client client WHERE client.id = idClient")
				.setParameter("idclient", id).getSingleResult();
	}
}
