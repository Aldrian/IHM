package Extension;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class ActionMoins extends AbstractAction {

	private Modele Modele;
	
	public ActionMoins(Modele Modele)
	{
		this.Modele = Modele;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			Modele.Moins();
		} catch (IntegerOutOfRangeException e) {
			e.getMessage();
		}

	}

}
