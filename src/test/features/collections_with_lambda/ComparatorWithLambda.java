package test.features.collections_with_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComparatorWithLambda {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(5, 2, 7, 10, 2, 1, 4, 8));
        //~ sort in reverse order:
        integerList.sort((first, second) -> -first.compareTo(second));

        System.out.println(integerList);
    }
}
