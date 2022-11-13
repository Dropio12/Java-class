package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumOdd(1,11));

    }
    public static boolean isOdd(int number){
        if (0< number && number%2!=0){
            return true;
        }
        return false;
    }
    public static int sumOdd (int start, int end){
        int v=0;
        if(start<=end && 0<start){
        for (int i=start; i<=end; i++){
            if(isOdd(i)){
               v+=i;
            }
        }
        return v;
        }
        return -1;
    }
}
