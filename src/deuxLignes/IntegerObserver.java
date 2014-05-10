package deuxLignes;
import java.util.Observable;
import java.util.Observer;

/**
 * Observateur de l'entier de notre mod�le
 * @author Ga�tan
 *
 */
public class IntegerObserver implements Observer {
	
	Fenetre Fenetre;
	
	public IntegerObserver(Fenetre Fenetre){
		this.Fenetre = Fenetre;
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		Modele modele = (Modele)arg0;
		System.out.println("L'entier a chang�.");
		System.out.println("Valeur de l'entier : " + modele.getEntier() );
		
		Integer tmp = modele.getEntier();
		Fenetre.getText().setText(tmp.toString());
	}
	
}
