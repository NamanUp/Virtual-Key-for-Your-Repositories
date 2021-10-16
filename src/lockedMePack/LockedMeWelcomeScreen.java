package lockedMePack;

public class LockedMeWelcomeScreen {
	
	public static void printWelcomeScreen(String applicationName, String developerName){
		
		System.out.println("--------------------------------Welcome to "+applicationName+"!--------------------------------");
		
		System.out.println("----------------My Name is "+developerName+", the developer of this application---------------\n");

		LockedMeFileHandling.createMainFolderIfNotPresent("fileStoragePackage");
	}
	
	public static void mainMenu(){
		System.out.println("\nMain Menu- \n");
		
		System.out.println("1. Retrieve all the existing files from a directory.\n"+
				"2. Add, Delete or Search the files.\n"+
				"3. Exit from the application.\n");
		
		System.out.print("Enter the choice from the above operations here - ");
	}

	public static void subMenu(){
		System.out.println("\nSub Menu - \n");

		System.out.println("1. Add files in a directory.\n"+
				"2. Delete files from a directory.\n"+
				"3. Search files from a directory.\n"+
				"4. Back to Main Menu.\n");

		System.out.print("Enter the choice from the above operations here - ");
	}
}
