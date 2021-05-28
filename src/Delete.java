
public class Delete {
	public static String DelFile() {
		//delete file
		LockMain Lock = new LockMain();		
		System.out.println("Enter the name of the file you want to remove");
				String delFileName = scan.nextLine();
				if(.DbFile.contains(delFileName) == true) {
					DbFile.remove(delFileName);
					System.out.println(DbFile + " has been deleted");
				}
				else {
					System.out.println("FNF");
				}
	}
}
