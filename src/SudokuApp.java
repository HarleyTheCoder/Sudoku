import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
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

public class SudokuApp extends Frame { //see if extends is necessary
	
	private Board board;
	
	//Constructor
	public SudokuApp(Board board) {
		this.board = board;
		
		//Create frame
		JFrame frame = new JFrame("Harley's Sudoku Game");
		//Make program exit when you close it
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		//Set dimensions
		frame.setSize(600,600);
		//lock frame
		frame.setResizable(false);
		//Set layout
		frame.setLayout(null); 
		//Show the frame
		frame.setVisible(true);
			
		//Image icon - add later
		//ImageIcon icon = createImageIcon("");
				
		/*//Area for title
		JPanel titlePanel = new JPanel(); //Create panel for title
		titlePanel.setSize(frame.getWidth(), 550);
		//titlePanel.setBounds(0, 0, frame.getWidth() - 50, 45); 
		titlePanel.setBackground(Color.WHITE);
		titlePanel.setAlignmentX(CENTER_ALIGNMENT);
		titlePanel.setAlignmentY(TOP_ALIGNMENT);
		//Set Title
		JLabel title = new JLabel("Let's Play Sudoku!");
		//Set the font
		title.setFont(new Font("Serif", Font.BOLD, 20));
		//Set alignment
		title.setAlignmentX(CENTER_ALIGNMENT);
		//Add Panel to frame
		//Add title to panel
		titlePanel.add(title);
		*/
		
		//Panel for sudoku board
		board.setBounds(20, 20, 500, 500); 
		board.setBackground(Color.WHITE);
		board.setAlignmentX(CENTER_ALIGNMENT);
		//test for creating SquareGroup
		int[][] values = new int[3][3];
		boolean[][] solids = new boolean[3][3];
		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 3; b++) {
				values[a][b] = 8;
				solids[a][b] = false;
			}
		}
		
		
		frame.add(board);
		//Add it all to the frame
		//frame.add(titlePanel);
		//frame.add(boardPanel);
				
	}

	public JPanel getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}
	
	
	public static void main(String[] args) {
		Board board = new Board();
		new SudokuApp(board); //See if this is necessary
		Scanner scan = new Scanner(System.in);
		
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
		
		//Close scanner
		scan.close();
	}

}
