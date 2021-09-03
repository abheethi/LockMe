package lockme1;

import java.util.Scanner;

public class HandleOperation2{
	
	public static void handleScreenInput() {
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				MenuOptions2.displayMenu();
				int input = sc.nextInt();

				switch (input) {
				case 1:
					FileOperation2.displayAllFiles("main");
					break;
				case 2:
					HandleOperation2.handleFileMenuOptions();
					break;
				case 3:
					System.out.println("Program exited successfully.");
					running = false;
					sc.close();
					System.exit(0);
					break;
				default:
					System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				handleScreenInput();
			} 
		} while (running == true);
	}
	
		public static void handleFileMenuOptions() {
			boolean running = true;
			Scanner sc = new Scanner(System.in);
			do {
				try {
					MenuOptions2.displayFileMenuOptions();
					FileOperation2.createMainFolderIfNotPresent("main");
					
					int input = sc.nextInt();
					switch (input) {
					case 1:
						// File Add
						System.out.println("Enter the name of the file to be added to the \"main\" folder");
						String fileToAdd = sc.next();
						
						FileOperation2.createFile(fileToAdd, sc);
						
						break;
					case 2:
						// Exit
						System.out.println("Program exited successfully.");
						running = false;
						sc.close();
						System.exit(0);
						
					default:
						System.out.println("Please select a valid option from above.");
					}
				} catch (Exception e) {
					System.out.println(e.getClass().getName());
					handleFileMenuOptions();
				}
			} while (running == true);
		}
	}

			
