package com.company;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @org.junit.jupiter.api.Test
    void solutionTestMethod() {
        int numberTest = 5;
        FizzBuzz fizzBuzz = new FizzBuzz(numberTest);
        assertEquals("Buzz",fizzBuzz.solution());
    }

    @org.junit.jupiter.api.Test
    void solutionTestMethod2() {
        int numberTest = 3;
        FizzBuzz fizzBuzz = new FizzBuzz(numberTest);
        assertEquals("Fizz",fizzBuzz.solution());
    }

    @org.junit.jupiter.api.Test
    void solutionTestMethod3() {
        int numberTest = 15;
        FizzBuzz fizzBuzz = new FizzBuzz(numberTest);
        assertEquals("FizzBuzz",fizzBuzz.solution());
    }
}