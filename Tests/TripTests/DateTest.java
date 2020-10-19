package TripTests;

import Date.Date;
import Exceptions.InvalidDate;
import org.junit.Test;
import static org.junit.Assert.*;

public class DateTest {

    @Test
    public void dateOutput() throws InvalidDate {
        Date date = new Date(10,10,1970);
        Date date_2 = new Date(1, 1, 2000);

        assertEquals("10.10.1970", date.toString());
        assertEquals("01.01.2000", date_2.toString());
    }

    @Test
    public void dateStringConstuctor() throws InvalidDate {
        Date date = new Date("12.10.2001");

        assertEquals(12, date.getDay());
        assertEquals(10, date.getMonth());
        assertEquals(2001, date.getYear());
    }

    @Test
    public void dateCopyConstructor() throws InvalidDate {
        Date date = new Date("12.10.2001");
        Date date_2 = new Date(date);

        assertEquals(12, date_2.getDay());
        assertEquals(10, date_2.getMonth());
        assertEquals(2001, date_2.getYear());
    }

    @Test
    public void invalidDateException() throws InvalidDate {
        try {
            Date date = new Date("32.12.2001");
            assertEquals(1, date.getDay());
            assertEquals(1, date.getMonth());
            assertEquals(1970, date.getYear());
        } catch (InvalidDate e) {
            assertEquals("Invalid day. Changed for default.", e.text);
        }
    }

    @Test
    public void leapYear() throws InvalidDate {
        Date date = new Date("31.12.2001");
        Date date_2 = new Date("10.10.2012");
        Date date_3 = new Date("10.10.2100");

        assertEquals(false, date.isLeapYear());
        assertEquals(true, date_2.isLeapYear());
        assertEquals(false, date_3.isLeapYear());
    }

    @Test
    public void differenceBetweenDays() throws InvalidDate {
        Date date_1 = new Date("30.11.2001");
        Date date_2 = new Date("31.12.2002");

        assertEquals(396, date_1.countDifference(date_2));
    }

    @Test
    public void countDateInSomeDays() throws InvalidDate {
        Date date_1 = new Date("01.01.2001");

        assertEquals("11.01.2001", date_1.countDateInSomeDays(10).toString());
        assertEquals("31.01.2001", date_1.countDateInSomeDays(30).toString());
        assertEquals("10.02.2001", date_1.countDateInSomeDays(40).toString());
        assertEquals("01.03.2001", date_1.countDateInSomeDays(59).toString());
        assertEquals("01.01.2002", date_1.countDateInSomeDays(365).toString());
    }

    @Test
    public void countDateInSomeDaysBefore() throws InvalidDate {
        Date date_1 = new Date("31.12.2001");

        assertEquals("21.12.2001", date_1.countDateInSomeDays(-10).toString());
        assertEquals("01.12.2001", date_1.countDateInSomeDays(-30).toString());
        assertEquals("22.11.2001", date_1.countDateInSomeDays(-40).toString());
        assertEquals("01.11.2001", date_1.countDateInSomeDays(-61).toString());
        assertEquals("31.12.2000", date_1.countDateInSomeDays(-365).toString());
    }


}
