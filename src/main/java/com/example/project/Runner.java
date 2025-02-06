package com.example.project;
import java.util.*;

public class Runner {
    public static void main(String[] args) {
        // ArrayList<String> list = new ArrayList<String>(Arrays.asList("the", "not", "skim", "pat", "a", "rat", "cat", "sit", "truck", "par", "tar"));
        // ArrayList<String> list = new ArrayList<String>(Arrays.asList("apple", "banana", "cherry", "donut", "Bagel", "danish", "berry", "baguette", "soda"));
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 2, 4, 5, 5, 6));
        int[] intList18 = {1, 2, 3, 2, 4, 5, 5, 6};
        // System.out.println(Main.removeThree(list));
        // System.out.println(Main.insertAfterI(list, "bob"));
        // System.out.println(Main.duplicateUpperEnd(list));
        // System.out.println(Main.parseSentence("This is my sentence"));
        // int[] intList = {1, 2, 3, 4, 5, 6, 7};
        // System.out.println(Main.reverseArray(intList));
System.out.println(Main.removeDuplicates(list));
        System.out.println(Main.modes(intList18));

    }
}