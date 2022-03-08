package com.cg.placementmanagement.Admin.services;

import com.cg.placementmanagement.Admin.entities.Admin;
import com.cg.placementmanagement.Admin.repository.AdminDao;
import com.cg.placementmanagement.Admin.repository.AdminDaoImpl;

public class AdminServiceImpl implements AdminService {
	private AdminDao dao;

	public AdminServiceImpl() {
		dao = new AdminDaoImpl();
	}

	@Override
	public void addAdmin(Admin admin) {
		dao.beginTransaction();
		dao.addAdmin(admin);
		dao.commitTransaction();

	}

	@Override
	public void updateAdmin(Admin admin) {
		dao.beginTransaction();
		dao.updateAdmin(admin);
		dao.commitTransaction();

	}

	@Override
	public void removeAdmin(Admin admin) {
		dao.beginTransaction();
		dao.removeAdmin(admin);
		dao.commitTransaction();
	}

	@Override
	public Admin findAdminById(int id) {
//no need of transaction, as it's an read operation
		Admin admin = dao.getAdminById(id);
		return admin;
	}

}