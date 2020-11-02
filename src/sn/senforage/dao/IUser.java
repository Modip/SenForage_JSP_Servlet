package sn.senforage.dao;

import sn.senforage.entities.User;

public interface IUser {
	public int add (User user);
	public User getConnection(String email,String password); 


}
