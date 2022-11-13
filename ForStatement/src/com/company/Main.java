package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10 000$ at 2% interest"+ calculateInterest(10000,2));
        // first = first number in loop ; second= till which number ; croissant ou decroissant ou hasard
        for(int i=0; 5>i; i++){
            System.out.println("LOOP"+ i+ "hello!");
        }
        for (int i=2; 9>i; i++){
            System.out.println("10 000$ at "+ i+"% interest "+ calculateInterest(10000,i));
        }
        System.out.println("*******************************************");
        for (int i=8; i>1; i--){
            System.out.println("10 000$ at "+ i+"% interest "+ calculateInterest(10000,i));
        }
        int count=0;
        for (int i=1; 50>i; i++) {
            if(isPrime(i)){
                count++;
                System.out.println(i);
            }
            if (count==3){
                break;
            }
        }
        }


    public static double calculateInterest(double amount, double interestRate){
        return (amount* (interestRate/100));
    }

    public static boolean isPrime (int n){
        if(n ==1){
            return false;
        }
        for (int i=2; n/2>=i; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

}
