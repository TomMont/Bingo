package com.arkansascodingacademy;

import java.util.ArrayList;
import java.util.Random;

public class Numbers
{
    private ArrayList<Integer> uncalledNumbers;
    private ArrayList<Integer> calledNumbers;
    private Random random;

    public Numbers(int minNumber, int maxNumber)
    {
        uncalledNumbers = new ArrayList<>();

        for (int i = minNumber;  i <= maxNumber; i++)
        {
            uncalledNumbers.add(i);
        }

        calledNumbers = new ArrayList<>();
        random = new Random();
    }

    public int draw()
    {
        //Get a random number from 0 to (number of remaining cards - 1
        int randomNumber = random.nextInt(uncalledNumbers.size());
        //Get a number from the list of numbers uing the randomNumber position
        int calledNumber = uncalledNumbers.remove(randomNumber);
        //Keep track of the numbers called so far
        calledNumbers.add(calledNumber);
        return calledNumber;
    }

    public void printCalledNumbers()
    {
        for(int number : calledNumbers)
        {
          System.out.print(number + " ");
        }
        System.out.println();
    }
    public void printUncalledNumbers()
    {
        for(int number : uncalledNumbers)
        {
            System.out.print(number + " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Numbers numbers = new Numbers(00,75);
        numbers.draw();
        numbers.draw();
        numbers.printCalledNumbers();
        numbers.printUncalledNumbers();
    }
}
