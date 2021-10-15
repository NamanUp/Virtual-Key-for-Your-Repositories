package lockedMePack;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class LockedMeFileHandling {

	public static String getDirectory = System.getProperty("user.dir");
	public static String mainPackage = getDirectory+File.separator+"fileStoragePack";
	private static File file;

	public static void createMainFolderIfNotPresent(String folderName) {
		file = new File(folderName);
		if (!file.exists()) {
			file.mkdirs();
		}
	}

	public static void displayAllFiles(){
		createMainFolderIfNotPresent("fileStoragePack");
		file = new File(mainPackage);
		if (file.list().length == 0) System.out.println("\nEither the Folder is empty or not been created. Please add files in the main directory");
		else{
			System.out.println("\nThe Files present in this directory are -\n");
			String[] allFiles = file.list();
			Arrays.sort(allFiles);
			for (String eachFile: allFiles) {
				System.out.println("-> "+eachFile);
			}
		}
	}

	public static void addFiles(String fileName) throws IOException {
		createMainFolderIfNotPresent("fileStoragePack");
		String filePath = mainPackage+File.separator+fileName;
		File newFile = new File(filePath);
		String[] filesList = file.list();
		for (String existingFile : filesList) {
			if (fileName.equalsIgnoreCase(existingFile)){
				System.out.println("-> File Already exists....Returning back to Sub Menu");
				return;
			}
		}
		newFile.createNewFile();
		System.out.println("-> "+fileName+" has been created");
	}
	
	public static void deleteFiles(String deleteFile){
		createMainFolderIfNotPresent("fileStoragePack");
		File filepath = new File(mainPackage+File.separator+deleteFile);
		file = new File(mainPackage);
		String[] existingFiles = file.list();
		for (String existingFile: existingFiles) {
			if(existingFile.equals(deleteFile)){
				filepath.delete();
				System.out.println("\n-> File "+deleteFile+" is deleted from this directory ");
				return;
			}
		}
		System.out.println("\n-> File Not Found....Returning back to Sub Menu");
	}
	
	public static void searchFiles(String searchFile){
		createMainFolderIfNotPresent("fileStoragePack");
		file = new File(mainPackage);
		String[] existingFiles = file.list();
		for (String existingFile: existingFiles) {
			if(existingFile.equals(searchFile)){
				System.out.println("\n-> "+searchFile+" file is present in this directory ");
				return;
			}
		}
		System.out.println("\n-> File Not Found....Returning back to Sub Menu");
	}

}
