package app;
import model.*;

import java.util.Date;
import java.util.Scanner;

public class App {

	static User currentUser = null;
	// TO DO: read files users, social activities, messages

	// start program: let user choose between register and login
	public static Scanner userInput1 = new Scanner(System.in);

	public static void main(String[] args) {

		while(true) {

			System.out.println("Choose '1' for login, choose '2' for register.");
			// TO DO: check if response is an integer

			int userResponse = userInput1.nextInt();
			if (userResponse == 1) {
				logIn();
				break;
			} else if (userResponse == 2) {
				register();
				break;
			} else {
				System.out.println("Please enter either '1' or '2'.");
			}	
		}


		while(true) {

			System.out.println("Choose:");
			System.out.println("'1' to create a social activity");
			System.out.println("'2' to see all your social activities");
			System.out.println("'3' to search in all existing social activities");
			System.out.println("'4' to exit");

			int userResponse = userInput1.nextInt();
			if (userResponse == 1) {
				currentUser.createSocialActivity(name, timestamp, category, description, location);
				break;
			} else if (userResponse == 2) {
				// TO DO: go to method getSocialActivities()
				break;
			} else if (userResponse == 3) {
				// TO DO: go to filterSocialActivities()
				// TO DO: go to selectSocialActivities()
				// TO DO: go to sendRequest()
				break;
			} else if (userResponse == 4) {
				System.out.println("Goodbye!");
				break;
			} else {	
				System.out.println("Please enter either '1', '2', '3' or '4'.");
			}	
		}

	}

	public static User logIn() {

		System.out.println("Please enter your username: ");
		String username = userInput1.nextLine();

		System.out.println("Please enter your password: ");
		String password = userInput1.nextLine();

		// TO DO: search for the combination of username and password in the userlist

	}

	public static User register() {

	}


}
