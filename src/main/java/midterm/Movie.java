/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm;

/**
 *
 * @author Jimmy Kessie
 */
public class Movie {
  
    
public static final int CHILDREN = 2;
public static final int REGULAR = 0;
public static final int NEW_RELEASE = 1;

private int _priceCode;
private String _name;
private int _category;

public Movie(){
	
        }

 public static int priceCode(String name, int price){
	 if(price <5){
		 
		 System.out.println("This is a rental movie ");
	 }
		 else
		
		 
		System.out.println("This is a purchased movie");
	    return 0;
	 
 }

public Movie(String name) {
_name = name;
}

public Movie(int priceCode) {
_priceCode = priceCode;
}

public int priceCode() {
return _priceCode;
}

public String name() {
return _name;
}
}






