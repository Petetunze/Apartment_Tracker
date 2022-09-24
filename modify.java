import java.util.Scanner;

public class modify {

    static Scanner input = new Scanner(System.in);

    // Modifies an apartment name
    static void modifyName(apartment apartment){

        System.out.println("--Modify Name--");
        System.out.println("Current name: " + apartment.aptName);
        System.out.println("Enter a new name: ");
        apartment.aptName = input.nextLine();

        System.out.println("Name has been changed to: " + apartment.aptName);
    }

    // Modifies an apartment's rent
    static void modifyRent(apartment apartment){

        System.out.println("--Modify Rent--");
        System.out.println("Current rent: " + apartment.rent);
        System.out.println("Enter a new rent: ");

        try {

            apartment.rent = input.nextDouble();

            System.out.println("Rent has been changed to: " + apartment.rent);
        }
        catch (Exception error){

            functions.invalidInput();
        }
    }

    // Modifies an apartment's star rating
    static void modifyStarRating(apartment apartment){

        System.out.println("--Modify Star Rating--");
        System.out.println("Current star rating: " + apartment.starRating);
        System.out.println("Enter a new star rating: ");

        try {

            apartment.starRating = input.nextDouble();

            if((0 <= apartment.starRating) && (apartment.starRating <= 5)){

                System.out.println("Star rating has been changed to: " + apartment.starRating);
            }
            else{

                functions.invalidInput();
            }
        }
        catch (Exception error){

            functions.invalidInput();
        }
    }

    // Modifies an apartment's notes
    static void modifyNotes(apartment apartment){

        System.out.println("--Modify Notes--");
        System.out.println("Current notes: " + apartment.notes);
        System.out.println("Enter new notes: ");

        apartment.notes = input.nextLine();
    }
}
