package net.onest.server.dao;


import java.util.List;

import net.onest.server.entity.Homeitem;

public interface HomeitemMapper {
	//查询
	public List<Homeitem> findAllHomeite();
	//根据名称指定查询
	public Homeitem findAllHomeiteBySearch(String info);
	
}
