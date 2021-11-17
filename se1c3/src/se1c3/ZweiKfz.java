package se1c3;

public class ZweiKfz{
	public static void main(String[]arg)
	{
		KfzV0 minivan = new KfzV0();
		
		minivan.sitze = 6;
		minivan.tankInhalt = 70;
		minivan.verbrauch = 14;
		
		/* Berechnung und Ausgabe der Reichweite aus Schritt 4 */
		
		float x = (minivan.tankInhalt/minivan.verbrauch)*100;
		System.out.println("Die Reichweite des Minivan beträgt: "+x+"Km");
		
		
		
		KfzV0 sportwagen = new KfzV0();
		
		sportwagen.sitze = 2;
		sportwagen.tankInhalt = 45;
		sportwagen.verbrauch = 11;
		
		float y = (sportwagen.tankInhalt/sportwagen.verbrauch)*100;
		
		System.out.println("Die Reichweite des Sportwagen beträgt: "+y+"Km");
	}
}
