package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue= Float.MIN_VALUE;
        float myMaxFloatValue= Float.MAX_VALUE;
        System.out.println("Float minimum value="+myMinFloatValue) ;
        System.out.println("Float minimum value="+myMaxFloatValue) ;

        double myMindoubleValue= Double.MIN_VALUE;
        double myMaxdoubleValue= Double.MAX_VALUE;
        System.out.println("double minimum value="+myMindoubleValue) ;
        System.out.println("double minimum value="+myMaxdoubleValue) ;

        int myIntValue=5/2;
        float myFloatValue= 5f/3.1f;
        double myDoubleValue=5.00/3.00;
        System.out.println("MyIntValue="+myIntValue);
        System.out.println("MyFloatValue="+myFloatValue);
        System.out.println("MyDoubleValue="+myDoubleValue);

        double poundstokg=0.45359237d;
        double pounds=200d;
        double result=pounds*poundstokg;
        System.out.println(pounds + " pounds is "+ result +"kg");

        double pi=3.1415927d;
        double anotherNumber= 300000.4567890d;
        System.out.println(pi);
        System.out.println(anotherNumber);

    }
 }
