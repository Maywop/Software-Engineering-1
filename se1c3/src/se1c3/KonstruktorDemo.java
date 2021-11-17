package se1c3;

public class KonstruktorDemo {
	public static void main(String[]arg) {
		Kfz minivan = new Kfz(6, 70, 14);
		
		Kfz sportwagen = new Kfz(2, 45, 11);
		
		
		float a = KfzV0.reichweite(minivan.getTankInhalt(), minivan.getVerbrauch());
		float b = KfzV0.reichweite(sportwagen.getTankInhalt(), sportwagen.getVerbrauch());
		
		System.out.println("Die Reichweite des Minivan beträgt: "+a+"Km");
		System.out.println("Die Reichweite des Sportwagen beträgt: "+b+"Km");
		System.out.println("");
		
		
		int strecke = 252;
		
		float c = KfzV0.spritVerbrauch(strecke, minivan.getVerbrauch());
		float d = KfzV0.spritVerbrauch(strecke, sportwagen.getVerbrauch());
		
		System.out.println("Der Verbrauch des Minivon beträgt: "+c+"l");
		System.out.println("Der Verbrauch des Sportwagen beträgt: "+d+"l");
	}
}
