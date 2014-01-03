package sudoku;
/*klasi pou prosomoiwnei to keli
 */
public class Cell
{
	private String value;//i timi tou 
	private int xcell;// i suntetagmeni x
	private int ycell;// i suntetagmeni y
	/*construstor*/
	public Cell(String value) {
		this.value=value;
		
	}
	
	public void setValue(String value) {
		this.value=value;	
	}
	
	
	public String getValue() {
		
		return value;	
	}
	
	
	public void setX(int xs) {
                xcell=xs;	
	}
	
	
	public void setY(int ys) {
		ycell=ys;
	}
	
	public int getX() {
		return xcell;	
	}
	
	public int getY() {
		return ycell;	
	}
	
}

