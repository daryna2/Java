package com.company;

public class Main {
     public static void main(String[] args) {
        double kilometres = (100 * 1.6093344);
        int highScore = 50;
        if (highScore == 50) {
            System.out.println("This is expression");
        }
        int score = 100;
        if (score > 99) {
            System.out.println("You got the hight score");
            score = 0;
        }
        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println("This is a test");

        System.out.println("This is " + "another " + " still more");
        int anotherVariable = 50;
        myVariable--;
        System.out.println("This is another line");





        int highScore_1 = calculateScore(false, 800, 5, 100);
        System.out.println("Your final score was " + highScore_1);
        highScore_1 = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore_1);


        int resultCalculateScore = calculateHighScorePosition(1500);
        displayPosition("Daryna", resultCalculateScore);

        resultCalculateScore = calculateHighScorePosition(900);
        displayPosition("Edward", resultCalculateScore);

        resultCalculateScore = calculateHighScorePosition(400);
        displayPosition("Kateryna", resultCalculateScore);

        resultCalculateScore = calculateHighScorePosition(50);
        displayPosition("Janina", resultCalculateScore);

        resultCalculateScore = calculateHighScorePosition(1000);
        displayPosition("Inna", resultCalculateScore);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }


    public static void displayPosition(String playerName, int positionInHighScoreTable) {
        System.out.println(playerName + "  managed to get into position  " + positionInHighScoreTable +
                " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        /*if (playerScore>=1000) {
            return 1;
        } else if (playerScore>= 500) {
            return 2;
        }else if (playerScore>= 100){
            return 3;
        }
            return 4;*/
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;

    }


}





