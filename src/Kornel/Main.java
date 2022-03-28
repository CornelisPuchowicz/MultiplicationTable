package Kornel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int iKolumny;
        int iWiersze;
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę wierszy: ");
        iWiersze = input.nextInt();
        System.out.println("Podaj liczbę kolumn: ");
        iKolumny = input.nextInt();

        System.out.println("\n======================================\n");

        for (int j=1; j <= iWiersze; j++)
        {
            for(int i =1; i<= iKolumny; i++)
            {
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }

    }
}
