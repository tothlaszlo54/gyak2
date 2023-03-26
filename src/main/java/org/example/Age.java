package org.example;

public class Age {
    private int year;
    private int month;

    private int day;

    public Age(int day) {
        if (0 > day || day > 31) {
            throw new IllegalArgumentException();
        }
        this.day = day;
    }

    public Age(int year, int month, int day) {
        if (0 > year || (0 > month || month > 12) || (0 > day || day > 31)) {
            throw new IllegalArgumentException("Nem helyes a kor megadása: év: " + year + " hónap: " + month + " nap: " + day);
        }
        this.year = year;
        this.month = month;
        this.day = day;

    }

    public Age(int month, int day) {
        if ((0 > month || month > 12) || (0 > day || day > 31)) {
            throw new IllegalArgumentException("Nem helyes a kor megadása: hónap: " + month + " nap: " + day);
        }
        this.month = month;
        this.day = day;
    }

    public void setYear(int year) {
        if (0 > year) {
            throw new IllegalArgumentException("Nem helyes a kor megadása: év: " + year);
        }
        this.year = year;
    }

    public void setMonth(int month) {
        if (0 > month || month > 12) {
            throw new IllegalArgumentException("Nem helyes a kor megadása: hónap: " + month);
        }
        this.month = month;
    }

    public void setDay(int day) {
        if (0 > day || day > 31) {
            throw new IllegalArgumentException("Nem helyes a kor megadása: hónap: nap: " + day);
        }

        this.day = day;
    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    @Override
    public String toString() {
        return "(" + this.year + "," + this.month + "," + this.day + ") (y,m,d)";
    }
}
