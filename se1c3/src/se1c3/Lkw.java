package se1c3;

public class Lkw extends Kfz {

	public Lkw(int sitze, int tankInhalt, float verbrauch) {
		super(sitze, tankInhalt, verbrauch);
	}

	int ladeFlaeche;
	boolean hatAnhaenger;
	
	public float spritVerbrauch2(int km, float verbrauch){
		float ergebnis1 = ((verbrauch*100)/km)+1;
		   return ergebnis1;
	}
}
