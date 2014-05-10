package Extension;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class ActionPlus extends AbstractAction {

	Modele Modele;
	
	public ActionPlus(Modele Modele)
	{
		this.Modele = Modele;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			Modele.Plus();
		} catch (IntegerOutOfRangeException e) {
			e.getMessage();
		}

	}

}
