package se1c3;

public class Kfz {
   
	private int sitze;
	private int tankInhalt;
	private float verbrauch;
	
	 public Kfz(int sitze, int tankInhalt, float verbrauch)
	{
		this.sitze = sitze;
		this.tankInhalt = tankInhalt;
		this.verbrauch = verbrauch; 
	}
	
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
	
	public int getTankInhalt() {
		return tankInhalt;
	}
	
	public float getVerbrauch() {
		return verbrauch;
	}
}
