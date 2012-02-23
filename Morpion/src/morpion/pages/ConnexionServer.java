package morpion.pages;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ConnexionServer extends JPanel
{
	PagesController f;
	int y;
	int x;
	public ConnexionServer(PagesController f)
	{
		this.f=f;
		y= f.getHeight();
   	 	x=f.getWidth();
   	 	this.setBackground(Color.WHITE);
   
	}
	public void paintComponent(Graphics g)
	{
		
		 y= f.getHeight();
    	 x=f.getWidth();
    	
	}
	
}
