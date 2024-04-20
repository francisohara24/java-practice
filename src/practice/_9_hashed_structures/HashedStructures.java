/*
File Name:   HashedStructures.java
Author:      Francis O'Hara
Date:        4/20/24
Description: Exploration of how to implement a hashed data structure.
How to Run:  java HashedStructures
*/
package practice._9_hashed_structures;

public class HashedStructures {
    public static void main(String[] args){
        // declare variables of different types
        int num = 3;
        Integer num1 = 5;
        String str = "Hello";

        // test hashCode() method for each variable
        // System.out.println(num.hashCode()); // Doesn't work for primitive types.
        System.out.println("Value: \"Hello\"\tHashcode: " + str.hashCode());
        System.out.println("Value: 5\tHashCode: " + num1.hashCode());
    }
}

/* CONCLUSIONS
    1. For integer values, the hashcode is likely the integer value itself.
    2. Primitive types only have hashCode(), or any method for that matter, only when declared with their corresponding wrapper classes.
       hashCode() is likely one of the public methods of the Object class, so it can't be called on non-objects.
* */