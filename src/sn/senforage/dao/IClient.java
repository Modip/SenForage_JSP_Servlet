package sn.senforage.dao;

import java.util.List;

import sn.senforage.entities.Client;

public interface IClient {
	public int add(Client client);
	public Client getClient(int id);
	public List<Client> getAll();
}
