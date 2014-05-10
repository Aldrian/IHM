package Fenetre;
import javax.swing.*;
public class Fenetre extends JFrame {

	private static final long serialVersionUID = 1L;
	
	JButton BoutonPlus; 
    JButton BoutonMoins;
    JTextField Text;
	public Fenetre()
	{
		this.setResizable(false);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
	    JPanel p = new JPanel();  
	      
	    
	    Text = new JTextField("");
	    Text.setColumns(2);
	    
	    BoutonPlus = new JButton("+");     
	    BoutonMoins = new JButton("-");
	    p.add(Text);
	    p.add(BoutonPlus);
	    p.add(BoutonMoins);
	    
	    this.add(p);
	    
	     
	}
	public JButton getBoutonMoins() {
		return BoutonMoins;
	}
	public JButton getBoutonPlus() {
		return BoutonPlus;
	}
	
	public JTextField getText() {
		return Text;
	}
	
	
}
