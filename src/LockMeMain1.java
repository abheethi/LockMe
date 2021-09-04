
public class LockMeMain1 {

	public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		FileOperation2.createMainFolderIfNotPresent("main");
		
		MenuOptions2.printWelcomeScreen("Simpli learn project", "Abheethi Koonal K T");
		
		 HandleOperation2.handleWelcomeScreenInput();
	}

	
}
