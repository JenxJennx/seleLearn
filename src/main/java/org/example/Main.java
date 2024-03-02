package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayOfWeek = scanner.nextInt();
        System.out.println("Specify between 1-7: What day of the week is it? ");

       switch(dayOfWeek){
           case 1:
               System.out.println("Monday");
               break;
           case 2:
               System.out.println("Tuesday");
               break;
           case 3:
               System.out.println("Wednesday");
               break;
           case 4:
               System.out.println("thursday");
               break;
           case 5:
               System.out.println("Friday");
               break;
           case 6:
               System.out.println("Saturday");
               break;
           case 7:
               System.out.println("Sunday");
               break;
           default:
               System.out.println("Not a number from 1-7 babes");
               break;
       }

    }
}