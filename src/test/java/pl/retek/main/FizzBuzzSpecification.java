package pl.retek.main;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FizzBuzzSpecification {

    private static FizzBuzz fizzBuzz;
    private final static String FIZZ = "Fizz";
    private final static String BUZZ = "Buzz";
    private final static String FIZZ_BUZZ = "FizzBuzz";
    private final static List<String> EXPECTED_NUMBERS = Arrays.asList("1", "2");

    @BeforeClass
    public static void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldReturnNumbers() {
        List<Integer> listOfValues = Arrays.asList(1, 2);
        List<String> list = fizzBuzz.getValues(listOfValues);

        assertEquals(EXPECTED_NUMBERS, list);
    }

    @Test
    public void shouldReturnFizzWhenMultipleThree() {
        List<Integer> listOfValues = new LinkedList<>();
        listOfValues.add(3);
        List<String> list = fizzBuzz.getValues(listOfValues);

        assertEquals(FIZZ, list.get(0));
    }

    @Test
    public void shouldReturnBuzzWhenMultipleFive() {
        List<Integer> listOfValues = new LinkedList<>();
        listOfValues.add(5);
        List<String> list = fizzBuzz.getValues(listOfValues);

        assertEquals(BUZZ, list.get(0));
    }

    @Test
    public void shouldReturnFizzBuzzWhenMultipleThreeAnFive() {
        List<Integer> listOfValues = new LinkedList<>();
        listOfValues.add(15);
        List<String> list = fizzBuzz.getValues(listOfValues);

        assertEquals(FIZZ_BUZZ, list.get(0));
    }
}
