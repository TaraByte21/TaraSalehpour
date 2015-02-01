/**
 * 
 */
package edu.asu.bmi.cda.salehpour_1;
/**
 * @author TS
 *
 */
public class Patient {

	// -----------------------------------------------------------------
	//   instance variables
	// -----------------------------------------------------------------
	private String id;
	private String name;
	private int age;
	
	// -----------------------------------------------------------------
	//   constructor
	// -----------------------------------------------------------------
	public Patient(String initID, String initName, int initAge) 
	{
		id = initID;
		name = initName;
		age = initAge;
	}
	// -----------------------------------------------------------------
	//   toString
	// -----------------------------------------------------------------
	public String toString()
    {
        return (id+" "+name+" "+age);
    }
	
}
