package morpion.pages;
import java.awt.Color;
import java.awt.Graphics;



import javax.swing.JPanel;

import morpion.pages.elements.Bouton;

 
public class InGame extends JPanel 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	PagesController f;
	public Bouton b1=new Bouton();
	public Bouton b2=new Bouton();
	public Bouton b3=new Bouton();
	
	public InGame(PagesController f)
	{
		int y= f.getHeight();
		int x=f.getWidth();
        this.setLayout(null);
        
   		b1.setSize(x/3,y/3);
		b2.setSize(x/3,y/3);
		b3.setSize(x/3,y/3);
		b2.setLocation(x/3, 0);
	
		this.f=f;
		
		this.add(b2);
		this.add(b3);
		this.add(b1);
	}
 
        public void paintComponent(Graphics g){
        
        	
        	int y= f.getHeight();
        	int x=f.getWidth();
        

    		int sectionX=x/5;
    		int indiceCentrage=(y-3*sectionX)/2;

    		
       		b1.setSize(x/3,y/3);
    		b2.setSize(x/3,y/3);
    		b3.setSize(x/3,y/3);
    
    		b2.setLocation(x/3, 0);
    		b3.setLocation(2*x/3,0);
    		
    		//fond blanc
    		g.setColor(Color.WHITE);
    		g.fillRect(0, 0, x, y);
    		
    		
    		//ligne noir du plateau de jeu
    		g.setColor(Color.BLACK);
    		g.drawLine(x/3, 0, x/3, y);
    		g.drawLine(2*x/3, 0, 2*x/3, y);
    		g.drawLine(0, y/3, x, y/3);
    		g.drawLine(0, 2*y/3, x,2*y/3);
        }       
}