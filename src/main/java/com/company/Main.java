package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) throws EmptyExeption{
        List<String> words = new ArrayList<String>();
        Collections.addAll(words, "Four", "Eight", "FiveTeen", "Sixteen", "TwentyThree", "FortyTwo");

        System.out.println("Sorted list:  " + SortLength.SortLength(words));
        System.out.println("Last element:  " + LastElement.LastElement(words));

        List<String> splitList = new ArrayList<String>();
        Collections.addAll(splitList, "Trust me, I'm a programmer");
        System.out.println("Splitted by ,:  "+ Split.Split(splitList));
    }
}