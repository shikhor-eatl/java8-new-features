package test.features.lambda;

public class HelloWorldPrinter implements Printer {
    @Override
    public void printMessage() {
        System.out.println("Hello World");
    }
}
