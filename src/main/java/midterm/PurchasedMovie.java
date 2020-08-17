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
public class PurchasedMovie extends Movie
{
    public boolean _active;
    public String _name;
    public int _daysRented;
    public int _priceCode;
 
public boolean isActive( ) {
    return _active;
}

public PurchasedMovie() {

}

public PurchasedMovie( String name , int daysRented) {
_name = name;
_daysRented = daysRented;
}

public PurchasedMovie(int priceCode) {
_priceCode=priceCode;
}

    @Override
    public int priceCode() {
return _priceCode;
}
   
     
	     
     public static int priceCode(String name, int priceCode){
	 if(priceCode > 5){
		 
		 System.out.println("This is a purchased movie ");
	 }
		 else
		
		 
		System.out.println("This is a rental movie");
	    return 0;
	 
	 
 }

	
}







