import java.io.File;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileTest {
public static void main(String[] args) {
    File file = new File("/home/oracle/Desktop/customers.txt");
    LinkedList<Customer> customers = new LinkedList<Customer>();
    PrintWriter writer = null;
    try {
    	writer = new PrintWriter(new File("output.txt"));
        Scanner sc = new Scanner(file);
        sc.useDelimiter("\\t|\\n");
        while(sc.hasNextLine()){
        	Customer c = new Customer();
        	c.setFullName(sc.next());
        	c.setTitle(sc.next());
        	c.setFirstName(sc.next());
        	c.setLastName(sc.next());
        	c.setStreetAddress(sc.next());
        	c.setCity(sc.next());
        	c.setState(sc.next());
        	c.setZipCode(sc.next());
        	c.setEmailAddress(sc.next());
        	c.setPosition(sc.next());
        	c.setCompany(sc.nextLine());            	
        	
        	System.out.println("Full name: " + c.getFullName());
        	System.out.println("Title: " + c.getTitle());
        	System.out.println("First name: " + c.getFirstName());
        	System.out.println("Last name: " + c.getLastName());
        	System.out.println("Street address: " + c.getStreetAddress());
        	System.out.println("City: " + c.getCity());
        	System.out.println("State: " + c.getState());
        	System.out.println("Zip code: " + c.getZipCode());
        	System.out.println("Email: " + c.getEmailAddress());
        	System.out.println("Position: " + c.getPosition());
        	System.out.println("Company: " + c.getCompany());
        	
        	customers.add(c);
        	
        	writer.println(c.getFullName());
        	writer.println(c.getEmailAddress());
        }       
        sc.close();
    } 
    catch (FileNotFoundException e) {
        e.printStackTrace();
    }
 }
}
