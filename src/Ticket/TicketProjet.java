package Ticket;

import java.util.Scanner;

public class TicketProjet {

	public static void main(String[] args) {
	
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Welcome to United Airline");
	 System.out.println("Please start your booking");
	 System.out.println("Please select your trip type One way or Round Trip?");
	 String trip = scanner.nextLine();
	 System.out.println("Your trip type is : "+ trip);
	 System.out.println("Select your Date please : "); 
	 int dat =scanner.nextInt();
	 System.out.println("your date is :"+dat);
	 System.out.println("select your Date Return please");
	 int dat1=scanner.nextInt();
	 System.out.println("your date returnis"+dat1);
	 System.out.println("thank you for useing United Airline");
	 
	 
		scanner.close();
		
		

	}

}
