package org.example;


import org.example.ExcercicesNotés.Rectangle;
import org.example.ExcercicesNotés.Square;

public class Main {
    public static void main(String[] args) {
        Exercise exercise = new Exercise();

        Square carré = new Square(3, 5);

        carré.display();
        System.out.println(carré.area());


        /*System.out.println(exercise.reverseString("Test String"));

        exercise.pyramid();
        exercise.pyramid(7);

        System.out.println(exercise.sumTo10000());

        exercise.checkNumber();*/
    }
}