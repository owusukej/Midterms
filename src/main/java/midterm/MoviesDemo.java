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
import java.util.*;

public class MoviesDemo {
    


public static void main( String args [ ] ) {
	    
	   Scanner in= new Scanner(System.in);
	   
	    System.out.println("Welcome to the Movie Flex by Jimmy Kessie");
	   System.out.println("Would you like to rent to purchase a movie?");
		    
		 String movie=in.nextLine();
		 
		 System.out.println("What is the name of the movie?");
		 String name = in.nextLine();
		 

		 	   System.out.println("What is the price of the movie?");
			   
int price = in.nextInt();

	
		 Movie userselection = new RentalMovie();
			
	userselection.priceCode(name, price);
	
		 
    

} 
}












