package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println(shouldWakeUp(true, 22));

        System.out.println(hasTeen(8,7,15));

        System.out.println(isCatPlaying(false,43));

        System.out.println(area(15,20));
        System.out.println(area(20));
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 24) return false;
        return isBarking && (clock < 8 || clock > 20);
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        int[] ages = {firstAge, secondAge, thirdAge};

        for (int age: ages) {
            if (age >= 13 && age <= 19) {
                return true;
            }
        }
        return false;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (isSummer && temp >= 25 && temp <= 45) {
            return true;
        } else if (!isSummer && temp >= 25 && temp <= 35) {
            return true;
        }else {
            return false;
        }
    }

    public static double area(double width, double height) {
        if (width < 0 || height < 0) return -1;
        return width * height;
    }

    public static double area(double radius) {
        if (radius < 0) return -1;
        return radius * radius * Math.PI;
    }
}
