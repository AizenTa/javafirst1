// exercice 1 //
// 
package taha.ex1;

import java.util.Scanner;

public class Ex1_2 {
    public static void main(String args[]) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("enter first number : ");
        int a = clavier.nextInt();
        if (a > 0) {
            System.out.println("a is positive");
        } else if (a < 0) {
            System.out.println("a is negetive");
        } else {
            System.out.println("a is equal 0");
        }
    }
}
