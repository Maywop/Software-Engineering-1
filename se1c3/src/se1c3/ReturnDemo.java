package se1c3;

public class ReturnDemo {
public static void main(String[]arg) {
	KfzV0 minivan = new KfzV0();
	
	minivan.sitze = 6;
	minivan.tankInhalt = 70;
	minivan.verbrauch = 14;
	
	
	KfzV0 sportwagen = new KfzV0();
	
	sportwagen.sitze = 2;
	sportwagen.tankInhalt = 45;
	sportwagen.verbrauch = 11;
	
	float a = KfzV0.reichweite(minivan.tankInhalt, minivan.verbrauch);
	float b = KfzV0.reichweite(sportwagen.tankInhalt, sportwagen.verbrauch);
	
	System.out.println("Die Reichweite des Minivan beträgt: "+a+"Km");
	System.out.println("Die Reichweite des Sportwagen beträgt: "+b+"Km");
}
}
