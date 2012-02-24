package morpion.pages;

import java.awt.Color;
import javax.swing.JFrame;
 
public class PagesController extends JFrame{
   
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public PagesController(){
         //D�finit un titre pour votre fen�tre
         this.setTitle("Morpion Projekt v0.1");
         this.setSize(320, 480);
         //Nous allons maintenant dire � notre objet de se positionner au centre
         this.setLocationRelativeTo(null);
         //Ferme-toi lorsqu'on clique sur "Fermer" !
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setVisible(true);
         
         //this.setContentPane(screen);
      
     }
	
	public void chargePageAskBeClientOrServer()
	{
		setContentPane(new AskBeClientOrServer(this));
		setBackground(Color.BLACK);
		repaint();
	}
	
	public void chargePageConnexionClient()
	{
		ConnexionClient connexionClient = new ConnexionClient(this);
		setContentPane(connexionClient);
		setBackground(Color.WHITE);
		repaint();
		
	}
	
	public void chargePageConnexionServer()
	{
		setBackground(Color.WHITE);
		ConnexionServer connexionServer= new ConnexionServer(this);
		setContentPane(connexionServer);
	}
	
	
}