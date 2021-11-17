package se1c3;


public class KfzV0 {

	//Instanzvariablen
	int sitze, tankinhalt,km;
	float verbrauch,reichweite;
	
	//Methode
	
	public float reichweite() {
		verbrauch = tankinhalt/reichweite*100;
		return(verbrauch);
	}
	
	public float spritVerbrauch(int km){
		verbrauch = km/12;
		return verbrauch;
		
	}
	
	
	
	
}
	