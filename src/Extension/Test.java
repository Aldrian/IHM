package Extension;

public class Test {
 
        /**	
         * @param args
         */
        public static void main(String[] args) {
        	Fenetre fenetre = new Fenetre();
        	Modele modele1 = null;
        	Modele modele2 = null;
        	
			try {
				modele1 = new Modele(0, new IntegerObserver(fenetre));
				modele2 = new Modele(0, new IntegerObserver(fenetre));
			} catch (IntegerOutOfRangeException e) {
				e.getMessage();
			}
			
        	Controller Controller = new Controller(modele1,modele2, fenetre);
        	
        	
        	fenetre.pack(); // Recalcule la taille des composants
    		fenetre.setVisible(true); //Fenetre visible
               
               
               
               
        }
 
}