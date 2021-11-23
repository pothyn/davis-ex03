/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hunter Davis
 */
package baseline;

import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {
        // Initialize Scanner object
        Scanner in = new Scanner(System.in);

        // Prompt and take in name
        System.out.print("What is the quote: ");
        String name = in.nextLine();

        // Prompt and take in quote
        System.out.print("Who said it: ");
        String quote = in.nextLine();

        // Output name and quote in a phrase
        System.out.println(name + " says " + quote);
    }
}