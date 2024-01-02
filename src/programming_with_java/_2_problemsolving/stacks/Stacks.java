package _2_problemsolving.stacks;

import java.util.Arrays;
public class Stacks {
    public static void main(String[] args) {

/*
    Stacks (Brief intro to classes)
    --------------------------------
         * data members (c++) == fields ~== instance variables ~== properties
         * member functions (c++) == methods

         * every object inherits from the Object class which has methods toString,..etc.

         * Stack operations(methods) - pop, push, peek

         * instantiation
           - creating an object from a class.

         * instantiation e.g.
            Stack stack = new Stack();
            Stack stack1 = new Stack(9);
            Stack stack2 = new Stack(9, new int[] {1,2,3,4,5,6,7,8,9});
*/

    }
}

class Stack {
/* PSEUDOCODE
 Stack
 ------
    * Properties
       - data
       - size
       - top - 1

    * Methods
       - constructors(w/ overloading)
       - push()
       - pop()
       - peek()

    *  Implementation
       - implement with Java Array of length `size`.
       - top property has default value of -1
       - stack is empty when top is -1
           - check if stack is not empty before pop()
           - check if stack is not empty before peek()
       - stack is full when top == size - 1
           - check if stack is not full before push()
*/

    // fields
    private int[] data;
    private int size;
    private int top = -1;

    // constructors
    public Stack(){
        size = 10;
        data = new int[10];
    }

    public Stack(int n){
        size = n;
        data = new int[size];
    }

    public Stack(int size, int[] elements){
        if (elements.length > size)
            System.out.println("Error! ")
        this.size = size;
        data = new int[size];

        top = elements.length - 1;
    }

    // push
    public void push(int element){


    }



}




