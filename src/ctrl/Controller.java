package ctrl;

import libs.PermutationCypher;

public class Controller {
	private PermutationCypher pc;
	
	public Controller(){
	}
	
	public String encrypt(String key, String msg){
		pc = new PermutationCypher( key,  msg);
		return pc.encrypt();
	}

	public String decrypt(String key, String msg){
		pc = new PermutationCypher( key,  msg);
		return pc.decrypt();
	}
}
