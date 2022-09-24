import java.util.ArrayList;
import java.util.Scanner;

public class sortBy {

    static Scanner input = new Scanner(System.in);

    static void sortByName(ArrayList<apartment> apartmentList) {

        System.out.println("\n--Sort by Name--");
        System.out.println("1) Ascending");
        System.out.println("2) Descending");

        System.out.print("\nChoose an option: ");

        try {

            int choice = input.nextInt();

            if((0 < choice) && (choice <= 2)){

                switch(choice){

                    // Case 1, sort by name ascending using the comparator in the apartment class
                    case 1 -> {

                        apartmentList.sort(apartment.sortByNameAscending);
                        System.out.println("Sorted by name ascending");
                    }
                    // Case 2, sort by name descending using the comparator in the apartment class
                    case 2 ->{

                        apartmentList.sort(apartment.sortByNameDescending);
                        System.out.println("Sorted by name descending");
                    }
                }
            }
            else{

                functions.noSuchChoice();
            }
        }
        catch (Exception error){

            functions.noSuchChoice();
        }
    }

    // Sorts all apartments by rent
    static void sortByRent(ArrayList<apartment> apartmentList){

        System.out.println("\n--Sort by Rent--");
        System.out.println("1) Ascending");
        System.out.println("2) Descending");

        System.out.print("\nChoose an option: ");

        try {

            int choice = input.nextInt();

            if((0 < choice) && (choice <= 2)){

                switch(choice){

                    // Case 1, sort by reny ascending using the comparator in the apartment class
                    case 1 -> {

                        apartmentList.sort(apartment.sortByRentAscending);
                        System.out.println("Sorted by rent ascending");
                    }
                    // Case 2, sort by rent descending using the comparator in the apartment class
                    case 2 ->{

                        apartmentList.sort(apartment.sortByRentDescending);
                        System.out.println("Sorted by rent descending");
                    }
                }
            }
            else{

                functions.noSuchChoice();
            }
        }
        catch (Exception error){

            functions.invalidInput();
        }
    }

    // Sorts all apartments by star rating
    static void sortByStarRating(ArrayList<apartment> apartmentList){

        System.out.println("\n--Sort by Star Rating--");
        System.out.println("1) Ascending");
        System.out.println("2) Descending");

        System.out.print("\nChoose an option: ");

        try {

            int choice = input.nextInt();

            if((0 < choice) && (choice <= 2)){

                switch(choice){

                    // Case 1, sort by rating ascending using the comparator in the apartment class
                    case 1 -> {

                        apartmentList.sort(apartment.sortByRatingAscending);
                        System.out.println("Sorted by star rating ascending");
                    }
                    // Case 2, sort by rating descending using the comparator in the apartment class
                    case 2 ->{

                        apartmentList.sort(apartment.sortByRatingDescending);
                        System.out.println("Sorted by star rating descending");
                    }
                }
            }
            else{

                functions.noSuchChoice();
            }
        }
        catch (Exception error){

            functions.invalidInput();
        }
    }
}
