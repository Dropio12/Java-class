package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue=10000;

        int myMinIntValue= Integer.MIN_VALUE;
        int myMaxIntValue= Integer.MAX_VALUE;
        System.out.println("Minimum Value="+ myMinIntValue);
        System.out.println("Maximum Value="+ myMaxIntValue);
        System.out.println("Busted MAX Value="+ (myMaxIntValue+1));
        System.out.println("Busted MIN Value="+ (myMinIntValue-1));

        int myMaxIntTest=2_147_483_647; //int number too high if +1. Also, _ do nothing

        byte myMinByteValue= Byte.MIN_VALUE;
        byte myMaxByteValue= Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value="+ myMinByteValue);
        System.out.println("Byte Maximum Value="+ myMaxByteValue);

        short myMinShortValue= Short.MIN_VALUE;
        short myMaxShortValue= Short.MAX_VALUE;
        System.out.println("Short Minimum Value="+ myMinShortValue);
        System.out.println("Short Maximum Value="+ myMaxShortValue);

        long myLongValue= 100L;
        long myMinLongValue= Long.MIN_VALUE;
        long myMaxLongValue= Long.MAX_VALUE;
        System.out.println("long Minimum Value="+ myMinLongValue);
        System.out.println("long Maximum Value="+ myMaxLongValue);
        long bigLongValue= 2_147_483_648L; // L is too indicate that the number is a long and not a int, cause it wont work over the int limit
        System.out.println(bigLongValue);

        short bigshortValue= 32_767;

        int myTotal= (myMinIntValue/2);

        byte myNewByteValue= (byte)(myMinByteValue/2); // if /2, the int is in int but not byte, so we use cast:(byte))

        short myNewShortValue= (short) (myMinShortValue/2); // so we need to precise which datatype u use (short,byte,lon or int)

        //CHALLENGE

        short x= 1;
        byte y=2;
        int z=200000;
        long a=(50000L+ 10L*(y+z+x));
        System.out.println(a);

        System.out.wait(long5000);

    }
}
