import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CountriesList {
    private ArrayList<String> countries;
    private String[] menuOptions = {"Display countries", "Add a country", "Exit"};
    private Scanner scanner;

    public CountriesList() {
        countries = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void displayWelcomeMessage() {
        System.out.println("Welcome to the Countries List App!");
    }

    public void displayMenu() {
        System.out.println("Menu:");
        for (int i = 0; i < menuOptions.length; i++) {
            System.out.println((i + 1) + ". " + menuOptions[i]);
        }
    }

    public int getMenuOption() {
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    public void checkForCountry() {
        System.out.print("Enter a country: ");
        String country = scanner.next();
        if (countries.contains(country)) {
            System.out.println(country + " already exists in the list.");
        } else {
            addCountry(country);
            System.out.println(country + " added to the list.");
        }
    }

    public void addCountry(String country) {
        countries.add(country);
    }

    public void listCountries() {
        if (countries.isEmpty()) {
            System.out.println("The countries list is empty.");
        } else {
            Collections.sort(countries);
            System.out.println("Countries in the list:");
            for (String country : countries) {
                System.out.println(country);
            }
        }
    }
}
