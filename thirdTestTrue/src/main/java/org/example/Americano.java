package org.example;

import java.util.ArrayList;
import java.util.List;

public class Americano extends CoffeeType{
    private List<String> ingrediens;

    public Americano()  {
        ingrediens = new ArrayList<>();
    }

    @Override
    public List<String> getIngredients() {
        ingrediens.add("Coffee");
        ingrediens.add("Water");
        ingrediens.add("Sugar");

        return ingrediens;
    }
}
