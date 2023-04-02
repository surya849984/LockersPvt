package prototypingApp;
import java.io.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Files {

	static Scanner sc=new Scanner (System.in);
	static String rootDirectory ="/Users/suryaprakash/eclipse-workspace/project01/LockersPvt/src/prototypingApp";
	public static void main(String[] args) throws IOException {

System.out.println("WELCOME");
System.out.println("Lockers Pvt. Ltd.  &   Devoloped by SURYA PRAKASH \n");

while (true)
{
	displayMainMenu();
	int operation =sc.nextInt();

switch(operation)
{
case 1:
	displayFilesInAscendingorder();
	break;
case 2:
	displayEditMenu();
	break;
case 3:
	System.out.println("application is closed . Goodbye !");
	break;
	default:System.out.println("invalid operation ....please enter ( 1,2,3 )");

}}}
	
	private static void displayMainMenu() {
		
		System.out.println("MAIN MENU");
        System.out.println("1. Open");
        System.out.println("2. Edit");
        System.out.println("3. Close");
        System.out.println("Enter your operation (1, 2, or 3):");

	}
private static void displayEditMenu() {
	
while (true) {
	    System.out.println("EDIT MENU");
	    System.out.println("1.add a file");
	    System.out.println("2.delete a file");
	    System.out.println("3.search for a file");
	    System.out.println("4.back to main menu");
	    System.out.println("enter your operation ( 1,2,3,4 ) :");
	    int operation =sc.nextInt();
	    
	    switch (operation) {
	    
	    case 1: 
	    	addFile();
	    	break;
	    case 2:
	    	deleteFile();
	    	break;
	    case 3 :
	       searchFile();
	    case 4:
	    	return;
	    	default :
	    		System.out.println("invalid.... operation( 1,2,3,4 ) :");
	    }
	    }

}

	private static void displayFilesInAscendingorder() {
		
		File directory=new File (rootDirectory);
		File []files=directory.listFiles();
		Arrays.sort(files);
		for (File file : files) {
			if(file.isFile()) {
				System.out.println(file.getName());
			}
		}
		
	}
		private static void addFile() {
			System.out.println("enter file name to be added :");
			String fileName=sc.next();
			File file=new File(rootDirectory + fileName);
			
			try {
				if(file.createNewFile()) {
					System.out.println("file added succusfully !");
				}
				else {
					System.out.println("file already exists :");
				}
				}
			catch(IOException e) {
				System.out.println("error occured while creating file :");
			}
		}	
		private static void deleteFile() {
			
		System.out.println("enter file name to delete :");
		String fileName=sc.next();
		File file =new  File(rootDirectory+fileName);
		if (file.delete()) {
			System.out.println("file deleted succusfully ! ");
		}
		else {
			System.out.println("file not found :");
		}
		
		}
		private static void searchFile() {
			System.out.println("enter the file name to search ");
			String fileName=sc.next();
			File directory=new File(rootDirectory);
			File[]files=directory.listFiles();
			for (File file :files) {
				if (file.isFile()&& file.getName().equals(fileName)) {
					System.out.println("file founded !");
				}
				else {
					System.out.println("file not found :");
				}
			}
			
		}
}		
	




	


