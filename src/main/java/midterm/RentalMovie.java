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
public class RentalMovie extends Movie {
 public String _name;
 public int _daysRented;
 public String  tape;
 public int _priceCode;

public int daysRented() {
return _daysRented;
}

public RentalMovie() {

}
public RentalMovie(String name, int daysRented) {
_name = tape;
_daysRented = daysRented;
}

public RentalMovie(int priceCode) {
_priceCode=priceCode;
}

    @Override
    public int priceCode() {
return _priceCode;
}

     public static int priceCode(String name, int priceCode){
	 if(priceCode <5){
		 
		 System.out.println("This is a rental movie ");
	 }
		 else
		
		 
		System.out.println("This is a purchased movie");
	    return 0;
	 
	 
 }

	
} 









