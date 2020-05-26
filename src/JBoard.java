import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class JBoard extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
	private final int WIDTH = 430;
	private final int HEIGHT = 430;
	
	GridLayout layout = new GridLayout(9,9);
	

	
	public JBoard() {
		this.setSize(WIDTH, HEIGHT);
		this.setBackground(Color.LIGHT_GRAY);
		//this.setBorder(border);
		this.setLayout(layout);
	}
	
	
	


	public void addH(HashMap<Integer, List<Square>> groups) {
		for (int num: groups.keySet()) {
			for (Square square: groups.get(num)) {
				this.add(square);
			}
		}
		
	}
	
	@Override 
	public void paintComponent(Graphics g) {
        super.paintComponent(g);    // paints background
        Graphics2D g2 = (Graphics2D) g;
        String hexColor = new String("000000");
		g.setColor(Color.decode(hexColor));
		g2.setStroke(new BasicStroke(5));
		//draw a line (starting x,y; ending x,y)
		g.drawLine(152, 7, 152, 448);
   }
	
}
