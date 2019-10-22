package co.binarylife.consolegame.util;

/**
 * Message class for all messages to player
 * @author tbl
 *
 */
public class Message {
	private String msg;
	
	/**
	 * Creates message object
	 * @param msg raw string of message
	 */
	public Message(String msg) {
		this.msg = msg;
	}
	
	/**
	 * Gets raw message of Message as String
	 * @return message as string
	 */
	public String getRawMessage() { 
		return msg;
	}
	
	/**
	 * Gets raw message of Message as String
	 * @return message as string
	 */
	public String toString() {
		return msg;
	}
	
	public void addTab() {
		
	}

}
