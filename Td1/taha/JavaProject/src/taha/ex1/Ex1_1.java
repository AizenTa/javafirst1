// exercice 1 //
// 
package taha.ex1;

import java.util.Scanner;

public class Ex1_1 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter first number : ");
            int a = sc.nextInt();
            if (a > 0) {
                System.out.println("a is positive");
            } else if (a < 0) {
                System.out.println("a is negetive");
            }
        }

    }
}
