package com.cg.placementmanagement.Admin.services;

import com.cg.placementmanagement.Admin.entities.*;
public interface AdminService {
public abstract void addAdmin(Admin admin);
public abstract void updateAdmin(Admin admin);
public abstract void removeAdmin(Admin admin);
public abstract Admin findAdminById(int id);

}
