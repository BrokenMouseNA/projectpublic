package models;

import java.util.List;

import models.Role;

import java.util.ArrayList;

public class Users {
	private final List<Users> users = new ArrayList<>();
	
	public Users() {
		
		Users GENERIC_EMPLOYEE_1 = new Users(1, "genericEmployee1", "genericPassword1", Role.Employee);
		Users GENERIC_EMPLOYEE_2 = new Users(2, "genericEmployee2", "genericPassword2", Role.Employee);
		Users GENERIC_EMPLOYEE_3 = new Users(3, "genericEmployee3", "genericPassword3", Role.Employee);
		Users GENERIC_FINANCE_MANAGER_1 = new Users(4, "genericManager1", "genericPassword1", Role.Manager);
		Users GENERIC_FINANCE_MANAGER_2 = new Users(5, "genericManager2", "genericPassword2", Role.Manager);
		Users GENERIC_FINANCE_MANAGER_3 = new Users(6, "genericManager3", "genericPassword3", Role.Manager);
		
		users.add(GENERIC_EMPLOYEE_1);
		users.add(GENERIC_EMPLOYEE_2);
		users.add(GENERIC_EMPLOYEE_3);
		users.add(GENERIC_FINANCE_MANAGER_1);
		users.add(GENERIC_FINANCE_MANAGER_2);
		users.add(GENERIC_FINANCE_MANAGER_3);
	}
	
	public List<Users> getUsers() { return users; }

}