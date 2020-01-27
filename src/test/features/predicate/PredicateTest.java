package test.features.predicate;

import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> (x & 1) == 0;

        if (isEven.test(18)) System.out.println("even");
        else System.out.println("odd");

        Predicate<Integer> greaterThanTen = x -> x > 10;

        if (isEven.and(greaterThanTen).test(18)) System.out.println("even and greater than 10");
        else System.out.println("false returned");
    }
}
