package org.company;
import org.client.Client;

public class Company extends Client {
	public void companyName() {
	System.out.println("Company Name : Priority Comsole");
	}
	public static void main(String[] args) {
		Company v=new Company();
		v.companyName();
		v.clientName();
	}

}
