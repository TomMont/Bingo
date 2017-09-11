package com.arkansascodingacademy;

public class Card
{
    private Square square[][];

    public Card()
    {
        square = new Square[5][5];

        square[0][0] = new Square(9);
        square[0][1] = new Square(21);
        square[0][2] = new Square(39);
        square[0][3] = new Square(58);
        square[0][4] = new Square(75);

        square[1][0] = new Square(4);
        square[1][1] = new Square(28);
        square[1][2] = new Square(37);
        square[1][3] = new Square(47);
        square[1][4] = new Square(72);

        square[2][0] = new Square(2);
        square[2][1] = new Square(17);
        square[2][2] = new Square(0);
        square[2][2].cover();
        square[2][3] = new Square(56);
        square[2][4] = new Square(66);

        square[3][0] = new Square(7);
        square[3][1] = new Square(23);
        square[3][2] = new Square(34);
        square[3][3] = new Square(59);
        square[3][4] = new Square(70);

        square[4][0] = new Square(3);
        square[4][1] = new Square(24);
        square[4][2] = new Square(41);
        square[4][3] = new Square(57);
        square[4][4] = new Square(71);


    }

    public void print()
    {
        //Go through rows 0 to 4
        for (int row = 0; row < 5; row++)
        {
            //For the current row, go through columns 0 to 4
            for (int column = 0; column < 5; column++)
            {
                square[row][column].print();
                System.out.print(" ");
            }

            System.out.println();
        }

    }

    public static void main(String[] args)
    {
        Card card = new Card();
        card.print();
    }

    public void play(int number)
    {
        //Go through rows 0 to 4
        for (int row = 0; row < 5; row++)
        {
            //For the current row, go through columns 0 to 4
            for (int column = 0; column < 5; column++)
            {
                //Check for the number
                if (square[row][column].getNumber() == number)
                {
                    //If we found the number cover it
                    square[row][column].cover();
                }

            }


        }

    }

    public boolean bingo()
    {
        boolean bingo = false;

        if (bingoByColumn() || bingoByRow() || bingoByDiagonal())
        {
            bingo = true;
        }

        return bingo;
    }

    private boolean bingoByColumn()
    {
        boolean bingo = false;
        for (int column = 0; column < 5; column++)
        {
            if (square[0][column].isCovered() &&
                square[1][column].isCovered() &&
                square[2][column].isCovered() &&
                square[3][column].isCovered() &&
                square[4][column].isCovered())
            {
                bingo = true;
            }
        }
        return bingo;
    }

    private boolean bingoByRow()
    {
        boolean bingo = false;

        //Check for row
        for (int row = 0; row < 5; row++)
        {
            if (square[row][0].isCovered() &&
                square[row][1].isCovered() &&
                square[row][2].isCovered() &&
                square[row][3].isCovered() &&
                square[row][4].isCovered())
            {
                bingo = true;
            }
        }
        return bingo;
    }

    private boolean bingoByDiagonal()
    {
        boolean bingo = false;
        {
            if ((square[0][0].isCovered() &&
                    square[1][1].isCovered() &&
                    square[2][2].isCovered() &&
                    square[3][3].isCovered() &&
                    square[4][4].isCovered())||
            (square[0][4].isCovered() &&
                    square[1][3].isCovered() &&
                    square[2][2].isCovered() &&
                    square[3][1].isCovered() &&
                    square[4][0].isCovered()))


            {
                bingo = true;
            }
        }
        return bingo;
    }
}

