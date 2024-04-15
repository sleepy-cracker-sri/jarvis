package org.personaldetails;
import java.util.Scanner;

public class EmployeeDetails {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter ur Employee ID !");
		int EmpId = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter ur Name ");
		String EmpName = input.nextLine();
		
		System.out.println("enter ur Email ID");
		String EmpEmail = input.nextLine();
		
		System.out.println("Enter ur Phone No");
		String EmpPhno = input.nextLine();
		
		System.out.println("Enter ur Salary");
		int EmpSalary = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter ur Gender ");
		String EmpGender = input.nextLine();
		
		System.out.println("Enter ur  City");
		String EmpCity = input.nextLine();
		
		System.out.println("******* Enterd Details..*******");
		
		System.out.println("Employee ID : "+EmpId);
		System.out.println("Name        : "+EmpName);
		System.out.println("Email ID    :"+EmpEmail);
		System.out.println("Phone No    :"+EmpPhno);
		System.out.println("Salary      : "+EmpSalary);
		System.out.println("Gender      : "+EmpGender);
		System.out.println("City        : "+EmpCity);
		
		
 		
	}

}
