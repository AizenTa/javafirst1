package taha.ex1;

import java.util.Scanner;

public class Ex1_4 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("enter ur number:");
        int a = clavier.nextInt();
        if ((a > 25) && (a < 75)) {
            System.out.println("number is between 25 and 75");
        } else {
            System.out.println("number isn't between 25 and 75");
        }
    }
}