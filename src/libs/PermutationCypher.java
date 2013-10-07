package libs;

import java.util.Arrays;

public class PermutationCypher {
	private char crypTextMatrix[][];
	
	public PermutationCypher(String key, String msg){
		buildMatrix(key, msg);
	}

	private void buildMatrix(String key, String msg){
		if (msg.length() % key.length() == 0)
			crypTextMatrix = new char[msg.length()/key.length()][key.length()];
		else
			crypTextMatrix = new char[msg.length()/key.length() + 1][key.length()];
		System.out.println("\nBuilding Matrix \n-- Status: " + msg.length()/key.length() + " * " +key.length());
		
		int row = 0;
		int column = 0;
		for (int index = 0; index < msg.length(); index++) {
			if (column == key.length()) {
				column = 0;
				row++;
			}
			crypTextMatrix[row][column] = msg.charAt(index);
			System.out.println("- adding char: " + msg.charAt(index) + " added: " + crypTextMatrix[row][column]);
			column++;
		}
		for (char[] cL : crypTextMatrix) {
			System.out.println("> " + Arrays.toString(cL));
		}
		orderMatrixByKey(key);
	}
	
	private void orderMatrixByKey(String k){
		
	}
	public String encrypt(){
		return null;
	}
	
	public String decrypt(){
		return null;
	}
	
}
