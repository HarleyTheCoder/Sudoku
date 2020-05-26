import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Label;
import java.awt.Paint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

//Old

public class SudokuApp extends Frame { /**
	 * 
	 */
	private static final long serialVersionUID = 1L; //Why do I need this suddenly?

//see if extends is necessary
	
	//Drawing lines
	public void paint(Graphics g) {
		
		//custom color
		String hexColor = new String("000000");
		g.setColor(Color.decode(hexColor));
		//draw a line (starting x,y; ending x,y)
		g.drawLine(126, 0, 126, 378);
	}
	
	public static void main(String[] args) {
		Board board = new Board();
		Frame sudoku = new Visual(board); //See if this is necessary
		Scanner scan = new Scanner(System.in);
		Graphics g;
		
		//Final variables
		String NUM_RANGE_REGEX = "[0-9]";
		
		//Dynamic variables
		
		//Do stuff here
		
		
		//TEST AREA
		//test print column
		try {
			Setup.genBoard(board);
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
			
		}
		
		
		board.updateAll(board.getSquareHM());
		board.updateUI();
		board.makeBoardVisible();
		Setup.saveSolution(board);
		
		//Fix value bug
		for (Square cell: board.getSquaresLs()) {
			cell.setNewText(cell.getValue());
		}
		
		//Close scanner
		scan.close();
	}

}
