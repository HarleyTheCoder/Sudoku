import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Visual extends JFrame {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Board board;
	private int function = 0;
	private String message = "message";
	private JTextArea messageArea = new JTextArea(message);
	
	//Constructor
	public Visual(Board board) {
		this.board = board;
		
		
		
		//Create frame
		JFrame frame = new JFrame("Harley's Sudoku Game");
		//Make program exit when you close it
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		//Set dimensions
		frame.setSize(700,600);
		//lock frame
		frame.setResizable(false);
		//Set layout
		frame.setLayout(null); 
		//Show the frame
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.CYAN);
		
		JPanel backdrop = new JPanel();
		backdrop.setSize(frame.getWidth(), frame.getHeight());
		backdrop.setBackground(Color.CYAN);
		
			
		//Image icon - add later
		//ImageIcon icon = createImageIcon("");
				
		//Area for title
		JPanel titlePanel = new JPanel(); //Create panel for title
		titlePanel.setSize(frame.getWidth() / 2, 50);
		//titlePanel.setBounds(0, 0, frame.getWidth() - 50, 45); 
		titlePanel.setBackground(Color.WHITE);
		titlePanel.setBounds(120, 4, 460, 50);
		titlePanel.setAlignmentY(TOP_ALIGNMENT);
		//Set Title
		JLabel title = new JLabel("Let's Play Sudoku!");
		//Set the font
		title.setFont(new Font("Serif", Font.BOLD, 30));
		title.setForeground(Color.BLACK);
		title.setAlignmentX(CENTER_ALIGNMENT);
		//Add Panel to frame
		//Add title to panel
		messageArea.setBounds(206, 60, 100, 50);
		messageArea.setFont(new Font("Serif", Font.PLAIN, 20));
		messageArea.setVisible(true);
		messageArea.setEditable(false);
		titlePanel.add(title);
		
		//Side Panel - new game
		JPanel gamePanel = new JPanel();
		gamePanel.setBounds(0, 95, 100, 454);
		JTextArea whatDifficulty = new JTextArea("What difficulty would \nyou like to play?");
		whatDifficulty.setFont(new Font("Serif", Font.BOLD, 20));
		whatDifficulty.setBounds(8, 95, 190, 300);
		whatDifficulty.setOpaque(false);
		whatDifficulty.setEditable(false);
		whatDifficulty.setAlignmentX(CENTER_ALIGNMENT);
		gamePanel.add(whatDifficulty);
		frame.add(whatDifficulty);
		
		
		//Side Panel - game buttons
		//JPanel buttons = new JPanel();
		
		
		//Panel for sudoku board
		board.setBounds(200, 85, 454, 454); 
		board.setBackground(Color.CYAN);
		board.setAlignmentX(CENTER_ALIGNMENT);
		board.setAlignmentY(CENTER_ALIGNMENT);
		
		
		
		
		//frame.add(backdrop);
		frame.setForeground(Color.CYAN);
		frame.add(board);
		//Add it all to the frame
		frame.add(titlePanel);
		//frame.add(boardPanel);
		frame.add(messageArea);
				
	}
	
	
	
	public int getFunction() {
		return function;
	}



	public void setFunction(int function) {
		this.function = function;
	}



	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public JTextArea getMessageArea() {
		return messageArea;
	}


	public void setMessageArea(JTextArea messageArea) {
		this.messageArea = messageArea;
	}

	public JPanel getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}
	
}
