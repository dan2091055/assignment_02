/**Name: Daniel Martinez
 *Assignment #: 2
 *Description: this assignment is a calculator
 */
package cse360assign2;

public class AddingMachine {

	private int total;
	
	
	
	String CalcHistory = "0";//this is going to be 
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {//this is going to be getting the total
		return total;
	}
	
	public void add (int value) {//this is the add function
		CalcHistory += " + " + Integer.toString(value);
		
		total = total += value;
		
		
		
	}
	
	public void subtract (int value) {//this is the subtract function
		
		CalcHistory += " - " + Integer.toString(value);
		
		total = total-= value;
	
	}
		
	public String toString () {
	
		return CalcHistory;
	}

	public void clear() {
		
		CalcHistory = "";
		total = 0;
	
	}
}
