// Written by Sebastian H.
// 9/18/2022 - 9/24/2022
// Written in Java 18.0.2

public class Main {
    public static void main(String[] args) {

        System.out.println("""

                Welcome to my Apartment Tracker program!
                This was written and developed for a university course as a final in Fall 2021.
                The program can keep track of apartment information for people in one place.
                It keeps track of its name, rent, star rating, and any additional information kept as notes.""");

        while(true){

            functions.printMainMeu();
            functions.mainDriver();
        }
    }
}