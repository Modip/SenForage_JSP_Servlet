package sn.senforage.dao;

import java.util.List;

import sn.senforage.entities.Village;

public interface IVillage {
	
	public int add(Village village);
	public List<Village> getAll();
	public Village get(int id);


}
