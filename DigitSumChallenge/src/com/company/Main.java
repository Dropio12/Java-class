package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println( sumDigits(12220));

        int x= 125%10;
                int y= 12%10;
                        int z=1%10;
        System.out.println( x);
        System.out.println(z);
        System.out.println(y);
    }
    public static int sumDigits (int number){
        int v=0;
        int count=0;
        if (number>=10){
            for (int i = number; true; i/=10 ){
                if (10>i){
                    break;
                }
                count++;
            }

            for (int i=number;true; i/=10){
                v+=(i%10);
                count--;
                if(10>=i){
                    v+=(i%10);
                    break;
                }



            }
        }
        else{
            v=(-1);
        }
        return v-1;
    }
}

//or we can do
private static int sumDigits(int number){
    if( number greater 10){
        return -1;
    }
    int sum=0;

    while(number greater 0){
        int d=number%10;
        sum+=digit;
        number/10;
    }
    return sum;
}
