package com.company;

public class Main {
private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) {
        int newScore = calculateScore("Daryna", 500);
        System.out.println("new score is " + newScore);
        calculateScore(75);
        calculateScore();
        double centimeters =calcFeetAndInchesToCentimeters(7, 10);
        if (centimeters<0.0) {
            System.out.println("Invalid parameters");
        }
        calcFeetAndInchesToCentimeters(10);


        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(65,5));

        System.out.println(area(-1));
        System.out.println(area(5.0));
        System.out.println(area(5.0 ,4.0));
        System.out.println(area(-1.0 ,4.0));

        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(-561600);

        printEqual(1,1,1);
        printEqual(1,1,2);
        printEqual(-1,-1,-1);
        printEqual(1,2,3);

        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,45));
        System.out.println(isCatPlaying(true,45));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player  scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) ||  ((inches< 0) || (inches> 12))) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches <0) {
            return -1;
        }
            double feet =(int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println (inches+" inches = "+feet +" feet and "+remainingInches+" inches");
            return calcFeetAndInchesToCentimeters(feet,remainingInches);

        }
        private static String getDurationString(long minutes,long seconds) {
        if((minutes<0) || (seconds<0 || seconds>59)) {
            return INVALID_VALUE_MESSAGE;
        }
        long hours = minutes/60;
        long minutes_remainder = minutes%60;
        String hoursString = hours+" h ";
        if(hours<10) {
            hoursString ="0"+hoursString;
        }
            String minuteString = minutes_remainder+" m ";
            if(minutes_remainder<10) {
                minuteString ="0"+ minuteString;
            }
            String secondsString = seconds+" s ";
            if(seconds<10) {
                secondsString ="0"+ secondsString;
            }

            return hoursString+minuteString+secondsString;
        }



    private static String getDurationString(long seconds) {
        if(seconds<0) {
            return INVALID_VALUE_MESSAGE;
        }
        long minutes = seconds/60;
        long seconds_remainder = seconds%60;

        return getDurationString(minutes,seconds_remainder);

    }
    public static double area(double radius) {
        if(radius<0){
            return -1.0;
        }

        double area =  radius*radius*Math.PI;
        return area;
    }
    public static double area(double x,double y) {
        if((x<0) ||(y<0)){
            return -1.0;
        }
        double area = x*y;
        return area;
    }
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid value");
        } else {
            long days = (minutes / 60) / 24;
            long years = days / 365;
            long days_remainder = days % 365;
            System.out.println(minutes + " min = " + years + " y " + days_remainder + " d");
        }
    }
    public static void printEqual( int a, int b, int c) {
        if((a<0) || (b<0) ||(c<0)) {
            System.out.println("Invalid Value");
        }else if((a==b)&&(b==c)){
            System.out.println("All numbers are equal");
        }else if ((a!=b)&& (b!=c) && (a!=c)){
            System.out.println("All numbers are different");
        }else{
            System.out.println("Neither all are equal or different");
        }
    }
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if ((temperature >= 25) && (temperature <= 35)) {
            return true;
        } else if((temperature >= 35) && (temperature <= 45) &&(summer)) {
            return true;
        }
        return false;
    }
}


