package com.company;

public class Main {

    public static void main(String[] args) {
        getDurationString(3945);

    }
    public static String getDurationString ( int minutes, int seconds){
        if( minutes>=0 && seconds>=0 && 59>=seconds){
            int hour=((minutes+(seconds/60))/60);
            return hour+" hour "+minutes%60+" minutes " + seconds + " seconds";
        }
        return "Invalid value";
    }
    public static String getDurationString(int sconds){
        if (sconds>=0){
            int minutes= sconds/60;
            int seconds= sconds%60;
            getDurationString(minutes, seconds);
            System.out.println(getDurationString(minutes, seconds) );

        }
        return "Invalid value";
    }
}
