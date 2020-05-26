import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class GameMethods {
	
	public static int[][] getFromFile() {
		String dirPath = "src/";
		Path path = Paths.get(dirPath + "sudokuSolutions.txt");
		
		try {
			if (Files.notExists(path)) {
				Files.createFile(path);
			}
			
			List<String> allNums = Files.readAllLines(path);
			String gameNumsS = allNums.get(allNums.size() - 1);
			String[] gameNums = gameNumsS.split("~");
			int[][] nums = new int[9][9];
			int a = 0;
			
			for (int i = 0; i < 9; i++) {
				for (int n = 0; n < 9; n++) {
					nums[i][n] = Integer.parseInt(gameNums[a]);
					a++;
				}
			}
			
			return nums;
			
		} catch (IOException e) {
			System.out.println("Error loading file.");
			e.printStackTrace();
			return new int[9][9];
		}
		
	}
	
	//Get random integer in specified range
	public static int getRandom(int range) {
		int number = (int)(Math.random() * range) + 1;
		return number;
	}
	
	//Returns true or false at random
	public static boolean randomTrueFalse() {
		int random = (int)(Math.random() * 2) + 1;
		if (random == 1) {
			return true;
		} else {
			return false;
		}
	}
	
	//testing method - print row, column, group, etc.
	public static void printList(List<Square> list) {
		for (Square item: list) {
			System.out.print(item.getValue() + "");
		}
	}
	
}
