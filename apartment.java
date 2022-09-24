import java.util.Comparator;

public class apartment {

    String aptName;
    double rent;
    double starRating;
    String notes;

    public apartment(String aptName, double rent, double starRating, String notes){

        this.aptName = aptName;
        this.rent = rent;
        this.starRating = starRating;
        this.notes = notes;
    }

    // Sort by name in ascending order.
    public static Comparator<apartment> sortByNameAscending = new Comparator<apartment>() {
        @Override
        public int compare(apartment apt1, apartment apt2) {

            String aptName1 = apt1.aptName.toUpperCase();
            String aptName2 = apt2.aptName.toUpperCase();

            return aptName1.compareTo(aptName2);
        }
    };

    // Sort by name in descending order.
    public static Comparator<apartment> sortByNameDescending = new Comparator<apartment>() {
        @Override
        public int compare(apartment apt1, apartment apt2) {

            String aptName1 = apt1.aptName.toUpperCase();
            String aptName2 = apt2.aptName.toUpperCase();

            return aptName2.compareTo(aptName1);
        }
    };




    // Sort by rent in ascending order
    public static Comparator<apartment> sortByRentAscending = new Comparator<apartment>() {
        @Override
        public int compare(apartment apt1, apartment apt2) {

            double apt1Rent = apt1.rent;
            double apt2Rent = apt2.rent;

            return Double.compare(apt1Rent, apt2Rent);
        }
    };

    // Sort by rent in descending order
    public static Comparator<apartment> sortByRentDescending = new Comparator<apartment>() {
        @Override
        public int compare(apartment apt1, apartment apt2) {

            double aptRent1 = apt1.rent;
            double aptRent2 = apt2.rent;

            return Double.compare(aptRent2, aptRent1);
        }
    };



    // Sort by star rating in ascending order
    public static Comparator<apartment> sortByRatingAscending = new Comparator<apartment>() {
        @Override
        public int compare(apartment apt1, apartment apt2) {

            double apt1Rating = apt1.starRating;
            double apt2Rating = apt2.starRating;

            return Double.compare(apt1Rating, apt2Rating);
        }
    };

    // Sort by star rating in descending order
    public static Comparator<apartment> sortByRatingDescending = new Comparator<apartment>() {
        @Override
        public int compare(apartment apt1, apartment apt2) {

            double apt1Rating = apt1.starRating;
            double apt2Rating = apt2.starRating;

            return Double.compare(apt2Rating, apt1Rating);
        }
    };
}
