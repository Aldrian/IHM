package Fenetre;

public class Test {
 
        /**	
         * @param args
         */
        public static void main(String[] args) {
        	Fenetre fenetre = new Fenetre();
        	Modele modele = null;
        	
			try {
				modele = new Modele(0, new IntegerObserver(fenetre));
			} catch (IntegerOutOfRangeException e) {
				e.getMessage();
			}
			
        	Controller Controller = new Controller(modele, fenetre);
        	
        	
        	fenetre.pack(); // Recalcule la taille des composants
    		fenetre.setVisible(true); //Fenetre visible
               
               
               
               
        }
 
}