package oldjava;

import java.util.*;

public class _4_JavaStdinAndStdout_II {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int numInt = input.nextInt();
        double numDouble = input.nextDouble();
        input.nextLine();
        String string = input.nextLine();

        System.out.println("String: " + string);
        System.out.println("Double: " + numDouble);
        System.out.println("Int: " + numInt);
    }
}
