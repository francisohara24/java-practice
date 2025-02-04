/*
File Name:   _19_JavaStringTokens.java
Author:      Francis O'Hara
Date:        2/3/25
Description: https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true
How to Run: java _19_JavaStringTokens
*/
package hackerrank;

import java.util.Scanner;
public class _19_JavaStringTokens {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String[] tokens = s.split("[^A-Za-z]+");

        System.out.println(tokens.length);

        for (String token: tokens){
            System.out.println(token);
        }
    }
}
