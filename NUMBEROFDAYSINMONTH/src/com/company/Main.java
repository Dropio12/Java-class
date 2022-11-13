package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
    }
    public static boolean isLeapYear(int year) {
        if(1<=year && year<=9999){
            if (year%4==0 && year%100!=0 || year%400==0)
                return true;
            else
                return false;
        }
        else
            return false;
    }

    public static int getDaysInMonth(int month, int year){
        if (isLeapYear(year)){
            switch(month){
                case 1: case 3: case 5: case 7: case 10: case 12:
                    return 31;
                case 2:
                    return 29;
                case 4: case 6: case 8: case 11: case 9:
                    return 30;
                default:
                    return -1;
            }
        } else if (1<=year && year<=9999){
            switch(month){
                case 8: case 1: case 3: case 5: case 7: case 12: case 10:
                    return 31;
                case 2:
                    return 28;
                case 4: case 6: case 11: case 9:
                    return 30;
                default:
                    return -1;
                 }
            }
        return -1;

        }








}
