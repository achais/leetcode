package com.achais.leetcode;

class Date1185 {
    final String[] weekTable = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    private int day;
    private int month;
    private int year;

    public Date1185(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getValue() {
        return this.year * 10000 + this.month * 100 + this.day;
    }

    public boolean isLeapYear() {
        return this.year % 4 == 0 && this.year % 100 != 0 || this.year % 400 == 0;
    }

    public boolean lte(Date1185 date) {
        return this.getValue() <= date.getValue();
    }

    public boolean equals(Date1185 date) {
        return this.getValue() == date.getValue();
    }

    public void addDay() {
        int monthDays = 31;
        if (this.month == 2) {
            monthDays = this.isLeapYear() ? 29 : 28;
        } else if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
            monthDays = 30;
        }

        if (++this.day > monthDays) {
            if (++this.month > 12) {
                ++this.year;
                this.month -= 12;
            }
            this.day -= monthDays;
        }
    }

    public int diffDays(Date1185 date) {
        int days = 0;
        if (this.lte(date)) {
            Date1185 temp = new Date1185(this.day, this.month, this.year);
            while (!temp.equals(date)) {
                temp.addDay();
                days++;
            }
        } else {
            Date1185 temp = new Date1185(date.day, date.month, date.year);
            while (!temp.equals(this)) {
                temp.addDay();
                days++;
            }
        }
        return days;
    }

    public String weekDay() {
        Date1185 head = new Date1185(15, 8, 1993);
        int days = this.diffDays(head);
        if (this.lte(head)) {
            return weekTable[(7 - days % 7) % 7];
        } else {
            return weekTable[days % 7];
        }
    }
}

public class Solution1185 {
    public String dayOfTheWeek(int day, int month, int year) {
        Date1185 date = new Date1185(day, month, year);
        return date.weekDay();
    }

    public static void main(String[] args) {
        int day = 31, month = 8, year = 2019;

        Solution1185 solution = new Solution1185();
        String stdout = solution.dayOfTheWeek(day, month, year);

        System.out.println(stdout);
    }
}
