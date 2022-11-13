package com.company;

public class Main {

    public static void main(String[] args) {
    boolean gameOver= true;
    int score= 800;
    int levelCompleted = 5;
    int bonus= 200;

    int highscore= calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("Your final score was "+ highscore);


    score= 10000;
    levelCompleted=8;
    bonus =200;
        calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("Your final score was "+ highscore);

        //CHALLENGE

        int playerpoition= calculateHighScore(1500);
        displayHighScorePosition("TIM",playerpoition);

         playerpoition= calculateHighScore(900);
        displayHighScorePosition("KIM",playerpoition);

         playerpoition= calculateHighScore(400);
        displayHighScorePosition("FIM",playerpoition);

         playerpoition= calculateHighScore(50);
        displayHighScorePosition("M",playerpoition);

         playerpoition= calculateHighScore(1500);
        displayHighScorePosition("TI",playerpoition);



    }
    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus){
        if (gameOver){
            int finalScore= score+ (levelCompleted*bonus);
            finalScore +=2000;
            return finalScore;
        }
        return -1;
    }
    public static void displayHighScorePosition(String playerName, int playerposition){
        System.out.println(playerName+" mangaged to get into position "+ playerposition);
    }
    public static int calculateHighScore(int playerscore){
        int playerposition=4;
        if (1000<=playerscore){
             playerposition=1;
        } else if ( 500<=playerscore) {
             playerposition=2;
        }else if ( 100<=playerscore) {
             playerposition=3;
        }
        return playerposition;


    }

}
