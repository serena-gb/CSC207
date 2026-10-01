package study;

import java.util.List;
/*
   This statement needed for the file to run. The code
   lives in the class Main.
 */
public class Main {
    public static void main(String[] args) {
        /*
        You have to declare the data type and declare.
        This is mandatory.
        This is a multiline docstring.
         */
        int myNumber = 2;
        String myString = "Hello";
        boolean myBoolean = true;
        if (myBoolean){
            System.out.println("Hello World");
        }
        List<Integer> list = List.of(1,2,3);
        for (int i: list)
            System.out.println(i);
        System.out.println(myString);
        System.out.println(myNumber + myString);
    }
}