package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortLength {
    public static List<String> SortLength(List<String> words)throws EmptyExeption{
        if (words != null && !words.isEmpty()) {
            return words.stream()
                    .sorted((o1, o2) -> o1.length() - o2.length())
                    .collect(Collectors.toCollection(ArrayList::new));
        } else {
            throw new EmptyExeption("List is empty!");
        }
    }
}