package oldjava;

import java.util.Scanner;

public class _17_JavaStringReverse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String A = input.next();
        boolean isPalindrome = true;

        for(int i = 0; i < A.length()/2; i++) {
            if(A.charAt(i) != A.charAt(A.length()-1-i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome?"Yes":"No");
    }
}
