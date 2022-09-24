import java.util.Scanner;
import java.util.ArrayList;

public class functions {

    static Scanner input = new Scanner(System.in);
    static ArrayList<apartment> apartmentList = new ArrayList<>();

    // Prints out a simple main menu with a prompt to choose
    static void printMainMeu(){

        System.out.println("\n--Main Menu--");
        System.out.println("1) Add Apartment");
        System.out.println("2) Delete Apartment");
        System.out.println("3) Modify Apartment");
        System.out.println("4) List Apartments");
        System.out.println("5) Print Apartment Information");
        System.out.println("6) Sort Apartments");
        System.out.println("7) Exit Program");

        System.out.print("\nChoose a number option: ");
    }

    // This function drives the main logic of the program.
    // It handles what the user would like to do and handles mis-input.
    // Any other logic is handled within the respective function.
    static void mainDriver(){

        try{

            int choice = input.nextInt();

            System.out.println();

            if((0 < choice) && (choice <= 7)){

                switch(choice){

                    case 1 -> addApartment();
                    case 2 -> deleteApartment();
                    case 3 -> modifyApartment();
                    case 4 -> listApartments();
                    case 5 -> printApartmentInformation();
                    case 6 -> sortApartments();
                    case 7 -> exitProgram();
                }
            }
            else{

                noSuchChoice();
            }
        }
        catch(Exception error){

            invalidInput();
            input.nextLine();
        }
    }

    // Adds a new apartment to the list.
    // It asks the user for information and parses the string into an array to collect the correct information.
    // Then, creates a new apartment object and adds it to an ArrayList
    static void addApartment(){

        System.out.print("--Add Apartment--");
        System.out.println("\nType the apartment's information as follows:\napartment name, rent, star rating, notes");

        try {

            input.nextLine();
            String[] information = input.nextLine().split(",");

            information[1] = information[1].replaceAll("\\s", "");
            information[2] = information[2].replaceAll("\\s", "");
            information[3] = information[3].trim();

            String newAptName = information[0];
            double newAptRent = Double.parseDouble(information[1]);
            double newAptStarRating = Double.parseDouble(information[2]);
            String newAptNotes = information[3];

            apartmentList.add(new apartment(newAptName, newAptRent, newAptStarRating, newAptNotes));

            System.out.println("Apartment Added!");
        }
        catch (Exception error){

            System.out.println("Invalid input, please try again.");
        }
    }

    // Deletes a chosen apartment from the list.
    // User is prompted to choose from the list.
    static void deleteApartment(){

        if(isListEmpty()){

            System.out.print("--Delete Apartment--");

            for(int i = 0; i < apartmentList.size(); i++){

                System.out.printf("\n%d) %s", i + 1, apartmentList.get(i).aptName);
            }

            System.out.print("\n\nChoose an apartment you would like to delete: ");

            try {

                int choice = input.nextInt();

                if((0 < choice) && (choice <= apartmentList.size())){

                    System.out.printf("Apartment \"%s\" has been removed.\n", apartmentList.get(choice - 1).aptName);
                    apartmentList.remove(choice - 1);
                }
                else{

                    noSuchChoice();
                }
            }
            catch (Exception error){

                invalidInput();
            }
        }
    }

    // Function to modify an apartment's information.
    static void modifyApartment(){

        if(isListEmpty()){

            System.out.print("--Modify Apartment--");
            System.out.print("Choose an apartment you would like to modify: ");

            for(int i = 0; i < apartmentList.size(); i++){

                System.out.printf("\n%d) %s", i + 1, apartmentList.get(i).aptName);
            }

            try {

                int choice = input.nextInt();

                if((0 < choice) && (choice <= apartmentList.size())){

                    System.out.println("What would you like to modify?");
                    System.out.println("1) Name");
                    System.out.println("2) Rent");
                    System.out.println("3) Star Rating");
                    System.out.println("4) Notes");
                    System.out.print("Choose a number option: ");

                    int choice2 = input.nextInt();

                    if((0 < choice2) && (choice2 < 5)){

                        switch(choice2){

                            case 1 -> modify.modifyName(apartmentList.get(choice - 1));
                            case 2 -> modify.modifyRent(apartmentList.get(choice - 1));
                            case 3 -> modify.modifyStarRating(apartmentList.get(choice - 1));
                            case 4 -> modify.modifyNotes(apartmentList.get(choice - 1));
                        }
                    }
                    else{

                        noSuchChoice();
                    }
                }
                else{

                    noSuchChoice();
                }
            }
            catch (Exception error){

                invalidInput();
            }
        }
    }

    // Lists all the apartments, if any.
    // Checks if the list is empty.
    // If it is not, it prints out all apartment names.
    static void listApartments(){

        if(isListEmpty()){

            System.out.print("--List Apartments--");

            for(int i = 0; i < apartmentList.size(); i++){

                System.out.printf("\n%d) %s", i + 1, apartmentList.get(i).aptName);
            }
        }
    }

    // Prints the information of a single apartment.
    // Checks if the list is empty.
    // If not, it prints out the name, rent, star rating, and any notes.
    static void printApartmentInformation(){

        if(isListEmpty()) {

            System.out.print("--Print Apartment Information--");

            for(int i = 0; i < apartmentList.size(); i++){

                System.out.printf("\n%d) %s", i + 1, apartmentList.get(i).aptName);
            }
            System.out.println();

            try {

                System.out.print("\nChoose an apartment to view its information: ");
                int choice = input.nextInt();

                if((0 < choice) && (choice <= apartmentList.size())){

                    System.out.printf("Name: %s\n", apartmentList.get(choice - 1).aptName);
                    System.out.printf("Rent: $%.2f\n", apartmentList.get(choice - 1).rent);
                    System.out.printf("Star Rating: %.2f / 5 Stars\n", apartmentList.get(choice - 1).starRating);
                    System.out.printf("Notes: %s\n", apartmentList.get(choice - 1).notes);
                }
                else{

                    noSuchChoice();
                }
            }
            catch (Exception error){

                invalidInput();
            }
        }
    }

    // Function to see how to sort apartments
    static void sortApartments(){

        if(isListEmpty()){

            System.out.println("--Sort Apartments--");

            System.out.println("1) Apartment Name");
            System.out.println("2) Rent");
            System.out.println("3) Star Rating");

            System.out.print("\nWhat you like to sort by?: ");

            try {

                int choice = input.nextInt();

                if((0 < choice) && (choice <= 3)){

                    switch(choice){

                        case 1 -> sortBy.sortByName(apartmentList);
                        case 2 -> sortBy.sortByRent(apartmentList);
                        case 3 -> sortBy.sortByStarRating(apartmentList);
                    }
                }
                else{

                    noSuchChoice();
                }
            }
            catch (Exception error){

                invalidInput();
            }
        }
    }

    // Exits the program with an exit code of 0
    static void exitProgram(){

        System.out.println("Are you sure you want to exit? Nothing will be saved!\n[y][n]: ");
        input.nextLine();

        try{

            char choice = input.nextLine().charAt(0);

            if(choice == 'y'){

                System.out.println("Thank you for using the program, goodbye!");
                System.exit(0);
            }
            else if(choice == 'n'){

                return;
            }
            else{

                noSuchChoice();
            }
        }
        catch (Exception error) {

            invalidInput();
        }
    }

    // Prints out that the user input is a non-existent choice.
    static void noSuchChoice(){

        System.out.println("No such choice! Please try again.");
    }

    // Prints out that the user input was invalid, caught by a try-catch.
    static void invalidInput(){

        System.out.println("Input is invalid! Please try again.");
    }

    // Checks to see if apartmentList is empty.
    // If true, it prints a message that the list is empty and to add one.
    // Else, returns false.
    static boolean isListEmpty(){

        if(apartmentList.isEmpty()){

            System.out.println("No apartments saved! Add one!");
            return false;
        }
        else{

            return true;
        }
    }
}