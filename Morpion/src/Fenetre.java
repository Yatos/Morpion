import javax.swing.JFrame;
 
public class Fenetre extends JFrame{
   
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Fenetre(){
         //Définit un titre pour votre fenêtre
         this.setTitle("Morpion Projekt v0.1");
         this.setSize(320, 480);
         //Nous allons maintenant dire à notre objet de se positionner au centre
         this.setLocationRelativeTo(null);
         //Ferme-toi lorsqu'on clique sur "Fermer" !
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         this.setVisible(true);
         Screen screen = new Screen(this);
         this.setContentPane(screen);
     }
}