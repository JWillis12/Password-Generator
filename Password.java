/*
 * Write a program that will generate a strong password derived from
 * the user’s input:
 */
package password;

import java.util.Scanner;
import java.util.Random;
/**
 * Joshua Willis     COMP 163-001
 * @author Joshua
 */
public class Password {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in); //initialize user input
        String password;  //initialize strings and integers
        String firstName;
        String lastName;
        int favNumber;
        String favNumberAsString; //have to convert int into strings to
        String cityOfBirth;       //manipulate them
        Random rand = new Random();     //used for the random number generation
        int randNumber;
        String randNumberAsString;
        
        System.out.print("Please enter your first name: "); //Ask for first name
        firstName = user.next();
        password = firstName.substring(0, 1).toUpperCase() //takes the first and
                + firstName.substring(1, 2).toLowerCase(); //second characters of
        System.out.println("Pwd so far: " + password);     //the string
        //prints the password so far
        
        System.out.print("Please enter your last name: ");
        lastName = user.next();
        password = password + lastName.substring(0, 1).toUpperCase()
                + lastName.substring(1, 2).toLowerCase();
        System.out.println("Pwd so far: " + password); //similar to how first
        //name was used in the creation of the password but now adds on the
        //characters from the last name to the already existing password
        
        System.out.print("Please enter your 2-digits favorite number: ");
        favNumber = user.nextInt();
        favNumberAsString = "" + favNumber; //converts favNumber to a string so
        password = password + favNumberAsString.charAt(0) // it can be
                + "^" + favNumberAsString.charAt(1);      // manipulated
        // the int favNumber must be converted into a string so that the "^" 
        //character can be added between numbers
        System.out.println("Pwd so far: " + password);
        
        System.out.print("Please enter your City of Birth: ");
        cityOfBirth = user.next();
        password = password + cityOfBirth.substring(0, 1).toUpperCase()
                + cityOfBirth.substring(1, 2).toLowerCase();
        System.out.println("Pwd so far: " + password); 
        //continues to build the password
        
        randNumber = rand.nextInt(89)+10;
        // generates random numbers between 10 and 99 as a two digit number
        // has to be generated.
        System.out.println("Your 2-digits random number: " + randNumber);
        randNumberAsString = "" + randNumber;
        password = password + randNumberAsString.charAt(0)
                + "." + randNumberAsString.charAt(1);
        // the int randNumber must be converted into a string so that the "." 
        // character can be added between numbers
        System.out.println("Your final password is: " + password);
        //prints final password

        
    }
    
}
