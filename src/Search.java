
public class Search {
	public void SearchFile() {
		LockMain Lock = new LockMain();
		System.out.println("Enter file name you want to search");
		
		String searchFile = scan.nextLine();
		if(((String) Lock.DbFile).contains(searchFile) == true) {
			System.out.println("your file " + searchFile + " has been found");
		}
		else {
			System.out.println("FNF");
		}
		
	}
}
