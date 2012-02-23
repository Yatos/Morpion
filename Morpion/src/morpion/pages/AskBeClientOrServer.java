package morpion.pages;

import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;

import morpion.pages.elements.BoutonBeClient;
import morpion.pages.elements.BoutonBeServer;

public class AskBeClientOrServer extends JPanel 
{
	
	private static final long serialVersionUID = 1L;
	PagesController pagesController;
	int x;
	int y;
	public BoutonBeServer beServer;
	BoutonBeClient beClient;
	public JLabel clientLabel = new JLabel("Client");
	public JLabel ServerLabel = new JLabel("Server");
	
	public AskBeClientOrServer(PagesController pagesController)
	{
		beClient=new BoutonBeClient(pagesController);
		beServer= new BoutonBeServer(pagesController);
		this.pagesController=pagesController;
		this.setLayout(null);
		
		clientLabel.setSize(50, 50);
		clientLabel.setLocation(130, 100);
		
		ServerLabel.setSize(50, 50);
		ServerLabel.setLocation(130, 200);
		
		beClient.setSize(100,50);
		beClient.setLocation(100, 100);
		
		beServer.setSize(100,50);
		beServer.setLocation(100, 200);
		
		this.add(beClient);
		this.add(beServer);
		this.add(clientLabel);
		this.add(ServerLabel);
		
	}
	
	public void paintComponent(Graphics g)
	{
		
		// y= pagesController.getHeight();
    	 //x=pagesController.getWidth();
    	
		/*//fond blanc
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, x, y);*/
	}

}
