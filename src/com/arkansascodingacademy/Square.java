package com.arkansascodingacademy;

public class Square
{
    private int number;
    private boolean covered;

    public Square(int number)
    {
        this.number = number;
        covered = false;
    }

    public void cover()
    {
        covered = true;
    }

    public int getNumber()
    {
        return number;
    }

    public void print()
    {

        if (covered)
        {
            System.out.print("XX");
        }
        else
        {


            if (number < 10)
            {
                System.out.print("0" + number);
            }
            else
            {
                System.out.print(number);
            }
        }
    }

    public boolean isCovered()
    {
        return covered;
    }
}
