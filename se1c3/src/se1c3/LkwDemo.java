package se1c3;

public class LkwDemo {
     public static void main(String[]arg) {
    	 
    	 Kfz sportwagen = new Kfz(2, 45, 11);
    	 Lkw magarius = new Lkw(2, 45, 11);
    	 
    	 int strecke = 252;
    	 
    	 float ende1 = Lkw.spritVerbrauch(strecke, sportwagen.getVerbrauch());
    	 float ende2 = Lkw.spritVerbrauch(strecke, magarius.getVerbrauch());
    	 
    	 System.out.println("Der Spritverbrauch des Sportwagen beträgt: "+ende1+"l");
    	 System.out.println("Der Spritverbrauch des Magarius beträgt: "+ende2+"l");
     }
}
