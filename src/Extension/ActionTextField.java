package Extension;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class ActionTextField extends AbstractAction {

	private Modele Modele;
	private Fenetre Fenetre;
	
	public ActionTextField(Modele Modele, Fenetre Fenetre)
	{
		this.Modele = Modele;
		this.Fenetre = Fenetre;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			Modele.UpdateText(Fenetre.getText().getText());
		} catch (IntegerOutOfRangeException e) {
			e.getMessage();
		}

	}

}
