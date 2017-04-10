package com.starr.java8.lambda;

public class App {

    public static void main(String[] args) {
        InterfaceWithNoArgs noArgs = () -> System.out.println("Hello!");
        noArgs.sayHello();

        InterfaceWithArgs withArgs = (a, b) -> {
            int result = a + b;
            System.out.println(result);
        };
        withArgs.calculate(5, 7);
    }

}
