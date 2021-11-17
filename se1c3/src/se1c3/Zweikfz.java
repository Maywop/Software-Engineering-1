package se1c3;

public class Zweikfz {

	public static void main(String[] args) {
		System.out.println("ZweiKfz");
		
		KfzV0 minivan = new KfzV0();
		minivan.sitze=6;
		minivan.tankinhalt=60;
		minivan.verbrauch=14f;
		minivan.reichweite= minivan.tankinhalt/minivan.verbrauch*100;

		System.out.println("Der Minivan hat " + minivan.sitze + " Sitze.");
		System.out.println("Der Minivan hat " + minivan.tankinhalt + " Liter Tankinhalt.");
		System.out.println("Der Minivan hat einen Verbrauch von " + minivan.sitze + " Litern auf 100km.");
		System.out.println("Der Minivan hat eine Reichweite von " + minivan.reichweite + "km.");
		
		
		KfzV0 sportwagen = new KfzV0();
		sportwagen.sitze=2;
		sportwagen.tankinhalt=45;
		sportwagen.verbrauch=11f;
		sportwagen.reichweite= sportwagen.tankinhalt/sportwagen.verbrauch*100;

		System.out.println("Der Minivan hat " + sportwagen.sitze + " Sitze.");
		System.out.println("Der Minivan hat " + sportwagen.tankinhalt + " Liter Tankinhalt.");
		System.out.println("Der Minivan hat einen Verbrauch von " + sportwagen.sitze + " Litern auf 100km.");
		System.out.println("Der Minivan hat eine Reichweite von " + sportwagen.reichweite + "km.");
		}
	}

