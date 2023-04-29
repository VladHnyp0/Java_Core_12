package ua.lviv.lgs.enums;

public enum Month {
    JANUARY(31, Season.WINTER), FEBRYARY(28, Season.WINTER),
    MARCH(31, Season.SPRING), APRIL(30, Season.SPRING),
    MAY(31, Season.SPRING), JUNE(30, Season.SUMMER),
    JULY(31, Season.SUMMER), AUGUST(31, Season.SUMMER),
    SEPTEMBER(30, Season.AUTUMN), OCTOBER(31, Season.AUTUMN),
    NOVEMBER(30, Season.AUTUMN), DECEMBER(31, Season.WINTER);

    int numberOfDays;
    Season season;

    Month(int numberOfDays, Season season) {
        this.numberOfDays = numberOfDays;
        this.season = season;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public Season getSeason() {
        return season;
    }
}