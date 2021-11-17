package se1c3;

public class Kfzdemo {

	public static void main(String[] args) {

	System.out.println("Kfzdemo");
		
	KfzV0 minivan = new KfzV0();
	minivan.sitze=6;
	minivan.tankinhalt=60;
	minivan.verbrauch=14f;
	minivan.reichweite= minivan.tankinhalt/minivan.verbrauch*100;

	System.out.println("Der Minivan hat " + minivan.sitze + " Sitze.");
	System.out.println("Der Minivan hat " + minivan.tankinhalt + " Liter Tankinhalt.");
	System.out.println("Der Minivan hat einen Verbrauch von " + minivan.sitze + " Litern auf 100km.");
	System.out.println("Der Minivan hat eine Reichweite von " + minivan.reichweite + "km.");
	}
}
