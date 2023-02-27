package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cappuccino extends CoffeeType{
    private List<String> ingrediens;

    public Cappuccino() {
        ingrediens = new ArrayList<>();
    }

    @Override
    public List<String> getIngredients() {
        ingrediens.add("Coffee");
        ingrediens.add("Milk");
        ingrediens.add("Sugar");

        return ingrediens;
    }
}
