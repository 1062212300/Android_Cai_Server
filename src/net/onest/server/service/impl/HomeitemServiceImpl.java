package net.onest.server.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.onest.server.dao.HomeitemMapper;
import net.onest.server.entity.Homeitem;
import net.onest.server.service.HomeitemService;

@Service
public class HomeitemServiceImpl implements HomeitemService {

	@Autowired
	private HomeitemMapper homeitemMapper;
	@Override
	public List<Homeitem> findAllHomeite() {
		
		return homeitemMapper.findAllHomeite();
	}
	@Override
	public Homeitem findAllHomeiteBySearch(String info) {
		
		return homeitemMapper.findAllHomeiteBySearch(info);
	}

}
