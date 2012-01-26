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
	public Vertical v1=new Vertical(0,0,100,100);	//trait vertical
	public Vertical v2=new Vertical(0,0,100,100);	//valeurs bidons pour construction modifiées par la suite
	public Vertical v3=new Vertical(0,0,100,100);	//trait horizontal
	public Vertical v4=new Vertical(0,0,100,100);	// "
	
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
		
		v1.x1=x/3;
		v1.y1=0;
		v1.x2=x/3;
		v1.y2=y;
		this.add(v1);
		
		v2.x1=(x/3)*2;
		v2.y1=0;
		v2.x2=(x/3)*2;
		v2.y2=y;
		this.add(v2);
		
		v3.x1=0;
		v3.y1=y/3;
		v3.x2=x;
		v3.y2=y/3;
		this.add(v3);
		
		v3.x1=0;
		v3.y1=(y/3)*2;
		v3.x2=x;
		v3.y2=(y/3)*2;
		this.add(v4);
		
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
    		
    		v1.paintComponent(g);
    		v2.paintComponent(g);
    		v3.paintComponent(g);
    		v4.paintComponent(g);
    		
    		
        }

          
}