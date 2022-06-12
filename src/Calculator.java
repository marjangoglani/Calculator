import java.util.Scanner;  // Import the Scanner class

public class Calculator {
    // ask the user for input
    // if number, ask for another input
    // if operation, ask for another input. if input is (1. operation, change the previous operation to the new one. 2. number, do the operation. 3. equals, do the operation with the previous number inputted)
    /* notes:
        input strings and if the string is a number, then the rest lmao, else it's an operation
    */


    public static double calculate(double a, double b, String operation){

    }


    // we keep calling the calculate function for each input whatever
    public static void main(String args[]){
        double a = 0;
        double b = 0;
        String operation = "";
        double returnStatement = 0;


        Scanner myScanner = new Scanner (System.in); // inputs string
        String str = myScanner.next();
        System.out.println("input: ");
        // fixme: error check when numbers and operations are mixed, or when alphabet "123g" & "123-" & "123#" &"gh" are invalid inputs
        if (str.equals("=")){ // if input is =
            // keep calling the scanner object and input something
        }
        else if (str.equals("+") || str.equals("-") || str.equals("*") ||str.equals("/")){ // if input is an operation
            operation = str;
            calculate(a, b, operation);
        }
        try { // if it's a number (double)
            returnStatement = Double.parseDouble(str);

        } catch (NumberFormatException e) {
            System.out.println("Input String cannot be parsed to Integer.");
        }

    }
}
