/* Ask the customer's age and for the time on a 24-hour clock 
 * (where noon is 12.00 and 4:30 PM is 16.30). The show timings 
 * are 10.15, 13.30, 18.00 and 22.00. The normal adult ticket price 
 * is $8.00, however, the adult matinee price is $5.00. Adults are 
 * those over 13 years. The normal children's ticket price is $4.00, 
 * however, the children's matinee price is $2.00. Write a program that
 *  determines the price of a movie ticket

Sample Input:

16

10.15

Sample Output:

$8.00 */

package challenge;

import java.util.Scanner;

public class TicketProblem {
	
	 static void ticket (int age ,float st ) {
		//for adult
		if (age>13) {
			if(st>=13.30 && st<=17.59)
				System.out.println("$5.0");
			else
				System.out.println("8.00");
		}
	
	
	
	
	//for child
			if (age>13) {
				if(st >=13.30 && st<=17.59)
					System.out.println("$2.0"); //matinne
				else
					System.out.println("4.00");
			}
		}



      public static void main(String[] args) {
    	  
    	Scanner s =new Scanner(System.in) 
    	int age =s.nextInt();
    	float st =s.nextFloat();
    	ticket(age,st);
    	  
    			  

      






	
	
	
    
   
    
    
    
    
    
    
    // GPT aproach
    
    
    
//    Scanner scanner = new Scanner(System.in);
//
//    // Get the customer's age and time on a 24-hour clock
//    System.out.print("Enter customer's age: ");
//    int age = scanner.nextInt();
//    System.out.print("Enter time (in 24-hour format, e.g. 10.15): ");
//    double time = scanner.nextDouble();
//
//    // Define ticket prices
//    double se = 8.00;
//    double matineeAdultTicketPrice = 5.00;
//    double normalChildrenTicketPrice = 4.00;
//    double matineeChildrenTicketPrice = 2.00;
//
//    // Check if it's a matinee show (before 17:00)
//    boolean isMatineeShow = time < 17.00;
//
//    // Determine if the customer is an adult or a child
//    boolean isAdult = age > 13;
//
//    // Calculate the ticket price based on age and show time
//    double ticketPrice;
//    if (isAdult) {
//        ticketPrice = isMatineeShow ? matineeAdultTicketPrice : normalAdultTicketPrice;
//    } else {
//        ticketPrice = isMatineeShow ? matineeChildrenTicketPrice : normalChildrenTicketPrice;
//    }
//
//    // Display the ticket price
//    System.out.println("Ticket price: $" + String.format("%.2f", ticketPrice));
//
//    scanner.close();
	
	

}
