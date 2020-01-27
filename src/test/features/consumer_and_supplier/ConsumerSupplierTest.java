package test.features.consumer_and_supplier;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerSupplierTest {
    public static void main(String[] args) {
        Consumer<Integer> consumer = System.out::println;
        consumer.accept(10);

        Supplier<Integer> supplier = "supplier"::length;
        System.out.println(supplier.get());
    }
}
