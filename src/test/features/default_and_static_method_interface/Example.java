package test.features.default_and_static_method_interface;

public class Example implements DefaultAndStaticMethodExample {
    public static void main(String[] args) {
        DefaultAndStaticMethodExample example = new Example();
        example.defaultMethod();
        example.method();

        DefaultAndStaticMethodExample.staticMethod();
    }

    @Override
    public void method() {
        System.out.println("implemented method");
    }
}
