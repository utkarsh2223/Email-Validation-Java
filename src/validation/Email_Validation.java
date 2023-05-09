package validation;
import java.util.Scanner;

public class Email_Validation {
	
	private String[] strings;
	  public Email_Validation(String[] strings) {
	        this.strings = strings;
	    }
	  
	  public boolean search(String searchString) {
	        for (String str : strings) {
	            if (str.equals(searchString)) {
	                return true;
	            }
	        }
	        return false;
	    }
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] strings = {"davyutkarsh22@gmail.com", "xyz@gmail.com", "abc@reddit.com", "pqr@gmail.com"};
	        Email_Validation stringSearch = new Email_Validation(strings);

	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the string to search: ");
	        String searchString = scanner.nextLine();

	        boolean found = stringSearch.search(searchString);

	        if (found) {
	            System.out.println("String found.");
	        } else {
	            System.out.println("String not found.");
	        }

	        scanner.close();

	}

}
