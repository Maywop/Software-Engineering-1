package se1c2;

public class Versuch2 {

	public static void main(String[] args) {
		
		int zaehler = 1;
		for (int a = 1 ;a <= 6; a++) {
			for (int b = 1 ;b <= 6; b++) {
				for (int c = 1 ;c <= 6; c++) {
					for (int d = 1 ;d <= 6; d++) {
					if (a!=b && a!=c && a!=d && b!=c && d!=c && b!=d)
					{					
						System.out.println(""+a+""+b+""+c+""+d);
						
						zaehler++;
					}
					}
				}
			}
		}
		System.out.println("Anzahl der möglichen Kombinationen "+ zaehler);
	}
}
