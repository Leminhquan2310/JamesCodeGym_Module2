package org.example;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String scoreText = "";

        if (player1Score == player2Score) {
            switch (player1Score) {
                case 0:
                    scoreText = "Love-All";
                    break;
                case 1:
                    scoreText = "Fifteen-All";
                    break;
                case 2:
                    scoreText = "Thirty-All";
                    break;
                case 3:
                    scoreText = "Forty-All";
                    break;
                default:
                    scoreText = "Deuce";
                    break;
            }
        } else if (player1Score >= 4 || player2Score >= 4) {
            int scoreDifference = player1Score - player2Score;
            if (scoreDifference == 1) scoreText = "Advantage " + player1Name;
            else if (scoreDifference == -1) scoreText = "Advantage " + player2Name;
            else if (scoreDifference >= 2) scoreText = "Win for " + player1Name;
            else scoreText = "Win for " + player2Name;
        } else {
            for (int i = 0; i < 2; i++) {
                int currentScore = (i == 0) ? player1Score : player2Score;
                if (i == 1) scoreText += "-";

                switch (currentScore) {
                    case 0:
                        scoreText += "Love";
                        break;
                    case 1:
                        scoreText += "Fifteen";
                        break;
                    case 2:
                        scoreText += "Thirty";
                        break;
                    case 3:
                        scoreText += "Forty";
                        break;
                }
            }
        }
        return scoreText;
    }
}
