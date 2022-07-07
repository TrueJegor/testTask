package com.company;

import java.util.Optional;

public class FizzBuzz {

    private int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public String solution() {
        String result = Optional.of(number)
                .map(n -> (n % 3 == 0 ? "Fizz" : "")
                        + (n % 5 == 0 ? "Buzz" : ""))
                .get();
        return result.isEmpty() ? Integer.toString(number) : result;
    }
}
