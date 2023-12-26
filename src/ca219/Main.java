package ca219;

import ca219.LinearSearching;

public class Main {
    public static void main(String[] args) {
        System.out.println("Linear Searching....");
       Integer[] numbers = {50 , 60 , 90 , 99 , 100 , 200};

        boolean result = LinearSearching.<Integer>linearSearch(numbers , 0 ,
                numbers.length-1 , 80 );

        if(result)
            System.out.println("Item found");
        else
            System.out.println("Item not found");
    }
}