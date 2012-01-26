import javax.swing.*;
import java.awt.*;

public class Vertical extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int x1, y1, x2, y2;
	
	
	public Vertical(int x1, int y1, int x2, int y2) {
		setBackground(Color.BLACK);
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		System.out.println("voila!");
		g.setColor(Color.BLACK) ;
		g.drawLine(this.x1, this.y1 , this.x2, this.y2);
	}

}
