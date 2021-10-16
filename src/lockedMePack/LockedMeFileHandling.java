package lockedMePack;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class LockedMeFileHandling {

	//Constants for fileStoragePackage directory inside Project
	public static String getLocalDirectory = System.getProperty("user.dir");
	public static String setMainDirectory = getLocalDirectory+File.separator+"fileStoragePackage";
	private static File file;

	//Creating fileStoragePackage directory if not present in the Project directory
	public static void createMainFolderIfNotPresent(String folderName) {
		file = new File(folderName);
		if (!file.exists()) {
			file.mkdirs();
		}
	}

	//Method to display all the files present inside fileStoragePackage package
	public static void displayAllFiles(){
		file = new File(setMainDirectory);
		if (file.list().length == 0) System.out.println("\nThe Folder is empty. Please add files in the directory \n"+setMainDirectory);
		else{
			System.out.println("\nFiles present in this directory are -\n");
			String[] allFiles = file.list();
			Arrays.sort(allFiles);
			for (String eachFile: allFiles) {
				System.out.println("-> "+eachFile);
			}
		}
	}

	//Method to add the files in inside fileStoragePackage package
	public static void addFiles(String fileName) throws IOException {
		String filePath = setMainDirectory +File.separator+fileName;
		File newFile = new File(filePath);
		String[] filesList = file.list();
		for (String existingFile : filesList) {
			if (fileName.equalsIgnoreCase(existingFile)){
				System.out.println("-> File Already exists. Returning back to Sub Menu");
				return;
			}
		}
		newFile.createNewFile();
		System.out.println("-> "+fileName+" has been created!");
	}

	//Method to delete the files in inside fileStoragePackage package
	public static void deleteFiles(String deleteFile){
		File filepath = new File(setMainDirectory +File.separator+deleteFile);
		file = new File(setMainDirectory);
		String[] existingFiles = file.list();
		for (String existingFile: existingFiles) {
			if(existingFile.equals(deleteFile)){
				filepath.delete();
				System.out.println("\n-> File "+deleteFile+" is deleted from the directory \n"+setMainDirectory);
				return;
			}
		}
		System.out.println("\n-> File Not Found. Returning back to Sub Menu");
	}

	//Method to search the files in inside fileStoragePackage package
	public static void searchFiles(String searchFile){
		file = new File(setMainDirectory);
		String[] existingFiles = file.list();
		for (String existingFile: existingFiles) {
			if(existingFile.equals(searchFile)){
				System.out.println("\n-> "+searchFile+" file is present in the directory");
				return;
			}
		}
		System.out.println("\n-> "+searchFile+" file Not Found. Returning back to Sub Menu");
	}
}