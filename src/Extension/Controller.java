package Extension;

public class Controller {
	
	private ActionPlus ActionPlus, ActionPlus2;
	private ActionMoins ActionMoins, ActionMoins2;
	private ActionTextField ActionTextField, ActionTextField2;
	
	private Fenetre Fenetre;
	private Modele Modele, Modele2;
	public Controller(Modele Modele, Modele Modele2, Fenetre Fenetre) {
		
		this.Fenetre = Fenetre;
		this.Modele = Modele;
		this.Modele2 = Modele2;
		
		/* PARTIE HAUTE */
		ActionPlus = new ActionPlus(Modele);
		ActionMoins = new ActionMoins(Modele);
		ActionTextField = new ActionTextField(Modele,Fenetre);
		
		Fenetre.getBoutonPlus().addActionListener(ActionPlus);
		Fenetre.getBoutonMoins().addActionListener(ActionMoins);
		
		Integer tmp = Modele.getEntier();
		Fenetre.getText().setText(tmp.toString());
		Fenetre.getText().addActionListener(ActionTextField);
		
		/* PARTIE BASSE */
		ActionPlus2 = new ActionPlus(Modele2);
		ActionMoins2 = new ActionMoins(Modele2);
		ActionTextField2 = new ActionTextField(Modele2,Fenetre);
		
		Fenetre.getBoutonPlus2().addActionListener(ActionPlus2);
		Fenetre.getBoutonMoins2().addActionListener(ActionMoins2);
		
		tmp = Modele.getEntier();
		Fenetre.getText2().setText(tmp.toString());
		Fenetre.getText2().addActionListener(ActionTextField2);
	}
	
	

}
