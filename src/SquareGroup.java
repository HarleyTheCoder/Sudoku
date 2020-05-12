import java.awt.Color;
import java.awt.Container;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class SquareGroup extends JPanel {
	private Border groupBorder = BorderFactory.createLineBorder(Color.BLACK, 1);
	private Square[][] squares;
	private int[][] values = new int[3][3];
	private boolean[][] solids = new boolean[3][3];
	private int WIDTH = 150; 
	private int HEIGHT = 150;
	
	public SquareGroup(int[][] values, boolean[][] solids) {
		this.values = values;
		this.solids = solids;
		//this.setSize(WIDTH, HEIGHT);
		//this.setBorder(groupBorder);
		
		/*
		
		//Add squares to panel
		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 3; b++) {
				//squares[a][b].setValue(values[a][b]);
				//squares[a][b].setSolid(solids[a][b]);
				this.add(squares[a][b]);
				
			}
		}
		
		//set position of squares
				//may be able to set with a for loop but oh well
				squares[0][0].setBounds(0, 0, 50, 50); 
				squares[1][0].setBounds(50, 0, 50, 50); 
				squares[2][0].setBounds(100, 0, 50, 50); 
				squares[0][1].setBounds(0, 50, 50, 50); 
				squares[1][1].setBounds(50, 50, 50, 50); 
				squares[2][1].setBounds(100, 50, 50, 50); 
				squares[0][2].setBounds(0, 100, 50, 50); 
				squares[1][2].setBounds(50, 100, 50, 50); 
				squares[2][2].setBounds(100, 100, 50, 50); 
				
				
		this.squares = squares;
	*/
	}
	
}
