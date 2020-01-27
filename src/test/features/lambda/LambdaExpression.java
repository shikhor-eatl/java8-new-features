package test.features.lambda;

public class LambdaExpression {

    public static void main(String[] args) {
        //~ interface implementation:
        Printer printer = new HelloWorldPrinter();
        printer.printMessage();

        //~ lambda expression:
        printer = () -> System.out.println("\nHi World! I'm lambda expression.");
        printer.printMessage();
    }
}
