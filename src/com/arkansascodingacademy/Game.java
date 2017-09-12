package com.arkansascodingacademy;

import java.util.ArrayList;

public class Game
{
    private Numbers numbers;
    private ArrayList<RandomCard> cards;

    public Game()
    {
        numbers = new Numbers(1, 75);
        cards = new ArrayList<>();

        for (int cardNumber = 1; cardNumber <= 10; cardNumber++)
        {
            RandomCard card = new RandomCard();
            cards.add(card);
        }

    }



    public void play()
    {
        boolean bingo = false;

        while (!bingo)
        {
            int number = numbers.draw();

            for(RandomCard card : cards)
            {
                card.play(number);
                card.print();
                System.out.println();
                if (card.bingo())
                {
                    bingo = true;
                }
            }

        }
        printWinningCards();
    }

    public void printWinningCards()
    {
        System.out.println("The winning cards are:");
        for(RandomCard card :  cards)
        {
            if (card.bingo())
            {
                card.print();
                System.out.println();
            }
        }

    }

}
