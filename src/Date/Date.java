package Date;

import Exceptions.InvalidDate;
import java.util.ArrayList;

public class Date {
    private int day;
    private int month;
    private int year;

    ArrayList<Integer> daysInMonth = new ArrayList<Integer>(12);

    private void setDefaultDate() {
        this.day = 1;
        this.month = 1;
        this.year = 1970;
    }

    private void validate() throws InvalidDate { // проверка на то валидная ли дата, если нет то она сбросится к дефолтным значениям и бросится ексепшн с информацией "что пошло не так"
        daysInMonth.add(31);
        daysInMonth.add(28);
        daysInMonth.add(31);
        daysInMonth.add(30);
        daysInMonth.add(31);
        daysInMonth.add(30);
        daysInMonth.add(31);
        daysInMonth.add(31);
        daysInMonth.add(30);
        daysInMonth.add(31);
        daysInMonth.add(30);
        daysInMonth.add(31);

        if ( this.day < 1 || this.day > 31 ) {
            this.setDefaultDate();
            throw new InvalidDate("Invalid day. Changed for default.");
        } else {
            if ( this.month < 1 || this.month > 12 ) {
                this.setDefaultDate();
                throw new InvalidDate("Invalid month. Changed for default.");
            } else {
                if ( ( this.year % 4 == 0 && this.year % 100 != 0 ) || this.year % 400 == 0 ) {
                    daysInMonth.set(1, 29);
                }

                if ( this.day > daysInMonth.get(this.month-1) ) {
                    this.setDefaultDate();
                    throw new InvalidDate("Invalid date. Changed for default.");
                }
            }
        }
    }


    public Date(int day, int month, int year) throws InvalidDate {
        this.day = day;
        this.month = month;
        this.year = year;

        validate();
    }

    public Date(String date) throws InvalidDate { // отцепляем от входящей стринги по кусочку и кастуем стринг в инт
        String tmp = new String();

        tmp = date.substring(0, 2);
        this.day = Integer.parseInt(tmp);

        tmp = date.substring(3, 5);
        this.month = Integer.parseInt(tmp);

        tmp = date.substring(6, 10);
        this.year = Integer.parseInt(tmp);

        validate();
    }

    public Date(Date other) throws InvalidDate {
        this.day = other.getDay();
        this.month = other.getMonth();
        this.year = other.getYear();

        validate();
    }

    public int getDay() { return this.day; }

    public int getMonth() { return this.month; }

    public int getYear() { return this.year; }

    public boolean isLeapYear() {
        return (this.year % 4 == 0 && this.year % 100 != 0) || this.year % 400 == 0;
    }

    public Date countDateInSomeDays(int value) throws InvalidDate {
        Date date = new Date(this);

        if ( value > 0) {
            for (; value >= 365; ) {
                if (date.isLeapYear()) {
                    value -= 366;
                }
                value -= 365;
                date.year += 1;
            }
            if (date.isLeapYear()) {
                date.daysInMonth.set(1, 29);
            }
            for (int i = date.month - 1; value > this.daysInMonth.get(i); i++) {
                if (i == 12) {
                    i = 0;
                }
                value -= this.daysInMonth.get(i);
                date.month += 1;

                if (date.month == 13) {
                    date.month = 1;
                    date.year += 1;
                }
            }
            if (value <= date.daysInMonth.get(date.month - 1) - date.day) {
                date.day += value;
            } else {
                value -= date.daysInMonth.get(date.month - 1);
                date.month += 1;
                date.day = 1 + value;
            }
        } else {
            value *= -1;
            for (; value >= 365; ) {
                if (date.isLeapYear()) {
                    value -= 366;
                }
                value -= 365;
                date.year -= 1;
            }
            if (date.isLeapYear()) {
                date.daysInMonth.set(1, 29);
            }
            for (int i = date.month - 1; value > this.daysInMonth.get(i); i-- ) {
                if (i == 0) {
                    i = 11;
                }
                value -= this.daysInMonth.get(i);
                date.month -= 1;

                if (date.month == 1) {
                    date.month = 13;
                    date.year -= 1;
                }
            }
            if (value < date.day) {
                date.day -= value;
            } else {
                value -= date.daysInMonth.get(date.month - 1);
                date.month -= 1;
                date.day = date.daysInMonth.get(date.month - 1) - value;
            }
        }
        return date;
    }

    public int countDifference(Date date) {
        int days_1 = countDaysAmount(this);
        int days_2 = countDaysAmount(date);

        return Math.abs(days_1 - days_2);
    }

    public int countDaysAmount(Date date) {  // считаем кол-во дней в дате начиная с 1-го года
        int days = (date.getYear() * 3 * 365 / 4) +
                (date.getYear() * 1 * 366 / 4) -
                (date.getYear() * 1 * 366 / 100) +
                (date.getYear() * 3 * 365 / 400);   // каждый 4-тый год високосный, каждый сотый не високосный, но каждый 4-сотый високосный

        for (int i = 0; i < date.getMonth() - 1; i++) {
            days += this.daysInMonth.get(i);
        }
        days += date.getDay();

        return days;
    }


    public String toString() { // приведение стринга к виду "dd.mm.yyyy"
        String result = new String();

        if ( day < 10 ) {
            result += "0";
        }
        result += day + ".";
        if ( month < 10 ) {
            result += "0";
        }
        result += month + "." + year;
        return result;
    }
}
