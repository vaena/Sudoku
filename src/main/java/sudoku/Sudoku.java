package sudoku;


/**
 * Abstract class Sudoku<br>
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public abstract class Sudoku implements Help
{
	/**
	 * Πίνακας από Sectors. Το μέγεθος εξαρτάται απο το αν είναι Duidoku ή Sudoku<br>
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Sector pinakas2;
	
	/**
	 * Ο παίκτης που παίζει αυτό το παιχνίδι<br>
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public PersonPlayer player;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Sudoku(){
		super();
	}

	/**
	 * ελέχγει γραμμές και στήλες<br>
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public boolean checkLine() {
		// TODO : to implement
		return false;	
	}
	
	/**
	 * έλεγχος για λάθος εισαγωγή αριθμού. Επιστρέφει το κελί στο οποίο έγινε λάθος<br>
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Cell mistakeFound() {
		// TODO : to implement
		return new Cell("0");	
	}
	
	/**
	 * abstract method φορτώνει το παιχνίδι από τον σκληρό δίσκο<br>
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public abstract void loadGame();
	
	/**
	 * abstract method αποθήκευση τρέχουσας κατάστασης παιχνιδίου
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public abstract void saveGame();
	
	/**
	 * abstract method συνέχιση του προηγούμενου παιχνιδιού
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public abstract void continueGame();
	
	/**
	 * βοήθεια για τον χρήστη<br>
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void help() {
		// TODO : to implement	
	}
	
}

