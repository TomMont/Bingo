package com.arkansascodingacademy;

public class Game
{
    private Numbers numbers;
    private Card card;

    public Game()
    {
        numbers = new Numbers();
        card = new Card();
    }

    public void play()
    {
        boolean bingo = false;

        while (!bingo)
        {
            int number = numbers.draw();
            card.play(number);
            card.print();
            System.out.println();
            if (card.bingo())
            {
                bingo = true;
            }
        }
    }

}
