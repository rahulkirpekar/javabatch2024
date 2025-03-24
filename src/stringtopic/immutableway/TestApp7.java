package stringtopic.immutableway;

import java.util.Scanner;

/*
 ===> You are developing a search functionality for a library management system. 
		 A user can type a keyword to find books whose titles contain that keyword. 
		 Implement the logic to check if a book title contains the keyword.
*/
public class TestApp7 
{
	public static void main(String[] args) 
	{
		 String[] bookTitles = 
			 	  {
		            "Effective Java",
		            "Clean Code",
		            "The Pragmatic Programmer",
		            "Head First Java",
		            "Java: The Complete Reference"
		        };
		
		 Scanner scanner = new Scanner(System.in);
	     System.out.println("Enter a keyword to search for books:");
	     String keyword = scanner.nextLine();

	     boolean found = false;
	     System.out.println("Books containing the keyword:");
		
	     for(int i = 0 ; i< bookTitles.length;i++) 
	     {
	    	 if(bookTitles[i].contains(keyword)) 
	    	 {
	    		 System.out.println("- " + bookTitles[i]);
	             found = true;
	    	 }
	     }
	     
	     if (!found) 
	     {
	            System.out.println("No books found with the given keyword.");
	     }
	     scanner.close();
	}
}
