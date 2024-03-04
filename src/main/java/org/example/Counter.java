package org.example;

public class Counter {
    private static int count = 0;

    public Counter(){
        System.out.println("SBIC");
        count++;
    }
    public static int getCount(){
        return count;
    }
}
