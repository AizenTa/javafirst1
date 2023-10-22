package taha.ex3;

import java.util.Scanner;
import java.util.Arrays;

public class Ex3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int myArray = new int[size];
        System.out.println("Enter your number : ");
        int nbr = sc.nextInt();
        int compt = 1;
        for (int i = 1; i < nbr; i++) {
            if (nbr % i == 0) {
                compt = compt + 1;
            }
        }
        int myArray[] = new int[compt];
        for (int j = 1; j < nbr; j++) {
            if (nbr % j == 0) {
                for (int i = 1; i <= compt; i++) {
                    myArray[i] = j;
                }
            }
        }

        for (int i = 1; i < compt; i++) {
            System.out.print(myArray[i] + " ");
        }
    }
}