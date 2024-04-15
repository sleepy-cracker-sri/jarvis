package org.college;
import java.util.Scanner;
public class StudentInfo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Student ID ");
		int studentId=input.nextInt();
		input.nextLine();
		
		System.out.println("Enter student Name ");
		String  StudentName = input.nextLine();
		
		System.out.println("Enter mail ID ");
		String StudentEmail=input.nextLine();
		
		System.out.println("Enter Phone No ");
		int StudentPhoneno =input.nextInt();
		input.nextLine();
		
		System.out.println("Enter ur Department ");
		String StudentDept =input.nextLine();
		
		System.out.println("Enter ur Gender ");
		String StudentGender = input.nextLine();
		
		System.out.println("Enter ur City ");
		String StudentCity =input.nextLine();
		
		System.out.println("   You Entered Details  ");
		input.nextLine();
		
		System.out.println("NAME      : "+StudentName);
		System.out.println("ID        : "+studentId);
		System.out.println("MAIL ID   : "+StudentEmail);
		System.out.println("PHONE NO  : "+StudentPhoneno);
		System.out.println("DEPARMENT : "+StudentDept);
		System.out.println("GENDER    : "+StudentGender);
		System.out.println("CITY      : "+StudentCity);
		
		
				
		
	}

}
