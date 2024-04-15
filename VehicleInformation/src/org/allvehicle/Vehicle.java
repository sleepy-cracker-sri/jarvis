package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheeler;

public class Vehicle {
	public void vehicleNecessery() {
		System.out.println("Number of Vehicles Entered in City Border");
	}
	public static void main(String[] args) {
		Vehicle a = new Vehicle ();
		a.vehicleNecessery();
		TwoWheeler b = new TwoWheeler();
		b.bike();
		b.cycle();
		ThreeWheeler c= new ThreeWheeler();
		c.Auto();
		FourWheeler d = new FourWheeler();
		d.bus();
		d.car();
	}

}
