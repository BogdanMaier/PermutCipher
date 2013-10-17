Cryptography – Laboratory 1
Maier Tudor Bogdan
933

Permutation Cypher
	(Java 1.7 implementation, Swing Gui)

Description: 
Using two matrices we take the input string and build the first matrix with its characters.
Taking the key we build another matrix which contains 2 rows. First row the key, the secound row the alphabetically ordered key.
Using the key matrix we determin the new order of the key-length grouped characters and arrange them in the new order. 
The same idea is applied for decryption. 
The only difference is that the key matrix is build then swapped again, so it is populated.

Code explanation:
	private void buildMatrix(String key, String msg, boolean decrypt)
	Builds matrices for text and key

	private int findNewPosition(char x)
	having char x, the method finds is new position index 

	private void setNewColumnsOrder(int old, int nou)
	swaps the columns from tempMatrix using the ones from plainMatrix and the new indexes

	private void orderMatrix()
	calls findNewPosition and setNewColumnsOrder for ordering the matrix, 	preparing it for reading encrypted or decrypted