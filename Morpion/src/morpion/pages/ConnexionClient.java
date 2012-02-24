package morpion.pages;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ConnexionClient extends JPanel
{
	PagesController f;
	int y;
	int x;
	public ConnexionClient(PagesController f)
	{
		this.f=f;
		y= f.getHeight();
   	 	x=f.getWidth();
	}
	public void paintComponent(Graphics g)
	{
		
		 y= f.getHeight();
    	 x=f.getWidth();
    	
	}
	
	
	
}
