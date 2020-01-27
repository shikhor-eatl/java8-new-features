package test.features.function;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {

        Function<String, Integer> trimAndCountChars = (s) -> {
            s = s.trim();
            System.out.println("---> |" + s + "| <---");
            return s.length();
        };

        System.out.println(trimAndCountChars.apply(" this "));
    }
}
