package com.company;

public class Main {

    public static void main(String[] args) {
        int count=0;
        int v=0;
        for (int i=1; i<=1000; i++){
            if (i%5==0 && i%3==0){
                count++;
                v+=i;
                System.out.println(i);
            }
            if(count==5){
                System.out.println(v);
                break;
            }
        }
    }
}
