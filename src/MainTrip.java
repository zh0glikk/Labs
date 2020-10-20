import Exceptions.InvalidDate;
import Trip.Trip;
import Date.Date;

import java.util.Scanner;

public class MainTrip {
    public static void main(String args[]) throws InvalidDate {
        int price = 0;
        Date arrivalDate = new Date();
        Date depatureDate = new Date();
        String city;
        String hotel;
        Trip trip = new Trip();


        Scanner in = new Scanner(System.in);

        System.out.println("Enter City to trip: ");
        city = in.nextLine();

        System.out.println("Enter name of hotel: ");
        hotel = in.nextLine();

        System.out.println("Enter arrival date: ");
        arrivalDate.setDay(in.nextInt());
        arrivalDate.setMonth(in.nextInt());
        arrivalDate.setYear(in.nextInt());

        System.out.println("Enter depature date: ");
        depatureDate.setDay(in.nextInt());
        depatureDate.setMonth(in.nextInt());
        depatureDate.setYear(in.nextInt());

        System.out.println("Enter price for 1 day: ");
        price = in.nextInt();

        trip.setPrice(price);
        trip.setArrivalDate(arrivalDate);
        trip.setDepatureDate(depatureDate);
        trip.setCityName(city);
        trip.setHotelName(hotel);

        System.out.println("Your trip");
        System.out.println(trip.toString());
    }
}

