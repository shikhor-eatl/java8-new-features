package test.features.default_and_static_method_interface;

public interface DefaultAndStaticMethodExample {
    void method();

    //~ default is for backward compatibility:
    default void defaultMethod() {
        System.out.println("this is a default method");
    }

    //~ static method is called only by Interface Class, not by instance.
    //~ e.g. utility methods can be declared as static methods.
    static void staticMethod() {
        System.out.println("static Method");
    }
}
