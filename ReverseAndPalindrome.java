package javaDevM01_assignment2;

import java.util.Scanner;

public class ReverseAndPalindrome {
    
    // return the reversal of an integer, e.g, reverse(456) returns 654
    public static int reverse(int number) {
        int rev = 0;
        while (number > 0) {
            rev *= 10;
            rev += (number % 10);
            number /= 10;
        }
        return rev;
    }

    // return true if number is a palindrome
    public static boolean isPalindrome(int number) {
        return reverse(number) == number;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        if(isPalindrome(num)) {
            System.out.println(num + " is a Palindrome");
        } else {
            System.out.println(num + " is NOT a Palindrome");
        }
    }
}
