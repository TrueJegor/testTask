package com.company;

import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Fizz Buzz!\nSubmit a number and get an answer!");
        Scanner in = new Scanner(System.in);
        while(true){
            int inputNumber = in.nextInt();
            FizzBuzz fizzBuzz = new FizzBuzz(inputNumber);
            System.out.println(fizzBuzz.solution());
        }
    }
}
