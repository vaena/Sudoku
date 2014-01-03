package sudoku;


/**
 * Κλάση που ασχολείται με τη λογική του παιχνιδιού.
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Logic
{
	/**
	 * HashMap με τους χρήστες και τα παιχνίδια που έχει παίξει ο καθένας<div><br></div>
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public PersonPlayer hashMap_users;
	
	/**
	 * δημιουργία αντικειμένου Player
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Player player1;
	

	/**
	 * constructor της κλάσης Logic
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Logic() {
		super();
		// TODO : construct me	
	}
	
	/**
	 * Εικονική αλλαγή νούμερων με γράμματα ,από πίσω θα τρέχουν τα νούμερα(ίσως με enum)
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void Wordoku(boolean p) {
		// TODO : to implement	
	}
	
	/**
	 * <div>χρήση του interface για τη βοήθεια</div><div><br></div>
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void help() {
		// TODO : to implement	
	}
	
	/**
	 * Περιπτωση 1,έχουμε τον χρήστη στο hashmap&nbsp;<div>και θέλουμε ενα arraylist με τα sudoku που δεν έχει παίξει, εδώ ανάλογα με το αν έχουμε&nbsp;</div><div>sudokugame ή hypersudoku ψάχνει αντίστοιχα από 1-10 ή από 11-20</div>
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void loadPlayer(String parameter, String parameter2) {
		// TODO : to implement	
	}
	
	/**
	 * καλείται στην περίπτωση που ο χρήστης είναι<div>περίπτωσης 2, και κάνει append στο αρχείο</div><div>που είναι αποθηκευμένο to hashmap &nbsp;ώστε να τον βάλει σαν εγγραφή</div>
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void savePlayer() {
		// TODO : to implement	
	}
	
	/**
	 * <div>αν nickname!=NULL</div>{<div>1)διατρέχουμε το hashmap για τα keys αν το βρούμε κάνουμε return1<div>2)αν δεν το βρούμε τότε return 2</div><div>}</div><div>else&nbsp;</div><div>3)return&nbsp;<span style="font-size: 0.8em;">3</span></div></div>
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public int typeOfPlayer(Player parameter) {
		// TODO : to implement
		return 0;	
	}
	
	/**
	 * 1)ο παίχτης υπάρχει&nbsp;<br><div>loadPlayer()</div><div>καλουμε RandomSudoku</div><div>add PlayedGames(ArrayList)</div><div>2)addPlayer ---&gt;HashMap</div><div><div>καλουμε RandomSudoku</div><div>add PlayedGames</div></div><div>savePlayer()</div><div>3)</div><div>καλουμε RandomSudoku</div><div><br></div><div><br></div><div><br><br></div>
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void playerMenu() {
		// TODO : to implement	
	}
	
	/**
	 * Δέχεται ArrayList από Integer που ανήκουν σε sudoku και επιστρέφει &nbsp;τυχαία ένα από αυτά<div>απο 1-10 για sudoku&nbsp;</div><div>από 11-20 για hyper.</div>
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public int randomSudoku(int parameter) {
		// TODO : to implement
		return 0;	
	}
	
	/**
	 * αν διαλέξει sudoku &nbsp;ή hyper<div>πρέπει να ενημερωθούν οι randomsudoku</div><div>kai i loadPlayer ώστε να μπουν στην αντίστοιχη&nbsp;</div><div>return s;(sudoku case)</div><div>return h;(hyper case)</div><div><br></div><div>αν διαλέξει duidoku τρέχει τελείως άλλο μενού</div><div>return d;(duidoku case)&nbsp;</div>
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public int chooseGame(int parameter) {
		// TODO : to implement
		return 0;	
	}
	
	/**
	 * υλοποιεί την εναλλαγή χρήστη computer στο Duidoku<div><br></div>
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void playDuidoku() {
		// TODO : to implement	
	}
	
}

