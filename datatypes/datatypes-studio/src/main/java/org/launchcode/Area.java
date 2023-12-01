package org.launchcode;

import studios.areaofacircle.Circle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        double radius;
//        double area;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius");
        radius=input.nextDouble();

        while (radius < 0) {
            System.out.println("Enter a positive number");
            radius=input.nextDouble();
        }

//        area = 3.14*radius*radius;
        double area = Circle.getArea(radius);

        System.out.println("The area of a circle of radius " + radius + " is: " + area);


//        if (input.hasNextDouble()) {
//            radius=input.nextDouble();
//            area = Circle.getArea(radius);
//            if (radius<0) {
//                System.out.println("Enter a positive number");
//                radius=input.nextDouble();
//            }
//            System.out.println("The area of a circle of radius " + radius + " is: " + area);
//            input.close();
//        } else {
//            System.out.println("Error: invalid input");
//            input.close();
//        }



        //        do {
//            System.out.println("Enter a radius");
//            radius=input.nextDouble();
//        } while (radius < 0);





    }

}
