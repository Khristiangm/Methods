package com.timbuchalka;

public class Main {

    public static void main(String[] args) {


        //...Metodo...\/............PARAMETROS...............\
       // calculateScore(true, 800, 5, 100);

        //...Metodo...\/..................PARAMETROS.......................\
       // calculateScore(true, 10000, 8, 200);


        //Outra forma de fazer..

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        //...Metodo...\/............PARAMETROS...............\
        calculateScore(gameOver, score, levelCompleted, bonus);

        boolean gameOver2 = true;
        int score2 = 10000;
        int levelCompleted2 = 8;
        int bonus2 = 200;

        //...Metodo...\/............PARAMETROS...............\
        calculateScore(gameOver2, score2, levelCompleted2, bonus2);


    }

    //Metodo criado para despoluir o main e tornar mais facil de repetir o codigo.
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        //Logica do codigo.
        if (gameOver == true) {
            // Variaveis Criadas dentro do Bloco de Codigo, nao podem ser chamadas fora dele.
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your Final Score Was " + finalScore);


        }
    }
}
