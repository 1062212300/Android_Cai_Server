package net.onest.server.service;

import java.util.List;

import net.onest.server.entity.Cai;

public interface CaiService {
	public List<Cai> searchCaiFromAll(Cai cai);
	
	public Cai searchCaiByName(Cai cai) ;
	
	public int insertCai(Cai cai);

	public List<Cai> findAllcai();
}
