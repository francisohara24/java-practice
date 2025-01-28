// Link: https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=false

package hackerrank;

import java.util.Scanner;

public class _16_JavaStringCompare {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int k = scanner.nextInt();
        String smallest = word.substring(k);
        String biggest = smallest;

        for (int i = 0; i < word.length() - k + 1; i++){
            String substring = word.substring(i, i + k);
            if (lexicographicallyGreaterThan(substring, biggest)){
                biggest = substring;
            }
            if (lexicographicallyLessThan(substring, smallest)) {
                smallest = substring;
            }
        }

        System.out.println(smallest + "\n" + biggest);
    }

    private static boolean lexicographicallyGreaterThan(String a, String b){
        for (int i = 0; i < Math.min(a.length(), b.length()); i ++ ){
            if (a.charAt(i) > b.charAt(i)){
                return true;
            }
            else if (a.charAt(i) < b.charAt(i)){
                return false;
            }
        }
        return false;
    }

    private static boolean lexicographicallyLessThan(String a, String b){
        for (int i = 0; i < Math.min(a.length(), b.length()); i ++ ){
            if (a.charAt(i) < b.charAt(i)){
                return true;
            }
            else if (a.charAt(i) > b.charAt(i)){
                return false;
            }
        }
        return false;
    }
}
