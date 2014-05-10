package Extension;
import javax.swing.*;
public class Fenetre extends JFrame {

	private static final long serialVersionUID = 1L;
	
	JButton BoutonPlus,BoutonPlus2; 
    JButton BoutonMoins,BoutonMoins2;
    JTextField Text, Text2;
	public Fenetre()
	{
		this.setResizable(true);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
	    
	    BoxLayout b = new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS);
	    this.setLayout(b);
	    
	    JPanel p1 = new JPanel(); 
	    JPanel p2 = new JPanel();  
	    
	      
	    
	    Text = new JTextField("");
	    Text.setColumns(2);
	    
	    BoutonPlus = new JButton("+");     
	    BoutonMoins = new JButton("-");
	    p1.add(Text);
	    p1.add(BoutonPlus);
	    p1.add(BoutonMoins);
	    
	    this.getContentPane().add(p1);
	       
	    
	    Text2 = new JTextField("");
	    Text2.setColumns(2);
	    
	    BoutonPlus2 = new JButton("+");     
	    BoutonMoins2 = new JButton("-");
	    p2.add(Text2);
	    p2.add(BoutonPlus2);
	    p2.add(BoutonMoins2);

	    this.getContentPane().add(p2);
	    
	    
	     
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
	
	
	public JButton getBoutonMoins2() {
		return BoutonMoins2;
	}
	public JButton getBoutonPlus2() {
		return BoutonPlus2;
	}
	
	public JTextField getText2() {
		return Text2;
	}
	
	
}
