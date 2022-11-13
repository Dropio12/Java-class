package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore=calculateScore("Tim",500);
        System.out.println("New Score is"+newScore);
        calculateScore(500);
        calculateScore();
        calcFeetAndInchesToCentimeters(90.9);
    }
    public  static int calculateScore(String playerName, int score){
        System.out.println("Player"+playerName+"scored"+score+"points");
        return score*1000;
    }
    public  static int calculateScore( int score){
        System.out.println("Unnamed Player"+" scored "+score+"points");
        return score*1000;
    }
    public  static int calculateScore(){
        System.out.println("No player name, no player score.");
        return 0;
    }
    //CHALLENGE
    public static double calcFeetAndInchesToCentimeters(double feet, double inchs){
        if(feet>=0 && inchs>=0 && 12>= inchs){
            System.out.println("You are "+(((feet*12)+inchs)*2.54)+" cm long");
        }
        return -1;}
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches>=0){
            double feet= (int) (inches/12);
            double inchs= (int) inches%12;
            calcFeetAndInchesToCentimeters(feet,inchs);
        }
        return -1;
    }
}
