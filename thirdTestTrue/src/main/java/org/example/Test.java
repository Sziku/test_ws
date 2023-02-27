package org.example;

public class Test {
    public void doSomething() {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        try {
            new Test().doSomething();
        } catch (Throwable t) {
            System.out.println("Yupp");
        }
    }
}
