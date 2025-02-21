/*
File Name:   _23_ValidUsernameChecker.java
Author:      Francis O'Hara
Date:        2/10/25
Description: https://www.hackerrank.com/challenges/valid-username-checker/problem?isFullScreen=true
How to Run:  java _23_ValidUsernameChecker
*/
package hackerrank;

import java.util.Scanner;

class UsernameValidator {
    public static final String regularExpression = "[A-Za-z][A-Za-z0-9_]{7,29}";
}


public class _23_ValidUsernameChecker{
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}