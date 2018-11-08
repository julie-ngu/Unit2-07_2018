/****************************************************************************
 *
 * Created by: Julie Nguyen
 * Created on: Oct 2018
 * Created for: ICS4U
 * Bike (motorcycle) subclass (child class) of Vehicle class for vehicle program
 *
 ****************************************************************************/

public class Bike extends Vehicle {
	
	public Bike(String license,
				String colour) {
		
		super(license, colour, 2); //inherits properties from superclass constructor
	}
}