package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Split {
    public static List<String> Split(List<String> words)throws EmptyExeption{
        if (words != null && !words.isEmpty()) {
            return  words.stream()
                    .flatMap((p) -> Arrays.asList(p.split(",")).stream())
                    .collect(Collectors.toCollection(ArrayList::new));
        } else {
            throw new EmptyExeption("List is empty!");
        }
    }
}