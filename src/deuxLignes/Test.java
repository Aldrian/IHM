package deuxLignes;

public class Test {
 
        /**	
         * @param args
         */
        public static void main(String[] args) {
        	
        	/* FENETRE 1 */
        	Fenetre fenetre = new Fenetre();
        	Modele modele = null;
        	
			try {
				modele = new Modele(0);
			} catch (IntegerOutOfRangeException e) {
				e.getMessage();
			}
			
        	
        	
        	fenetre.pack(); // Recalcule la taille des composants
    		fenetre.setVisible(true); //Fenetre visible
    		
        	
        	/* FENETRE 2 */
        	Fenetre fenetre2 = new Fenetre();
        	Modele modele2 = null;
        	
			try {
				modele2 = new Modele(0);
			} catch (IntegerOutOfRangeException e) {
				e.getMessage();
			}
			SuperIntegerObserver Su = new SuperIntegerObserver(modele, modele2, fenetre, fenetre2);
			
			Controller Controller = new Controller(modele, fenetre, Su);
        	Controller Controller2 = new Controller(modele2, fenetre2, Su);
        	
        	fenetre2.pack(); // Recalcule la taille des composants
    		fenetre2.setVisible(true); //Fenetre visible
    		
    		/*LIAISON DES DEUX FENETRES*/
               
               
               
               
        }
 
}