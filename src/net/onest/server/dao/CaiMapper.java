package net.onest.server.dao;

import java.util.List;

import net.onest.server.entity.Cai;

public interface CaiMapper {

	public List<Cai> searchCaiFromAll(Cai cai) ;
	
	public Cai searchCaiByName(Cai cai) ;
	
	public int insertCai(Cai cai);
	
	
	public List<Cai> findAllCai() ;
	
}
