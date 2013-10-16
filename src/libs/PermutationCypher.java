package libs;

import java.util.Arrays;

public class PermutationCypher {
	private char crypTextMatrix[][];
	private char crypTempMatrix[][];
	private char keys[][];

	public PermutationCypher(String key, String msg, boolean decrypt) {
		buildMatrix(key, msg, decrypt);
	}

	private void buildMatrix(String key, String msg, boolean decrypt) {
		if (msg.length() % key.length() == 0)
			crypTextMatrix = new char[msg.length() / key.length()][key.length()];
		else
			crypTextMatrix = new char[msg.length() / key.length() + 1][key.length()];

		crypTempMatrix = new char[crypTextMatrix.length][crypTextMatrix[0].length];

		extractMsg(key, msg);
		if (decrypt) {
			getKeysSet(key);
			char[]temp = new char[key.length()];
			System.arraycopy(keys[1],0, temp, 0, key.length());
			System.arraycopy(keys[0],0, keys[1], 0, key.length());
			System.arraycopy(temp,0, keys[0], 0, key.length());
			
		}
		else
			getKeysSet(key);
		orderMatrix();
	}

	private void extractMsg(String key, String msg) {
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
		for (int i = 0; i < crypTextMatrix.length; i++) {
			for (int j = 0; j < crypTextMatrix[i].length; j++) {
				if (j == old) {
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
	public String encrypt(String key, String msg) {
		return buildMsg();
	}

	public String decrypt(String key, String msg) {
		return buildMsg();
	}
	
	private String buildMsg(){
		StringBuilder buildingMsg = new StringBuilder();
		for (int index = 0; index < crypTempMatrix.length; index++) {
			buildingMsg.append(crypTempMatrix[index]);
		}
		System.out.println("From matrix: " + buildingMsg.toString().trim());
		return buildingMsg.toString().trim();
	}

}
