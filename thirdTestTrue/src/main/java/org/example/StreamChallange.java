package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class StreamChallange {
    public static List<Integer> getEvenNumbers(List<String> numberStrings) {
        // TODO write your solution here
       return numberStrings.stream()
                .map(num -> Integer.parseInt(num) )
                .filter(n -> n%2 == 0)
                .collect(Collectors.toList());
    }
}
