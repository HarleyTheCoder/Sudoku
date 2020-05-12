import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class JBoard extends JPanel {
	
	private final int WIDTH = 500;
	private final int LENGTH = 500;
	
	public JBoard() {
		this.setSize(WIDTH, LENGTH);
		this.setBackground(Color.WHITE);
		//this.setBorder(groupBorder);
	}
	
}
