import java.io.BufferedWriter;
import java.lang.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class save {

    static Scanner input = new Scanner(System.in);

    static void saveFile(ArrayList<apartment> apartmentList){

        if(functions.isListEmpty()){

            System.out.println("--Save File--");
            System.out.print("What you like to name this file?: ");
            String fileName = input.nextLine();

            String desktopPath = getDesktopPath();

            try {

                File newFile = new File(desktopPath + "\\" + fileName + ".txt");

                try(BufferedWriter writer = new BufferedWriter(new FileWriter(newFile))){

                    writer.write("Information is written as such:");
                    writer.newLine();
                    writer.write("Name");
                    writer.newLine();
                    writer.write("Rent");
                    writer.newLine();
                    writer.write("Star Rating");
                    writer.newLine();
                    writer.write("Notes");
                    writer.newLine();
                    writer.newLine();


                    for(apartment apartment : apartmentList){

                        writer.write(apartment.aptName);
                        writer.newLine();
                        writer.write("$" + apartment.rent);
                        writer.newLine();
                        writer.write(+ apartment.starRating + "/5 Stars");
                        writer.newLine();
                        writer.write(apartment.notes);
                        writer.newLine();
                        writer.newLine();
                    }
                }
                catch (IOException e) {

                    throw new RuntimeException(e);
                }
            }
            catch (Exception error){

                System.out.println("Error creating file!");
            }

            System.out.println("File has been saved to your desktop!");
        }
    }

    static String getDesktopPath() {

        String desktopPath = null;
        try {

            // Get the desktop path
            desktopPath = System.getProperty("user.home") + "\\Desktop";
        } catch (Exception error) {

            System.out.println("Error getting desktop path!");
        }

        return desktopPath;
    }
}


