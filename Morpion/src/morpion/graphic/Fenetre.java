package morpion.graphic;

import java.awt.Color;

import javax.swing.JFrame;
 
public class Fenetre extends JFrame{
   
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Fenetre(){
         //D�finit un titre pour votre fen�tre
         this.setTitle("Morpion Projekt v0.1");
         this.setSize(320, 480);
         //Nous allons maintenant dire � notre objet de se positionner au centre
         this.setLocationRelativeTo(null);
         //Ferme-toi lorsqu'on clique sur "Fermer" !
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setVisible(true);
         Screen screen = new Screen(this);
         //this.setContentPane(screen);
      
     }
}