package lockedMePack;

import java.util.Scanner;

public class LockedMeChoiceHandle {

	//This method will handle choices made in the Main Menu
	public static void firstMenuHandleChoices(){
		LockedMeWelcome.mainMenu();
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
					System.out.println("\nPlease enter the 1,2 or 3 option to proceed");
					firstMenuHandleChoices();
			}
		} catch (Exception e){
			System.out.println("\nPlease enter the 1,2 or 3 option to proceed");
			firstMenuHandleChoices();
		}
	}

	//This method will handle choices made in the Sub Menu
	public static void secondMenuHandleChoices(){
		LockedMeWelcome.subMenu();
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
					System.out.println("\nPlease enter the 1,2 or 3 option to proceed.");
			}
			secondMenuHandleChoices();
		} catch (Exception e){
			System.out.println("\nPlease enter the 1,2 or 3 option to proceed.");
			secondMenuHandleChoices();
		}
	}
}
