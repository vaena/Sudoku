package sudoku;


/**
 * Abstract class, υπάρχει απλά για την περίπτωση επέκτασης που θέλουμε να επιλύει το computerplayer αυτόματα προβλήματα
 */

public abstract class Player extends PersonPlayer
{

	
	private String nickname;
	
	public Player(){
	}
        
        public Player(String n){
            super();
            nickname = n;
        }

	/**
	 * αλλάζει το nickname
         * @param n
	 */
	public void setNickname(String n) {
            nickname = n;
	}
	
	/**
	 * μας επιστρέφει το nickname
         * @return 
	 */
	public String getNickname() {
		return nickname;	
	}
	
}

