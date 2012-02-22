package morpion.graphic;

import javax.swing.JPanel;

public class AskBeClientOrServer extends JPanel 
{
	
	private static final long serialVersionUID = 1L;
	Fenetre f;
	public Bouton beClient=new Bouton();
	public Bouton beServer=new Bouton();
	
	public AskBeClientOrServer()
	{
		this.setLayout(null);
		
		beClient.setSize(100,50);
		beClient.setLocation(100, 100);
		beServer.setSize(100,50);
		beServer.setLocation(100, 200);
		this.add(beClient);
		this.add(beServer);
		
	}

}
