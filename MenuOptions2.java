package lockme1;


public class MenuOptions2 {
public static void WelcomScreen(String appName , String developerName){
					String companyDetails = String.format("*****************************************************\n"
							+ "** Welcome to %s.com. \n" + "** This application was developed by %s.\n"
							+ "*****************************************************\n", appName, developerName);

					String appFunction = "You can use this application to :-\n"
							+ "� Retrieve all file names in the \"Main\" folder\n"
							+ "� Search, add, or delete files in \"Main\" folder.\n";
							
					System.out.println(companyDetails);

					System.out.println(appFunction);
					}

				

                        public static void displayMenu() {
						String menu = "\n\n****** Select any option number from below and press Enter ******\n\n"
								+ "1) Retrieve all files inside \"Main\" folder\n" + "2) Display menu for File operations\n"
								+ "3) Exit program\n";
						System.out.println(menu);

					}

					public static void displayFileMenuOptions() {
						String fileMenu = "\n\n****** Select any option number from below and press Enter ******\n\n"
								+ "1) Add a file to \"Main\" folder\n" + "2) Exit program\n";

						System.out.println(fileMenu);
					}

}