package lockedMePack;

import java.util.Scanner;

public class LockedMeInputHandling {

	//This method will handle choices made in the Main Menu
	public static void firstMenuHandleChoices(){
		LockedMeWelcomeScreen.mainMenu();
		try{
			Scanner scanner = new Scanner(System.in);
			int choiceEntered = scanner.nextInt();
			switch(choiceEntered){
				case 1:
					LockedMeFileHandling.displayAllFiles();
					firstMenuHandleChoices();
					break;
				case 2:
					secondMenuHandleChoices();
					break;
				case 3:
					System.out.println("\nApplication Closed Successfully.");
					System.exit(0);
				default :
					printErrorMessage();
					firstMenuHandleChoices();
			}
		} catch (Exception e){
			printErrorMessage();
			firstMenuHandleChoices();
		}
	}

	//This method will handle choices made in the Sub Menu
	public static void secondMenuHandleChoices(){
		LockedMeWelcomeScreen.subMenu();
		try{
			Scanner scanner = new Scanner(System.in);
			int choiceEntered = scanner.nextInt();
			switch(choiceEntered){
				case 1:
					System.out.println("\nPlease Enter the name of the File you want to add -");
					String addingFileName = scanner.next();
					LockedMeFileHandling.addFiles(addingFileName);
					break;
				case 2:
					System.out.println("\nPlease Enter the name of the File you want to delete -");
					String deleteFileName = scanner.next();
					LockedMeFileHandling.deleteFiles(deleteFileName);
					break;
				case 3:
					System.out.println("\nPlease Enter the name of the File you want to search -");
					String searchFileName = scanner.next();
					LockedMeFileHandling.searchFiles(searchFileName);
					break;
				case 4:
					firstMenuHandleChoices();
				default :
					printErrorMessage();
			}
			secondMenuHandleChoices();
		} catch (Exception e){
			printErrorMessage();
			secondMenuHandleChoices();
		}
	}

	public static void printErrorMessage(){
		System.out.println("\nPlease enter only 1,2 or 3.");
	}
}
