package org.emp;

public class EmployeeInfo {
	private void empId() {
	System.out.println("Employee Id : 6754");
	}
	private void empName() {
	System.out.println("Employee Name : Sri Balaji.S");
	}
	private void empDob() {
	System.out.println("Employee D.O.B : 20/10/2003");
	}
	private void empEmail() {
	System.out.println("Employee Email : SRICOC123@GMAIL.COM");
	}
	private void empAdress() {
	System.out.println("Employee Address : Chennai");
	
	}
	public static void main(String[] args) {
		EmployeeInfo a = new EmployeeInfo();
		a.empId();
		a.empName();
		a.empDob();
		a.empEmail();
		a.empAdress();
	}

}
