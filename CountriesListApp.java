public class CountriesListApp {
    public static void main(String[] args) {
        CountriesList countriesList = new CountriesList();
        countriesList.displayWelcomeMessage();

        while (true) {
            countriesList.displayMenu();
            int choice = countriesList.getMenuOption();

            switch (choice) {
                case 1:
                    countriesList.listCountries();
                    break;
                case 2:
                    countriesList.checkForCountry();
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 3.");
            }
        }
    }
}
