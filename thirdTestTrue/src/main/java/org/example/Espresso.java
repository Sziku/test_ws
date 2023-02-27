package org.example;

import java.util.ArrayList;
import java.util.List;

public class Espresso extends CoffeeType{
    private List<String> ingrediens;

    public Espresso() {
        ingrediens = new ArrayList<>();
    }

    @Override
    public List<String> getIngredients() {
        ingrediens.add("Coffee");
        ingrediens.add("Sugar");

        return ingrediens;
    }
}
