import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;


public class Bouton extends JButton implements MouseListener{
	 


    
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public Bouton(){
	 this.addMouseListener(this);
        
        

}

@Override
public void mouseClicked(MouseEvent e) {

	
}

@Override
public void mouseEntered(MouseEvent e) {

}

@Override
public void mouseExited(MouseEvent e) {

}

@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	System.out.println("mousePress");
}

@Override
public void mouseReleased(MouseEvent e) {

}

}