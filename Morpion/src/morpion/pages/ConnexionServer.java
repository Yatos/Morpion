package morpion.pages;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ConnexionServer extends JPanel
{
	PagesController f;
	int y;
	int x;
	public JLabel messageEtatServer = new JLabel("Server en attente d'une connexion");
	
	public ConnexionServer(PagesController f)
	{
		this.setLayout(null);
		this.f=f;
		y= f.getHeight();
   	 	x=f.getWidth();
   	 messageEtatServer.setSize(200, 50);
	 	messageEtatServer.setLocation(10, 100);
   	 	this.add(messageEtatServer);

	}
	public void paintComponent(Graphics g)
	{
		
		 y= f.getHeight();
    	 x=f.getWidth();
    	 messageEtatServer.setSize(200, 50);
    	 	messageEtatServer.setLocation(10, 100);
    	
	}
	
	
	
}
