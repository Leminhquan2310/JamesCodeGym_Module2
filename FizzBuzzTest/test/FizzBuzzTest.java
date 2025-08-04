import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void getFizzBuzz1() {
        int input = 3;
        String expected = "Fizz";
        assertEquals(expected, FizzBuzz.getFizzBuzz(input));
    }

    @Test
    void getFizzBuzz2() {
        int input = 5;
        String expected = "Buzz";
        assertEquals(expected, FizzBuzz.getFizzBuzz(input));
    }

    @Test
    void getFizzBuzz3() {
        int input = 7;
        String expected = "Seven";
        assertEquals(expected, FizzBuzz.getFizzBuzz(input));
    }

    @Test
    void getFizzBuzz4() {
        int input = 15;
        String expected = "FizzBuzz";
        assertEquals(expected, FizzBuzz.getFizzBuzz(input));
    }

    @Test
    void getFizzBuzz5() {
        int input = 32;
        String expected = "Thirty Two";
        assertEquals(expected, FizzBuzz.getFizzBuzz(input));
    }

    @Test
    void getFizzBuzz6() {
        int input = -1;
        String expected = "không hợp lệ";
        assertEquals(expected, FizzBuzz.getFizzBuzz(input));
    }

    @Test
    void getFizzBuzz7() {
        int input = 101;
        String expected = "không hợp lệ";
        assertEquals(expected, FizzBuzz.getFizzBuzz(input));
    }
}