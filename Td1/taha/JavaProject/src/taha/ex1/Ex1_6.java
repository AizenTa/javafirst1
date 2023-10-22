package taha.ex1;

import java.util.Scanner;

public class Ex1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your note : ");
        int note = sc.nextInt();
        if ((note >= 0) && (note <= 9)) {
            System.out.println("Insuffisant");
        } else if ((note >= 10) && (note <= 12)) {
            System.out.println("Passable");
        } else if ((note >= 13) && (note <= 16)) {
            System.out.println("Bien");
        } else if ((note >= 17) && (note <= 20)) {
            System.out.println("Tres bien");
        }
    }
}
