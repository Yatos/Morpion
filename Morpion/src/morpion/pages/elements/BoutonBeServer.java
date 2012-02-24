package morpion.pages.elements;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import morpion.pages.PagesController;
import morpion.pages.Refresher;
import morpion.server.Server;


public class BoutonBeServer extends JButton implements MouseListener{
	 


    
/**
	 * 
	 */
	PagesController pagesController;
	private static final long serialVersionUID = 1L;
	

public BoutonBeServer(PagesController pagesController)
{
	this.pagesController=pagesController;
	 this.addMouseListener(this);
	 //this.setBorderPainted(false);
	 this.setContentAreaFilled(false);//enleve couleur bleu du bouton
	 this.setFocusPainted(false);

}

@Override
public void mouseClicked(MouseEvent e) {
	
	
}

@Override
public void mouseEntered(MouseEvent e) {
	pagesController.repaint();

}

@Override
public void mouseExited(MouseEvent e) {

}

@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	System.out.println("I m a Server");
	pagesController.chargePageConnexionServer();
	pagesController.validate();
	//Refresher.startRefresher(pagesController);
	Server.startServer();
	
	
}

@Override
public void mouseReleased(MouseEvent e) {
	

}

}
