package com.company;

public class Main {

    public static void main(String[] args) {
//        boolean gameOver= true;
//        int score= 800;
//        int levelcompleted= 5;
//        int bonus =100;

//        if (score<5000 && 1000<score) {
//            System.out.println("Your score was less than 5000 and greater than 1000");
//        } else if(score< 1000 ) {
//            System.out.println("Your score was less than 1000");}
//        else  {
//            System.out.println("Got here");}



//        int s= 10000;
//        int lc= 8;
//        int b=200;
//        if (gameOver) {
//            int finalScore= s+ (lc*b);
//            System.out.println("Your final score was "+ finalScore);
//        }

//        score= 10000;
//        levelcompleted=8;
//        bonus=200;

        // less memory usage and just variable changes here

//        if (gameOver) {
//            int finalScore= score+ (levelcompleted*bonus);
//            System.out.println("Your final score was "+ finalScore);
//        }
        calculatescore(true, 800, 5, 100);
        calculatescore(true, 10000, 8, 200);


    }
    //new method
    public static int  calculatescore(boolean gameOver, int score, int levelcompleted, int bonus) {

        if (gameOver) {
            int finalScore= score+ (levelcompleted*bonus);
            finalScore+= 2000;
            System.out.println("Your final score was "+ finalScore);
            return finalScore;
        }
        return -1;// -1 is indicating an error so if error it will return -1.
    }
}
