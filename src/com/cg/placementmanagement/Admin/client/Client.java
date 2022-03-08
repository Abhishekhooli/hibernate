package com.cg.placementmanagement.Admin.client;

import com.cg.placementmanagement.Admin.entities.Admin;
import com.cg.placementmanagement.Admin.services.AdminService;
import com.cg.placementmanagement.Admin.services.AdminServiceImpl;

public class Client {
	public static void main(String[] args) {
//Debug this program as Debug -> Debug as Java Application

		AdminService service = new AdminServiceImpl();
		Admin admin = new Admin();
// Create Operation
		admin.setId(0);;
		admin.setName("abhi");
		admin.setPassword("Abhishek");
		service.addAdmin(admin);
//at this breakpoint, we have added one record to table
// Retrieve Operation
		/*
		 * Admin = service.findAdminById(100); System.out.print("ID:" + admin.getId());
		 * System.out.println(" Name:" + admin.getName()); //Update Operation admin =
		 * service.findStudentById(100); admin.setName("Sachin Tendulkar");
		 * service.updateAdmin(Admin); //at this breakpoint, we have updated record
		 * added in first section Admin = service.findAdminById(100);
		 * System.out.print("ID:" + =Admin.getStudentId()); System.out.println(" Name:"
		 * + Admin.getName()); //at this breakpoint, record is removed from table
		 * //Delete Operation Admin = service.findAdminById(100);
		 * service.removeAdmin(Admin);
		 */
		System.out.println("End of program/Life cycle completed...");
	}
}