package net.onest.server.service;

import net.onest.server.entity.Admin;

public interface AdminService {

	public Admin findAdminByIdAndPassword(Admin admin);
	
	public int insertAdmin(Admin admin); 
	
}
