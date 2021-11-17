package se1c3;

public class SpritDemo {

	
	public static void main(String[] args) {

		
		int km = 252;
		System.out.println(spritVerbrauch(km));


	}

	public static float spritVerbrauch(int km) {
		float verbrauch = km/12;
		return (verbrauch);	
	}

}
