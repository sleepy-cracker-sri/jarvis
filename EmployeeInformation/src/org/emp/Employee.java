package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {
	public void EmployeeName() {
		System.out.println("Name : Sri Balaji.S");
	}public static void main(String[] args) {
		Employee a =new Employee();
		a.EmployeeName();
		Company b = new Company();
		b.companyName();
		Client c= new Client();
		c.clientName();
		Project d = new Project();
		d.projrctName();
	}

}
