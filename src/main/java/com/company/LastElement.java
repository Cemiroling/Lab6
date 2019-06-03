package com.company;

import java.util.List;

public class LastElement {
    public static String LastElement(List<String> words)throws EmptyExeption{
        if (words != null && !words.isEmpty()) {
            return  words.stream()
                    .reduce((first, second) -> second)
                    .get();
        } else {
            throw new EmptyExeption("List is empty!");
        }
    }
}