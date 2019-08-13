package net.onest.server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.onest.server.dao.AdminMapper;
import net.onest.server.entity.Admin;
import net.onest.server.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminMapper adminMapper;
	@Override
	public Admin findAdminByIdAndPassword(Admin admin) {
		// TODO Auto-generated method stub
		return adminMapper.findAdminByIdAndPassword(admin);
	}

	@Override
	public int insertAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminMapper.insertAdmin(admin);
	}

}
