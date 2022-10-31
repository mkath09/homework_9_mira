package Homework_week9;

import java.util.HashMap;

/*
Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map
 */
public class Programme_9_People {
    public static void main(String[] args) {

        //Creating a HasMap object called people
        HashMap<String, Integer> people = new HashMap<String, Integer>();


        // Add keys and values (Name, Age)
        people.put("Arjun", 32);
        people.put("Ram", 30);
        people.put("Sita", 33);

        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }


    }
}
