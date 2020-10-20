package Trip;

import Date.Date;
import Exceptions.InvalidDate;

public class Trip {
    private int price;
    private String hotelName;
    private String cityName;
    private Date arrivalDate;
    private Date depatureDate;

    public Trip(Date arrivalDate, Date depatureDate, String cityName, String hotelName, int price) {
        this.arrivalDate = arrivalDate;
        this.depatureDate = depatureDate;
        this.cityName = cityName;
        this.hotelName = hotelName;
        this.price = price;
    }

    public Trip() throws InvalidDate {
        this(new Date("10.11.2000"),
                new Date("20.11.2000"),
                "Kemer",
                "Hilton",
                100);
    }

    public int countTripPrice() {
        return price * arrivalDate.countDifference(depatureDate);
    }

    public int getPrice() { return this.price; }

    public String getHotelName() { return this.hotelName; }

    public String getCityName() { return this.cityName; }

    public Date getArrivalDate() { return this.arrivalDate; }

    public Date getDepatureDate() { return this.depatureDate; }

    public void setPrice(int value) {
        if ( value < 0 ) {
            value *= -1;
        }
        this.price = value;
    }

    public void setHotelName(String value) {
        this.hotelName = value;
    }

    public void setCityName(String value) {
        this.cityName = value;
    }

    public void setArrivalDate(Date value) {
        this.arrivalDate = value;
    }

    public void setDepatureDate(Date value) {
        this.depatureDate = value;
    }



    public String toString() {
        String result = new String();

        result += "City: " + this.cityName + "\n";
        result += "Hotel: " + this.hotelName + "\n";
        result += "Arrival date: " + this.arrivalDate + "\n";
        result += "Depature date: " + this.depatureDate + "\n";
        result += "Price for 1 day: " + this.price + "$";

        return result;
    }

}
