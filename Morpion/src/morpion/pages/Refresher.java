package morpion.pages;

import java.awt.Color;

import morpion.server.Server;

public class Refresher implements Runnable
{
	private static  Thread t;
	static PagesController pagesController;
	
	public static void startRefresher(PagesController pagesController2) {
		
		pagesController=pagesController2;
		t= new Thread(new Refresher());
		t.start();
	}
	@Override
	public void run() 
	{
		while(true)
		{
			pagesController.validate();
			pagesController.repaint();
			

			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {e.printStackTrace();}
			
		}

		
	}

}
