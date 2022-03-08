package com.cg.placementmanagement.Admin.repository;

import javax.persistence.EntityManager;
import com.cg.placementmanagement.Admin.entities.*;

public class AdminDaoImpl implements AdminDao {
	private EntityManager entityManager;

	public void AdminDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Admin getAdminById(int id) {
		Admin Admin = entityManager.find(Admin.class, id);
		return null;
	}

	@Override
	public void addAdmin(Admin admin) {
		entityManager.persist(admin);
	}

	@Override
	public void removeAdmin(Admin admin) {
		entityManager.remove(admin);
	}

	@Override
	public void updateAdmin(Admin admin) {
		entityManager.merge(admin);
		
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().commit();
		
	}

	
	
	}
