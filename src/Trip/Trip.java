package Trip;

import Date.Date;

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

    public int countTripPrice() {
        return price * arrivalDate.countDifference(depatureDate);
    }

    public int getPrice() { return this.price; }

    public String getHotelName() { return this.hotelName; }

    public String getCityName() { return this.cityName; }

    public Date getArrivalDate() { return this.arrivalDate; }

    public Date getDepatureDate() { return this.depatureDate; }

}
