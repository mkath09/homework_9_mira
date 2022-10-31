package Homework_week9;

import java.util.ArrayList;

/*
Write a Java program to retrieve an element (at a specified index) from a given
array list
 */
public class Programme_6_RetrieveAnElement {

    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<String>();
        color.add("Green");
        color.add("Yellow");
        color.add("Black");
        color.add("Red");
        //Print the list
        System.out.print(color);
        //Retrive the first and third element
        String element = color.get(0);
        System.out.println("First element: "+element);
        element = color.get(2);
        System.out.println("Third element: "+element);

    }
}
