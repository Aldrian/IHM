package deuxLignes;

public class Controller {
	
	private ActionPlus ActionPlus;
	private ActionMoins ActionMoins;
	private ActionTextField ActionTextField;
	
	private Fenetre Fenetre;
	private Modele Modele;
	private SuperIntegerObserver Su;
	public Controller(Modele Modele, Fenetre Fenetre, SuperIntegerObserver Su) {
		
		this.Fenetre = Fenetre;
		this.Modele = Modele;
		this.Su = Su;
		
		ActionPlus = new ActionPlus(Modele);
		ActionMoins = new ActionMoins(Modele);
		ActionTextField = new ActionTextField(Modele,Fenetre);
		
		Fenetre.getBoutonPlus().addActionListener(ActionPlus);
		Fenetre.getBoutonMoins().addActionListener(ActionMoins);
		
		Integer tmp = Modele.getEntier();
		Fenetre.getText().setText(tmp.toString());
		Fenetre.getText().addActionListener(ActionTextField);
		
		this.Modele.addObserver(new IntegerObserver(Fenetre));
		this.Modele.addObserver(Su);
	}
	
	

}
