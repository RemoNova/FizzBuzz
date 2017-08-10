package pl.retek.main;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String... args) {

        FizzBuzz fizzBuzz = new FizzBuzz();
        List<Integer> integerList = getIntegers();
        long time = System.currentTimeMillis();

        Iterator iterator = fizzBuzz.getValues(integerList).iterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }


        System.out.println("\n time: " + String.valueOf(System.currentTimeMillis() - time));

    }

    private static List<Integer> getIntegers() {
        List<Integer> integerList = new LinkedList<>();

        for(int i=0; i< 100000; i++){
            integerList.add(i);
        }
        return integerList;
    }
}
