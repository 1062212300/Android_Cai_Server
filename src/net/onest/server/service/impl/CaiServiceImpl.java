package net.onest.server.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.onest.server.dao.CaiMapper;
import net.onest.server.entity.Cai;
import net.onest.server.service.CaiService;

@Service
public class CaiServiceImpl implements CaiService{

	@Autowired
	private CaiMapper caiMapper;
	@Override
	public List<Cai> searchCaiFromAll(Cai cai) {
		return  caiMapper.searchCaiFromAll(cai);
	}
	@Override
	public int insertCai(Cai cai) {
		return caiMapper.insertCai(cai);
	}
	@Override
	public List<Cai> findAllcai() {
		return caiMapper.findAllCai();
	}
	@Override
	public Cai searchCaiByName(Cai cai) {
		return caiMapper.searchCaiByName(cai);
	}

}
