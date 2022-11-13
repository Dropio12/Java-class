package com.company;

public class Main {

    public static void main(String[] args) {
        int count=0;
        while(count!=5){
            System.out.println("count value is"+count);
            count++;
        }
        //same thing those two
        for (count=1; count!=6; count++) {
            System.out.println(count);
        }
        //same thing again
        count =1;
        do {
            System.out.println("Count value was "+ count);
            count++;
            if (count>100){
                break;
            }
        } while(count!= 6);
        //always executed while so if we put count=7 it will play in a lopp till 7

        int number=4;
        int finishNumber=20;
        int counnt=0;
        while(finishNumber>=number){
            number++;
            if (counnt>=5 ){
                continue;
            }
            if(!isevennumber(number)){
                continue; // it allows the loop to continue without the code below
            }
            counnt++;
            System.out.println("Even number "+number);
        }
        System.out.println(counnt);
    }

    public static boolean isevennumber(int number){
        return number%2==0;
    }
}
