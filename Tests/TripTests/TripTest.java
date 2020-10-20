package TripTests;

import Date.Date;
import Exceptions.InvalidDate;
import Trip.Trip;
import org.junit.Test;
import static org.junit.Assert.*;

public class TripTest {
    @Test
    public void tripConstuctor() throws InvalidDate {
        Trip trip = new Trip(new Date("10.12.2020"), new Date("22.12.2020"), "Kemer", "Hilton", 100);

        assertEquals("10.12.2020", trip.getArrivalDate().toString());
        assertEquals("22.12.2020", trip.getDepatureDate().toString());
        assertEquals("Kemer", trip.getCityName());
        assertEquals("Hilton", trip.getHotelName());
        assertEquals(100, trip.getPrice());
    }

    @Test
    public void countPriceTest() throws InvalidDate {
        Trip trip = new Trip(new Date("10.12.2020"), new Date("22.12.2020"), "Kemer", "Hilton", 100);

        assertEquals(1200, trip.countTripPrice());
    }

    @Test
    public void printTrip() throws InvalidDate {
        Trip trip = new Trip(new Date("10.12.2020"), new Date("22.12.2020"), "Kemer", "Hilton", 100);
        String result = "City: Kemer\n" +
                "Hotel: Hilton\n" +
                "Arrival date: 10.12.2020\n" +
                "Depature date: 22.12.2020\n" +
                "Price for 1 day: 100$\n" +
                "Whole trip price: 1200$";
        assertEquals(result, trip.toString());
    }

}
