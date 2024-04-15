package org.school;
import java.util.Scanner;

public class StudentMarks {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter ur register no.");
		int StudentRegNo = input.nextInt();
		input.nextLine();
		
		System.out.println("Enther ur Name. ");
		String StudentName = input.nextLine();
		
		
		System.out.println("Enter ur Tamil Mark.");
		int Tamil = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter ur English Mark.");
		int English = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter ur Maths Mark.");
		int Maths = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter ur Science Mark.");
		int Science = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter ur Social Mark.");
		int Social = input.nextInt();
		input.nextLine();
		
		System.out.println("NAME :"+StudentName+"    "+"RegNo :"+StudentRegNo);
		input.nextLine();
		System.out.println("    MARKS   ");
		input.nextLine();
		System.out.println("TAMIL   : "+Tamil);
		System.out.println("ENGLISH : "+English);
		System.out.println("MATHS   : "+Maths);
		System.out.println("SCIENCE : "+Science);
		System.out.println("SOCIAL  : "+Social);
		input.nextLine();
		int total = Tamil+English+Maths+Science+Social;
		System.out.println("TOTAL   :" +total);
		input.nextLine();
		int average = total /5;
		System.out.println("AVERAGE  OF MARKS :"+average);
		
		}
	
}