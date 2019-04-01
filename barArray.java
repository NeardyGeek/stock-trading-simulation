package Plattern;

/*Design an code a class barArray as a wrapper to a vector of bars
 * it will have the following private member variables
 * A Vector of bars  Vector<bar> v 
 * symbol of the security
 * Path to the file containing the data for that symbol (files will of the form 
 * path/symbol_daily.csv eg. if my data is in C:/Prof/Data so the file for 
 * GOOGL will be in C:/Prof/Data/GOOGL_Daily.csv 
 * A default constructor that creates a default vector
 * A constructor that accepts a size of the vector and creates a vector fo that sise.
 * Methods: 
 * At(int index) returns the bar at that index
 * insert (Bar ) same as insertFront 
 * insertFront(Bar ) 
 * insertBack(Bar )
 * bar remove() same as removeBack() 
 * bar removeFront() 
 * print() will print all the bars in the array
 * int size() return the number of bars in the Vector
 * resize() changes the soze of the Vector
 *VERY IMPORTANT!!
 *boolean load() //will load the data from the file into the Vector (make sure to remove the first line)
 * 
 */

import java.util.*;

public class barArray {

//has member Vector of bars
Vector<Bar> list;

public barArray() {
	list = new Vector<Bar>(4000);
}

public barArray(int s) {
	list = new Vector<Bar>(s);
}

public barArray(int s, int incr) {
	list = new Vector<Bar>(s, incr);
}

//method to insert a bar at specific index
public void insert(Bar b) {

	list.addElement(b);
}

public Bar elementAt(int index) {
	return list.elementAt(index);
}

public int size() {
	return list.size();
}

}