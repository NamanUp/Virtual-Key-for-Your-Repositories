package lockedMePack;

public class LockedMeWelcome {
	
	public static void printWelcomeScreen(String applicationName, String developerName){
		
		System.out.println("--------------------------------Welcome to "+applicationName+"!--------------------------------");
		
		System.out.println("----------------My Name is "+developerName+", the developer of this application---------------\n");

		System.out.println("\nThe Directory which will be used for this Application is \n"+LockedMeFileHandling.mainPackage
				+"\nNote -> If this Directory is not there then it will be made as soon as you create one File.");
	}
	
	public static void firstMenu(){
		System.out.println("\nMain Menu- \n");
		
		System.out.println("1. Retrieve all the existing files from a directory.\n"+
				"2. Add, Delete or Search the files.\n"+
				"3. Exit from the application.\n");
		
		System.out.print("Enter the choice from the above operations here - ");
	}

	public static void secondMenu(){
		System.out.println("\nSub Menu - \n");

		System.out.println("1. Add files in a directory.\n"+
				"2. Delete files from a directory.\n"+
				"3. Search files from a directory.\n"+
				"4. Back to Main Menu.\n");

		System.out.print("Enter the choice from the above operations here - ");
	}
}
