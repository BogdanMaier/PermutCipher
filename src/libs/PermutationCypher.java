package libs;

import java.util.Arrays;

public class PermutationCypher {
	private char crypTextMatrix[][];
	private char crypTempMatrix[][];
	private char keys[][];

	public PermutationCypher(String key, String msg) {
		buildMatrix(key, msg);
	}

	private void buildMatrix(String key, String msg) {
		if (msg.length() % key.length() == 0)
			crypTextMatrix = new char[msg.length() / key.length()][key.length()];
		else
			crypTextMatrix = new char[msg.length() / key.length() + 1][key.length()];

		System.out.println("\nBuilding Matrix \n-- Status: " + msg.length()
				/ key.length() + " * " + key.length());

		int row = 0;
		int column = 0;
		for (int index = 0; index < msg.length(); index++) {
			if (column == key.length()) {
				column = 0;
				row++;
			}
			crypTextMatrix[row][column] = msg.charAt(index);
			column++;
		}
		System.out.println("\n -- 1. Text:\n" + readMatrixAsString(crypTempMatrix));
		crypTempMatrix = crypTextMatrix;
		System.out.println("\n -- 2. Text:\n" + readMatrixAsString(crypTempMatrix));

		getKeysSet(key);
		orderMatrix();
		System.out.println("\n -- TEXT:\n" + readMatrixAsString(crypTextMatrix));
		System.out.println("\n -- TEMP:\n" + readMatrixAsString(crypTempMatrix));

	}

	private void getKeysSet(String key) {
		keys = new char[2][key.length()];
		char[] orderedKeyChars = key.toCharArray();
		Arrays.sort(orderedKeyChars);
		keys[0] = key.toCharArray();
		keys[1] = orderedKeyChars;

		for (char[] cL : keys) {
			System.out.println("~ " + Arrays.toString(cL));
		}
	}

	private int findNewPosition(char x) {
		for (int i = 0; i < keys[0].length; i++) {
			if (keys[1][i] == x){
				System.out.println("- KEYS: - " + x + " new at " + i);
				return i;
			}
		}
		return -1;
	}

	private void setNewColumnsOrder(int old, int nou) {
		System.out.println("pos :  " + old + " - " + nou);
		for (int i = 0; i < crypTempMatrix.length; i++) {
			for (int j = 0; j < crypTempMatrix[i].length; j++) {
				if (j == old) {
					System.out.println("- changing column ["+ i +"]["+ j +"] : + " + crypTempMatrix[i][nou] + " ~~~~ " + crypTextMatrix[i][old]);
					crypTempMatrix[i][nou] = crypTextMatrix[i][old];
				}
			}
		}
	}
	


	private void orderMatrix() {
		for (int i = 0; i < keys[0].length; i++) {
			int newSpot = findNewPosition(keys[0][i]);
			if(newSpot != -1){
				setNewColumnsOrder(i, newSpot);
			}
		}
	}

	private String readMatrixAsString(char[][] m){
		return Arrays.deepToString(m);
		
	}
	public String encrypt() {
		
		return null;
	}

	public String decrypt() {
		return null;
	}

}
