package ua.lviv.lgs.car;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            menu();
            Scanner num = new Scanner(System.in);
            switch (num.nextInt()) {
                case 1: {
                    Auto[][] carArr = new Auto[getRandomNumber(1, 4)][getRandomNumber(1, 4)];

                    for (int i = 0; i < carArr.length; i++) {
                        for (int j = 0; j < carArr[i].length; j++) {
                            carArr[i][j] = new Auto(getRandomNumber(100, 250),
                                    getRandomNumber(1990, 2023),
                                    new Wheel(getRandomNumber(35, 60),
                                            getMaterialOfWheel()),
                                    new Engine(getRandomNumber(2, 12)));
                        }
                    }
                    System.out.println(Arrays.deepToString(carArr));
                }
                break;

                case 2: {
                    Auto[] carArr = new Auto[getRandomNumber(1, 4)];

                    Auto auto = new Auto(getRandomNumber(100, 250),
                            getRandomNumber(1990, 2023),
                            new Wheel(getRandomNumber(35, 60),
                                    getMaterialOfWheel()),
                            new Engine(getRandomNumber(2, 12)));
                    Arrays.fill(carArr, auto);


                    System.out.println(Arrays.deepToString(carArr));

                }
                break;

                default:
                    System.out.println("It must be '1', or '2'! ");
                break;
            }
        }
    }


    static String getMaterialOfWheel() {
        if (getRandomNumber(1,2) == 1) {
            return "Leather";
        }
        else return "Alcantara";
    }
    static int getRandomNumber(int min, int max) {
        int res;
        if (min >= max) {
            throw new IllegalArgumentException("min>=max");
        } else {
            res = (int) (Math.random() * (max - min + 1) + min);
        }
        return res;
    }

    static void menu() {
        System.out.println();
        System.out.println("Enter 1, to call an array of random cars");
        System.out.println("Enter 2, to fill the array with the same values of a random car");
    }
}
