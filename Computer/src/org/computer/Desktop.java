package org.computer;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("Desktop Size : 1 TB SSD Storage");
	}
	public static void main(String[] args) {
		Desktop c =new Desktop();
		c.computerModel();
		c.desktopSize();
	}
}
