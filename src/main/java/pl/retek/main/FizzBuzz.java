package pl.retek.main;


import java.util.List;
import java.util.stream.Collectors;


public final class FizzBuzz implements FizzBuzzInterface {

    private final static String FIZZ = "Fizz";
    private final static String BUZZ = "Buzz";
    private static StringBuilder stringBuilder;

    @Override
    public int hashCode() {
        return FIZZ.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public List<String> getValues(List<Integer> list) {

        return list.stream().map(this::convert).collect(Collectors.toList());
    }

    private String convert(Integer integer) {
        stringBuilder = new StringBuilder();
        if ( integer % 3 == 0 )
            stringBuilder.append(FIZZ);
        if (integer % 5 == 0)
            stringBuilder.append(BUZZ);

        return stringBuilder.toString().isEmpty() ? String.valueOf(integer) : stringBuilder.toString();
    }
}