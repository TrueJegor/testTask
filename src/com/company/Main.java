package com.company;

import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Fizz Buzz!\nSubmit a number and get an answer!");
        Scanner in = new Scanner(System.in);
        while(true){
            int number = in.nextInt();
            System.out.println(fizzBuzz(number));
        }
    }

    public static String fizzBuzz(int number) {
        String result = Optional.of(number)
                .map(n -> (n % 3 == 0 ? "Fizz" : "")
                        + (n % 5 == 0 ? "Buzz" : ""))
                .get();
        return result.isEmpty() ? Integer.toString(number) : result;
    }
}
