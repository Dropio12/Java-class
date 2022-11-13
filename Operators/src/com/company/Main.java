package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int result= 1+2; //1+2=3
        System.out.println(result);
        int previousresult= result;// previousresult will always equal the result b4 this lign(if result=x previous=result result= result-1, previous= x)
        System.out.println("previousResult= " +previousresult);
        result= result-1;//3-1=2
        System.out.println(result);result=result*10;
        System.out.println("2*10="+ result); result= result/5;
        System.out.println("20/5= "+ result); result= result%3;
        System.out.println("4%3= "+ result);

        //result= result+1 abreviation of lign down
        result++; //1+1=2
        System.out.println("1+1= "+ result);
        result--; //2-1= 1
        System.out.println("2-1= "+ result);

        //result= result+2
        result+=2;// 1+2=3
        System.out.println("1+2= "+ result);

        //result = result *10;
        result *= 10; // 3*10= 30
        System.out.println("3*10= "+ result);

        //result = result / 3
        result /= 3; //30 / 3 = 10;
        System.out.println("30/3= "+ result);

        //result = result -2
        result -=2; // 10-2= 8
        System.out.println("10-2= "+ result);

        boolean isAlien= false;
        if (isAlien== true){ // if we put ; it closes statement and the if doesnt works {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");// doesnt work cause not a codeblock so just one statement is executed


        }
        int topScore= 100;
        // != is the false of if (if not0; we can also use >= etc.
        if (topScore!=100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore= 60;
        // && = and ( to add two conditions in if)
        if ((topScore > secondTopScore) && (100 > topScore));     {
            System.out.println("Greater than second top score and less than 100");
        }
                    // ||= or
        if ((topScore>90) || (90 >= secondTopScore )) {
            System.out.println("Either or both of the conditions are true");
        }
        String mot="alo";
        mot.length();

        int newValue=50;
        if(newValue==50);{
            System.out.println("This is an error");}

        boolean iscAR=false;
                if (iscAR);{
            System.out.println("This is supposed to happen");}

        iscAR=true;
        boolean wasCar= iscAR?true:false;
        if(wasCar){
            System.out.println("wasCar is true");}

        double variable1=20.00;
        double variable2=82.00;
        double variable3=((variable1+variable2)*100);
        double variable4= (variable3%40.00);
        boolean variable5= (variable4==0)? true: false;
        System.out.println(variable5);
        if (!variable5) {
            System.out.println("Got some remainder");}
        else {
            System.out.println("far");}






    }
  }
