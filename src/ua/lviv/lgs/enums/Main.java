package ua.lviv.lgs.enums;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Month[] arrayMonths = Month.values();
        //Season[] arraySeasons = Season.values();
        ArrayList <Month> arrayMonths = new ArrayList<Month>();
        for (Month monthValue : Month.values()) {
            arrayMonths.add(monthValue);
        }

        ArrayList <Season> arraySeasons = new ArrayList<Season>();
        for (Season seasonValue : Season.values()) {
            arraySeasons.add(seasonValue);
        }

        start();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            switch (num) {
                case 0:
                    System.out.println("Введіть назву місяця ");
                    scanner = new Scanner(System.in);
                    String monthName = scanner.next().toUpperCase();

                    boolean flag = isMonthExist(arrayMonths, monthName);

                    if(!flag){
                        System.out.println("Не існує");
                    }
                    break;

                case 1:
                    System.out.println("Введіть пору року ");
                    scanner = new Scanner(System.in);
                    String seasonName = scanner.next().toUpperCase();
                    flag = false;

                    for (Month months : arrayMonths) {
                        if (months.getSeason().name().equals(seasonName)) {
                            flag = true;
                        }
                    }

                    if (flag) {
                        for (Month month: arrayMonths) {
                            if (month.getSeason().toString().equalsIgnoreCase(seasonName)) {
                                System.out.println(month);
                            }
                        }
                    }
                    if (!flag) {
                        System.out.println("Такої пори року не існує");
                    }
                    break;

                case 2:
                    System.out.println("Введіть кількості днів в місяці ");
                    scanner = new Scanner(System.in);
                    int monthDays = scanner.nextInt();
                    flag = false;

                    if (monthDays == 29) {
                        System.out.println("FEBRUARY у високосний рік");
                        break;
                    }

                    for (Month mDay : arrayMonths) {
                        if (mDay.getNumberOfDays() == monthDays){
                            flag = true;
                        }
                    }

                    if (flag) {
                        for (Month mDay : arrayMonths) {
                            if (mDay.getNumberOfDays() == monthDays) {
                                System.out.println(mDay);
                            }
                        }
                    }
                    if (!flag) {
                        System.out.println("Такої кількості днів в місяці не існує");
                    }
                    break;

                case 3:
                    System.out.println("Введіть кількості днів ");
                    scanner = new Scanner(System.in);
                    int lowerDays = scanner.nextInt();
                    flag = false;

                    for (Month lDay : arrayMonths) {
                        if (lDay.getNumberOfDays() < lowerDays){
                            flag = true;
                        }
                    }

                    if (flag) {
                        for (Month lDay : arrayMonths) {
                            if (lDay.getNumberOfDays() < lowerDays) {
                                System.out.println(lDay);
                            }
                        }
                    }
                    if (!flag) {
                        System.out.println("Немає місяців з меншою кількістю днів");
                    }
                    break;

                case 4:
                    System.out.println("Введіть кількості днів ");
                    scanner = new Scanner(System.in);
                    int upperDays = scanner.nextInt();
                    flag = false;

                    for (Month uDay : arrayMonths) {
                        if (uDay.getNumberOfDays() > upperDays){
                            flag = true;
                        }
                    }

                    if (flag) {
                        for (Month uDay : arrayMonths) {
                            if (uDay.getNumberOfDays() > upperDays) {
                                System.out.println(uDay);
                            }
                            if (uDay.getNumberOfDays() == 28) {
                                System.out.println("FEBRUARY у високосний рік");
                            }
                        }
                    }
                    if (!flag) {
                        System.out.println("Немає місяців з більшою кількістю днів");
                    }
                    break;

                case 5:
                    System.out.println("Введіть пору року ");
                    scanner = new Scanner(System.in);
                    String nextSeason = scanner.next().toUpperCase();
                    flag = false;

                    for (Season nextS : arraySeasons) {
                        if (nextS.name().equals(nextSeason)) {
                            flag = true;
                        }
                    }

                    if (flag) {
                        Season season = Season.valueOf(nextSeason);
                        int ordinal  = season.ordinal();

                        if(ordinal == (arraySeasons.size() -1)) {
                            ordinal = 0;
                            System.out.println(arraySeasons.get(ordinal));
                        }else {
                            System.out.println(arraySeasons.get(ordinal + 1));
                        }
                    }
                    if (!flag) {
                        System.out.println("Такої пори року не існує");
                    }
                    break;

                case 6:
                    System.out.println("Введіть пору року ");
                    scanner = new Scanner(System.in);
                    String previousSeason = scanner.next().toUpperCase();
                    flag = false;

                    for (Season nextS : arraySeasons) {
                        if (nextS.name().equals(previousSeason)) {
                            flag = true;
                        }
                    }

                    if (flag) {
                        Season season = Season.valueOf(previousSeason);
                        int ordinal  = season.ordinal();

                        if(ordinal == 0) {
                            ordinal = arraySeasons.size() - 1;
                            System.out.println(arraySeasons.get(ordinal));
                        }else {
                            System.out.println(arraySeasons.get(ordinal - 1));
                        }
                    }
                    if (!flag) {
                        System.out.println("Такої пори року не існує");
                    }
                    break;

                case 7:
                    for (Month evenDay : arrayMonths) {
                        if (evenDay.getNumberOfDays() % 2 == 0) {
                            System.out.println(evenDay);
                        }
                    }
                    break;

                case 8:
                    for (Month oddDay : arrayMonths) {
                        if (oddDay.getNumberOfDays() % 2 != 0) {
                            System.out.println(oddDay);
                        }
                    }
                    System.out.println("FEBRUARY у високосний рік");
                    break;

                case 9:
                    System.out.println("Введіть назву місяця ");
                    scanner = new Scanner(System.in);
                    String monthName9 = scanner.next().toUpperCase();
                    flag = false;

                    for (Month m : arrayMonths) {
                        if (m.name().equals(monthName9)) {
                            flag = true;
                        }
                    }
                    if (flag) {
                        Month m = Month.valueOf(monthName9);
                        if (m.numberOfDays == 28) {
                            System.out.println(m + " має парну кількість днів ТА не парну у високосний рік");
                            break;
                        }
                        if (m.numberOfDays % 2 == 0) {
                            System.out.println(m + " має парну кількість днів");
                        } else {
                            System.out.println(m + " має не парну кількість днів");
                        }
                    }
                    if (!flag) {
                        System.out.println("Немає такого місяця");
                    }
                    break;

            }
        }
    }


    private static boolean isMonthExist(ArrayList <Month> arrayMonths, String monthName) {
        boolean flag = false;

        for (Month m : arrayMonths) {
            if (m.name().equals(monthName)) {
                System.out.println("Існує");
                flag = true;
            }
        }
        return flag;
    }


    static void start() {
        System.out.println("Нажми 0, щоб перевірити існування місяця ");
        System.out.println("Нажми 1, щоб вивести всі місяці з такою ж порою року ");
        System.out.println("Нажми 2, щоб вивести всі місяці які мають таку саму кількість днів ");
        System.out.println("Нажми 3, щоб вивести на екран всі місяці які мають меншу кількість днів ");
        System.out.println("Нажми 4, щоб вивести на екран всі місяці які мають більшу кількість днів ");
        System.out.println("Нажми 5, щоб вивести на екран наступну пору року ");
        System.out.println("Нажми 6, щоб вивести на екран попередню пору року ");
        System.out.println("Нажми 7, щоб вивести на екран всі місяці які мають парну кількість днів ");
        System.out.println("Нажми 8, щоб вивести на екран всі місяці які мають непарну кількість днів ");
        System.out.println("Нажми 9, щоб вивести на екран чи введений з консолі місяць має парну кількість днів ");
    }
}