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
			
        	Controller Controller = new Controller(modele, fenetre);
        	
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
			
        	Controller Controller2 = new Controller(modele2, fenetre2);
        	
        	fenetre2.pack(); // Recalcule la taille des composants
    		fenetre2.setVisible(true); //Fenetre visible
    		
    		/*LIAISON DES DEUX FENETRES*/
               
               
               
               
        }
 
}