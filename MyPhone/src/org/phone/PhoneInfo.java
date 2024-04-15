package org.phone;

public class PhoneInfo {
	private void phoneName() {
		System.out.println("Mobile Name : Realme 5 Pro");
	}
	private void phoneMieiNum() {
	System.out.println("MIEI No : 8926628l");
	}
	private void camera() {
	System.out.println("Camera : 108 Megapixel");
	}
	private void storage() {
		System.out.println("Storage : 128 Gb");
	}
	private void osName() {
	System.out.println("Operating System : Android 14");
	}
	public static void main(String[] args) {
		PhoneInfo c=new PhoneInfo();
		c.phoneName();
		c.phoneMieiNum();
		c.camera();
		c.storage();
		c.osName();
	}

}
