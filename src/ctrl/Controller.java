package ctrl;

import libs.PermutationCypher;

public class Controller {
	private PermutationCypher pc;
	
	public Controller(){
	}
	
	public String encrypt(String key, String msg, boolean decrypt){
		pc = new PermutationCypher( key,  msg, decrypt);
		return pc.encrypt(msg, msg);
	}

	public String decrypt(String key, String msg, boolean decrypt){
		pc = new PermutationCypher( key,  msg, decrypt);
		return pc.decrypt(msg, msg);
	}
}
