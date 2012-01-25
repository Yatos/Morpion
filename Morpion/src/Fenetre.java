import javax.swing.JFrame;
 
public class Fenetre extends JFrame{
   
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Fenetre(){
         //Définit un titre pour votre fenêtre
         this.setTitle("Ma première fenêtre java");
         this.setSize(300, 450);
         //Nous allons maintenant dire à notre objet de se positionner au centre
         this.setLocationRelativeTo(null);
         //Ferme-toi lorsqu'on clique sur "Fermer" !
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         this.setVisible(true);
         Screen screen = new Screen(this);
         this.setContentPane(screen);
     }
}