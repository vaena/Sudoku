package sudoku;


/**
 * Abstract class, υπάρχει απλά για την περίπτωση επέκτασης που θέλουμε να επιλύει το computerplayer αυτόματα προβλήματα
 */

public abstract class Player extends PersonPlayer
{

	
	private String nickname;
	
	public Player(){
		super();
	}

	/**
	 * αλλάζει το nickname
         * @param parameter
	 */
	public void setNickname(String parameter) {
		// TODO : to implement	
	}
	
	/**
	 * μας επιστρέφει το nickname
         * @return 
	 */
	public String getNickname() {
		return "";	
	}
	
}

