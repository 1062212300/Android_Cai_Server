package net.onest.server.dao;

import net.onest.server.entity.Admin;

public interface AdminMapper {

	public Admin findAdminByIdAndPassword(Admin user);
	
	public int insertAdmin(Admin user);
}
