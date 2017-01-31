package com.company;
import java.util.Scanner;

public class Main {

    /*
    This is the method to get the user input and validate
     */

    public static int GetUserNum(String userName) {
        // Variable declarations
        int userNum = 0;                        // user's number
        Scanner scan = new Scanner(System.in);  // Scanner object to get user input

        // Prompt User
        System.out.print(userName + ", please enter an integer between 1 and 100: ");
        userNum = scan.nextInt();

        // Loop to keep prompting user until valid number is entered.
        while (userNum < 1 || userNum > 100) {
            System.out.println(userName + ", that is not a valid input.  Please try again.\n");

            System.out.print(userName + ", please enter an integer between 1 and 100: ");
            userNum = scan.nextInt();
        }

        // New line to make it easier to see
        System.out.println("");

        // Return valid userNum
        return userNum;
    }

    /*
    This method asks the user if they want to continue the program or not
     */
    public static boolean AskUserToContinue() {
        // Variable declarations
        String userInput = "";                  // User input string
        Scanner scan = new Scanner(System.in);  // Scanner object for user input

        // Prompt user to enter yes or no
        System.out.print("Do you want to continue? (y/n): ");
        userInput = scan.nextLine();
        System.out.println("");

        // Validate whether user input is ok, and continue asking until right
        while ( !userInput.equalsIgnoreCase("y") &&
                !userInput.equalsIgnoreCase("yes") &&
                !userInput.equalsIgnoreCase("n") &&
                !userInput.equalsIgnoreCase("no") ) {
            System.out.print("That is not a valid input.  Please try again.\n");
            System.out.print("Do you want to continue? (y/n): ");
            userInput = scan.nextLine();
            System.out.println("");
        }

        // Return true if user says yes, and false if user says no
        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
            return true;
        }
        else {
            return false;
        }
    }

    /*
    This is the method that prints the appropriate messages based on user input
     */
    public static void PrintResults(int number, String userName) {

        // Confirm what the user entered
        System.out.println(userName + ", you entered " + number + ".");

        // Is the number odd or even?
        if (number % 2 == 0) {
            // Start even number branch

            // If the integer entered is even and in the inclusive range of 2 to 25
            if (number >= 2 && number <= 25) {
                System.out.println("Even and less than 25.\n");
            }

            // If the integer entered is even and in the inclusive range of 26 to 60
            if (number >= 26 && number <= 60) {
                System.out.println("Even.\n");
            }

            // If the integer entered is even and greater than 60
            if (number > 60) {
                System.out.println(number + " and Even.\n");
            }
        }
        else {
            // Start odd number branch

            // If the integer entered is odd, (adding extra condition, since number + and odd may print twice for
            // both odd conditions
            if (number <= 60) {
                System.out.println(number + " and Odd.\n");
            }

            // If the integer entered is odd and greater than 60
            if (number > 60) {
                System.out.println(number + " and Odd.\n");
            }
        }

    }

    /*
    This method asks for the user name and returns the name
     */
    public static String GetUserName() {
        // Variable declarations
        String userName = "";                   // String object to hold user name
        Scanner scan = new Scanner(System.in);  // Scanner object to get user input

        // Prompt user to enter name
        System.out.print("What is your name?  Enter here: ");
        userName = scan.nextLine();
        System.out.println();
        System.out.println("Hi " + userName + "!  Nice to meet you!\n");

        // Return the user name
        return userName;
    }

    /*
    This is the main program
     */
    public static void main(String[] args) {
	    // Variable declarations
        int userNum = 0;                // user's number
        boolean continueProgram = true; // boolean to determine whether program should continue
        String userName = "";           // String object to hold user name

        // Welcome statement
        System.out.println("Welcome to the Java Bootcamp Lab Number 2 program! \n");

        // Get user name
        userName = GetUserName();

        while (continueProgram) {
            // Ask the user for an input
            userNum = GetUserNum(userName);

            // Print the results
            PrintResults(userNum, userName);

            // Ask the user if they want to continue
            continueProgram = AskUserToContinue();
        }

        // Exit message
        System.out.println("Thanks for playing " + userName + "!  See you next time!");

    }
}
