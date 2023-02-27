package org.example;

public class Trainer {
    private String name;

    public Trainer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Trainer t1 = new Trainer("John Doe");
        Trainer t2 = new Trainer("John Doe");
        System.out.println(t1 == t1);
        System.out.println(t1.equals(t1));
        System.out.println(t1 == t2);
        System.out.println(t1.equals(t2));
    }
}
