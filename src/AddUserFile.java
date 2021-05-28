import java.util.HashSet;
import java.util.Scanner;

public class AddUserFile {
	public void AddUserFilenew() {
		
		LockMain Lock = new LockMain();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter file name to add a file");
		
		//take input from user
		//hashset to store the data using key value pair
		//key should be given by user and value should contain a function that will create a file in memory
		HashSet DbFile = new HashSet();
		String fileName = scan.nextLine();
		for (int i = 0; i > -1; i++) {
			DbFile.add(fileName);
			break;
			
		}
		System.out.println("your file " + DbFile
				+" has been added to directory");
		
	}
}
