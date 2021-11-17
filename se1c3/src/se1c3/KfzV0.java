package se1c3;

public class KfzV0 {
	
	public int sitze;
	public int tankInhalt;
	public float verbrauch;
	
	public static float reichweite(int x, float y)
	   {
		  float ergebnis = (x / y) * 100;
		  return ergebnis;
	   }
	
	public static float spritVerbrauch(int km, float verbrauch)
	   {
		   float ergebnis1 = ((verbrauch*100)/km);
				   return ergebnis1;
	   }

}
