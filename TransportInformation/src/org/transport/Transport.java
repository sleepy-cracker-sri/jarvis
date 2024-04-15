package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {
	public void TransportForm() {
		System.out.println("Forms of Transport in the Word");
	}
	public static void main(String[] args) {
		Transport a =new Transport();
		a.TransportForm();
		Road b = new Road ();
		b.bike();
		b.cycle();
		b.cars();
		b.bus();
		Air c =new Air();
		c.aeroPlane();
		c.heliCopter();
		Water d = new Water();
		d.boat();
		d.ship();
	}

}
