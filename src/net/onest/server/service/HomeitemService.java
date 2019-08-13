package net.onest.server.service;

import java.util.List;

import net.onest.server.entity.Homeitem;

public interface HomeitemService {
	//查询
	public List<Homeitem> findAllHomeite();
	//根据名称指定查询
	public Homeitem findAllHomeiteBySearch(String info);
}
