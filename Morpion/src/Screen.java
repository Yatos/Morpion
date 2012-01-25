import java.awt.Graphics;



import javax.swing.JPanel;
 
public class Screen extends JPanel 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Fenetre f;
	public Bouton b1=new Bouton();
	public Bouton b2=new Bouton();
	public Bouton b3=new Bouton();
	public Screen(Fenetre f)
	{
		int y= f.getHeight();
		int x=f.getWidth();

   		b1.setSize(x/3,y/3);
		b2.setSize(x/3,y/3);
		b3.setSize(x/3,y/3);
		b2.setLocation(x/3, 0);
		this.setLayout(null);
		this.f=f;
	
		this.add(b2);
		this.add(b3);
		this.add(b1);
		
	}
 
        public void paintComponent(Graphics g){
        
               System.out.println("Je suis exécutée ! ! !"); 
       		int y= f.getHeight();
    		int x=f.getWidth();

       		b1.setSize(x/3,y/3);
    		b2.setSize(x/3,y/3);
    		b3.setSize(x/3,y/3);
    
    		b2.setLocation(x/3, 0);
    		b3.setLocation(2*x/3,0);
        }

          
}