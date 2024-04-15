package org.phone;

public class InternalStorage {
	public void processorName() {
	System.out.println("Processor : Mediatek Dimensity 12000 Processor");
	}
	public void ramSize() {
	System.out.println("Ram Size : 8GB ram + 8 GB expandable");
	}
	public static void main(String[] args) {
		ExternalStorage x = new ExternalStorage();
		x.size();
		InternalStorage z = new InternalStorage();
		z.processorName();
		z.ramSize();
	}

}
