package Homework_week9;

import java.util.ArrayList;

/*
Write a Java program to test an array list is empty or not. Define array list with
underground tube names
 */
public class Programme_7_UnderGroundTubeName {
    public static void main(String[] args) {
        // creating an Empty ArrayList
        ArrayList<String> tubeName = new ArrayList();
        tubeName.add("Jubilee");
        tubeName.add("Metropolitan");
        tubeName.add("District");
        tubeName.add("Victoria");

        for (String string : tubeName) {
            System.out.println(tubeName);
        }
        //Test whether the array is empty or not.
        if (tubeName.isEmpty()) {
            System.out.println("The ArrayList is empty");

        } else {
            System.out.println("The ArrayList is not empty");
        }


    }
}
