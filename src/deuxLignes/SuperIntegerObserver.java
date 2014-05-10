package deuxLignes;

import java.util.Observable;
import java.util.Observer;

public class SuperIntegerObserver implements Observer {
	
	Modele Modele1;
	Modele Modele2;
	Fenetre Fenetre1;
	Fenetre Fenetre2;


	public SuperIntegerObserver(Modele Modele1, Modele Modele2, Fenetre Fenetre1, Fenetre Fenetre2) {
			this.Modele1 = Modele1;
			this.Modele2 = Modele2;
			this.Fenetre1 = Fenetre1;
			this.Fenetre2 = Fenetre2;
	}


	@Override
	public void update(Observable arg0, Object arg1) {
		Modele ModeleAppele = (Modele) arg0;
		if(Modele1==ModeleAppele)
		{
			try {
				Modele2.setEntier(10-Modele1.getEntier());
				Integer tmp = 10-Modele1.getEntier();
				Fenetre2.getText().setText(tmp.toString());
			} catch (IntegerOutOfRangeException e) {
				e.getMessage();
			}
			
		}
		if(Modele2==ModeleAppele)
		{
			try {
				Modele1.setEntier(10-Modele2.getEntier());
				Integer tmp = 10-Modele2.getEntier();
				Fenetre1.getText().setText(tmp.toString());
			} catch (IntegerOutOfRangeException e) {
				e.getMessage();
			}
		}
		
	}

}
