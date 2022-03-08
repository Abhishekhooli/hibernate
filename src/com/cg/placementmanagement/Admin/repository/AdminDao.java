package com.cg.placementmanagement.Admin.repository;

import com.cg.placementmanagement.Admin.*;
import com.cg.placementmanagement.Admin.entities.Admin;

public interface AdminDao {
	public abstract Admin getAdminById(int id);

	public abstract void addAdmin(Admin admin);

	public abstract void removeAdmin(Admin admin);

	public abstract void updateAdmin(Admin admin);

	public abstract void commitTransaction();

	public abstract void beginTransaction();

	
}