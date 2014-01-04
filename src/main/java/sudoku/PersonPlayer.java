package sudoku;

import java.util.ArrayList;

public class PersonPlayer extends Player
{
	/**
	 * τα παιχνίδια που εχει ήδη παίξει ο παίκτης
	 */
	
	public ArrayList<Sudoku> playedGames;
	
	/**
	 * constructor της κλάσης PersonPlayer
	 */
	public PersonPlayer() {
		super();
		// TODO : construct me	
	}
	
	/**
	 * μέθοδος για την προσθήκη sudoku στο ArrayList&nbsp;
         * @param parameter
	 * @generated
	 * @ordered
	 */
	
	public void addPlayedGames(String parameter) {
		// TODO : to implement	
	}
        
        public ArrayList<Sudoku> getPlayedGames(){
            return playedGames;        
        }	
}