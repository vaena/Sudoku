package sudoku;


public class Sector
{

	public Cell[][] pinakas;
	private int xsector;
	private int ysector;
	
	public String attribute;
	
	
	public boolean checkUnique(Cell[][] pinakas,String value) {                       
            Cell xstart=pinakas[0][0];
            Cell xend=pinakas[2][2];
            Cell temp = null;
            temp.setValue(value);
            for(int i=xstart.getX();i<xend.getX();i++)
            {   
                for(int j=xstart.getY();j<xend.getY();j++)
                    {
                        if(pinakas[i][j].getValue().equals(temp.getValue())){
                            return false;
                        }
                    }
            }
            return true;    		
	}
	
	
	public Sector() {
			
	}
	
	/**
	 * μέθοδος που π�?οσθέτει cell στον τομέα
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void addToSector(Cell parameter) {
		// TODO : to implement	
	}
	
	/**
	 * αλλάζει τo X
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void setX(int parameter) {
		// TODO : to implement	
	}
	
	/**
	 * αλλάζει το Υ
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void setY(int parameter) {
		// TODO : to implement	
	}
	
	/**
	 * επιστ�?έφει τo X
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public int getX() {
		// TODO : to implement
		return 0;	
	}
	
	/**
	 * επιστ�?έφει τo Y
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public int getY() {
		// TODO : to implement
		return 0;	
	}
	
}

