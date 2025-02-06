package com.example.project;
import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    
    
    /** Inserts toInsert after each String in stringList
    *  that contains the letter "i"
    *
    *  DOES mutate (modify) elements of stringList.
    *  PRECONDITION: stringList.size() > 0, toInsert.length() > 0
    *
    *  @param stringList  original arraylist of Strings
    *  @param str String to insert
    */
    public static ArrayList<String> insertAfterI(ArrayList<String> stringList, String str){
        // makes a copy of the array
        ArrayList<String> copyList = new ArrayList<String>();
        //iterates through the array
        for (int i = 0; i < stringList.size(); i ++) {
            // copies the elements over
            copyList.add(stringList.get(i));
            // if the element has an i in it, add the str
            if (stringList.get(i).indexOf("i") != -1) {
                copyList.add(str);
            }
        }
        // sets the original to copy
        stringList = copyList;
        return stringList;
    }



    /** Removes all Strings from stringList that have a length of 3
   *
   *  DOES mutate (modify) elements of stringList.
   *  PRECONDITION: stringList.size() > 0
   *
   *  @param stringList  original arraylist of Strings
   */
    public static ArrayList<String> removeThree(ArrayList<String> stringList){
        // iterates through the list
        for (int i = 0; i < stringList.size(); i ++) {
            // if the element has a length of 3, removes it and removes 1 from i so that it doesnt skip over some
            if (stringList.get(i).length() == 3) {
                stringList.remove(i);
                i -= 1;
            }
        }
        return stringList;
    }



    /** Returns an ArrayList with all elements of arr reversed
   *
   *  Does NOT mutate (modify) elements in intList.
   *  PRECONDITION: intList.size() > 0
   *
   *  @param intList  original array of integers
   */
    public static ArrayList<Integer> reverseArray(int[] intList) {
        // Create a new ArrayList to hold the reversed elements
        ArrayList<Integer> copyList = new ArrayList<Integer>();
        // Loop through the array from the last element to the first
        for (int i = intList.length - 1; i >= 0; i--) {
        // Add each element to the copyList in reverse order
        copyList.add(intList[i]);
        }
        // Return the ArrayList containing the reversed elements
        return copyList;
    }



    /** Appends an uppercase version of each string to the end of wordList;
     *  the uppercase versions appear in the same order as the lowercase versions
     *  for example, if wordList is ["hello", "my", "best", "friend"]
     *  this this method modifies wordList to be:
     *  ["hello", "my", "best", "friend", "HELLO", "MY", "BEST", "FRIEND"]
     *
     *  DOES mutate (modify) elements in wordList
     *  PRECONDITIONS: wordList.size() > 0,
     *                 all words in wordList are initially lowercase
     *
     *  @param wordList  arraylist of Strings
     */
    public static ArrayList<String> duplicateUpperEnd(ArrayList<String> wordList){
        // gets the length of wordList
        int length = wordList.size();
        // adds the uppercased word to wordList
        for (int i = 0; i < length; i ++) {
            wordList.add(wordList.get(i).toUpperCase());
        }
        return wordList;
    }



    /** Returns an arraylist of Strings that represents the input sentence parsed
   *  into separate words, using a single space (" ") as the delimiter
   *
   *  For example, if sentence = "This is my sentence!"
   *  this method return the arraylist: [This, is, my, sentence!]
   *
   *  PRECONDITION: sentence does not end with a space and each word is
   *                separated by exactly one space
   *
   *  @param sentence  the input String
   *  @return  new arraylist of Strings containing the words of sentence
   */

    public static ArrayList<String> parseSentence(String sentence){
        // makes the output array
        ArrayList<String> output = new ArrayList<String>();
        // runs while the string has words
        while (sentence.length() > 0) {
            // finds the index of the space
            int spaceIndex = sentence.indexOf(" ");
            // runs to get the final word
            if (spaceIndex == -1) {
                output.add(sentence);
                break;
            }
            // adds the word up until the space
            output.add(sentence.substring(0, spaceIndex));
            // afterwards remove the word including the space
            sentence = sentence.substring(spaceIndex + 1);
        }
        return output;
    }



    /** Moves all words in wordList that begin with "b" to the front of
   *  wordList; all "b" words that are moved should appear in the same order
   *  in the modified arrayList as they did before being moved
   *
   *  For example, this method will take a wordList:
   *  ["apple", "banana", "cherry", "donut", "Bagel", "danish", "berry", "baguette", "soda"]
   *  and modify it to
   *  ["banana", "Bagel", "berry", "baguette", "apple", "cherry", "donut", "danish", "soda"]
   *
   *  DOES mutate (modify) elements in wordList
   *  PRECONDITIONS: - wordList.size() > 0
   *                 - all strings in wordList have length >= 1
   *
   *  @param wordList  arraylist of words
   */
    public static ArrayList<String> moveBWords(ArrayList<String> wordList){
        // makes two array that contain words that start with b or B and words that do not
        ArrayList<String> bWords = new ArrayList<>();
        ArrayList<String> nonBWords = new ArrayList<>();
        // travels through wordList
        for (int i = 0; i < wordList.size(); i ++) {
            // if the word starts with b or B, add it to b list
            if (wordList.get(i).substring(0, 1).equals("b") || wordList.get(i).substring(0, 1).equals("B")) {
                bWords.add(wordList.get(i));
            }
            // else adds it to the non b list
            else {
                nonBWords.add(wordList.get(i));
            }
        }
        // adds the non b list to the b list afterwards
        for (int i = 0; i < nonBWords.size(); i ++) {
            bWords.add(nonBWords.get(i));
        }
        wordList = bWords;
        return wordList;
    }



    /** Removes all duplicate values from an intList, leaving only the first
     *  occurrence in the arrayList; for example, this method will modify
     *  [1, 2, 5, 4, 2, 2, 1, 6, 4, 4, 8, 1, 7, 4, 2] --> [1, 2, 5, 4, 6, 8, 7]
     *
     *  DOES mutate (modify) elements in intList
     *  PRECONDITION: intList.size() > 0
     *
     *  @param intList  intList of Integers
     */
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> intList){
        // makes a copy
        ArrayList<Integer> copy = new ArrayList<Integer>();
        // iterates through intList
        for (int i = 0; i < intList.size(); i ++) {
            // if the copy does not already contain the number, add it
            if (!copy.contains(intList.get(i))) {
                copy.add(intList.get(i));
            }
        }
        intList = copy;
        return intList;
    }

    // Given an array of ints, 
    // return true if the array is length 1 or more, 
    // and the first element and the last element are equal.
    // sameFirstLast([1, 2, 3]) → false
    // sameFirstLast([1, 2, 3, 1]) → true
    // sameFirstLast([1, 2, 1]) → true
    //sameFirstLast([]) -> false
    public static boolean sameFirstLast(ArrayList<Integer> list){
        // returns false if theres nothing
        if (list.size() == 0) {
            return false;
        }
        // finds the first and last integer
        Integer first = list.get(0);
        Integer last = list.get(list.size() - 1);
        // compares the two
        if (last.equals(first)) {
            return true;
        }
        return false;
    }



    // Given an array of ints, swap the first and last elements in the array. 
    // Return the modified array. The array length will be at least 1.
    // swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
    // swapEnds([1, 2, 3]) → [3, 2, 1]
    // swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
    // swapEnds([]->[])
    public static ArrayList<Integer> swapEnds(ArrayList<Integer> list){     
        // returns the list if its empty   
        if (list.size() == 0) {
            return list;
        }
        // finds and remove the first and last number
        Integer first = list.remove(0);
        Integer last = list.remove(list.size() - 1);
        // adds the last to first and first to last
        list.add(0, last);
        list.add(first);
        return list;
    }



    // Return an array that contains the exact same numbers as the given array, 
    // but rearranged so that all the zeros are grouped at the start of the array. 
    // The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. 
    // You may modify and return the given array or make a new array.
    // zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
    // zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
    // zeroFront([1, 0]) → [0, 1]
    public static ArrayList<Integer> zeroFront(ArrayList<Integer> list){
        // makes two array with zero and nonzero
        ArrayList<Integer> zero = new ArrayList<>();
        ArrayList<Integer> nonZero = new ArrayList<>();
        // iterates through the list
        for (int i = 0; i < list.size(); i ++) {
            // if the number is a 0 add it to zero array
            if (list.get(i) == 0) {
                zero.add(list.get(i));
            }
            // else add it to non zero array
            else {
                nonZero.add(list.get(i));
            }
        }
        // adds the non zero to zero
        for (int i = 0; i < nonZero.size(); i ++) {
            zero.add(nonZero.get(i));
        }
        list = zero;
        return list;
    }



    // We'll say that an element in an array is "alone" if there are values before and after it, 
    // and those values are different from it. If the value is at the end compare to the left and if its at the beginning compare to the right
    //Return a version of the given array where every instance 
    // of the given value which is alone is replaced by whichever value to its left or right is larger.
    // notAlone([1, 2, 3], 2) → [1, 3, 3]
    // notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 5]
    // notAlone([3, 4], 3) → [4,4]
    public static ArrayList<Integer> notAlone(ArrayList<Integer> list, int val){
        // iterates through the array
        for (int i = 0; i < list.size(); i ++) {
            // if the number is to the far left and is the val and is less than the number to its right, sets it to the number to its right
            if (list.get(i) == val && i == 0 && list.get(i) < list.get(i + 1)) {
                list.set(i, list.get(i + 1));
            }
            // if the number is to the far right and is the val and is less than the number to its left, sets it to the number to its left
            else if (list.get(i) == val && i == list.size() - 1 && list.get(i - 1) > list.get(i)) {
                list.set(i, list.get(i - 1));
            }
            // is here to stop index out of bounds if the first if does not work
            else if (i != 0 && i != list.size() - 1) {
                // if the number is val and the numbers to its sides are different, runs the code
                if (list.get(i) == val && list.get(i - 1) != val && list.get(i + 1) != val) {
                    // if the number to the left is greater, sets it to the left
                    if (list.get(i - 1) > list.get(i + 1)) {
                        list.set(i, list.get(i - 1));
                    }
                    // else sets it to the right
                    else {
                        list.set(i, list.get(i + 1));
                    }
                }
            }
        }
        return list;
    }



    // Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. 
    // You may modify and return the given array;
    // shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
    // shiftLeft([1, 2]) → [2, 1]
    // shiftLeft([1]) → [1]

    public static ArrayList<Integer> shiftLeft(ArrayList<Integer> list){
        // finds the first value and removes it
        Integer first = list.remove(0);
        // makes a copy
        ArrayList<Integer> copy = new ArrayList<Integer>();
        // adds the remaining value to the copy
        for (int i = 0; i < list.size(); i ++) {
            copy.add(list.get(i));
        }
        // adds the first value to the last position
        copy.add(first);
        list = copy;
        return list;
    }
    


    // Return an array that contains exactly the same numbers as the given array, 
    // but rearranged so that every 3 is immediately followed by a 4. Do not move the 3's, 
    // but every other number may move. The array contains the same number of 3's and 4's, 
    // every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.
    // fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
    // fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
    // fix34([3, 2, 2, 4]) → [3, 4, 2, 2]

    public static ArrayList<Integer> fix34(ArrayList<Integer> list){
        // iterates through the list backwards so that it does not take a 4 that is already fixed to a 3 in the front
        for (int i = list.size() - 1; i >= 0; i --) {
            // skips the last index to prevent out of bounds
            if (i != list.size() - 1) {
                // runs if the number is 3 and the number after is not a 4
                if (list.get(i) == 3 && list.get(i + 1) != 4) {
                    // gets  the number in front of 3
                    Integer toBeReplaced = list.get(i + 1);
                    // gets the index of the 4
                    Integer indexOfFour = list.indexOf(4);
                    // replaces the 4 with the to be replaced number
                    Integer isFour = list.set(indexOfFour, toBeReplaced);
                    // sets 4 after 3
                    list.set(i + 1, 4);
                }
            }
        }
        return list;
    }



    /** Returns an arraylist of Integers that contain all mode(s) of the array numList.
   *  The mode of a list is the value that appears the greatest number of times.
   *  A list can have one mode, multiple mode, or no mode.
   *
   *  If all elements in the list appear the exact same number of times, there is no
   *  mode and this method should return an empty arraylist.
   *
   *  For example, if numList is: [1, 2, 6, 2, 3, 4, 6, 5, 5, 6, 7],
   *  then numList contains one mode: 6
   *  and this method returns an arrayList containing 6
   *
   *  If numList is: [1, 2, 3, 2, 4, 5, 5, 6],
   *  then numList contains two modes: 2, 5
   *  and this method returns an arraylist containing 2 and 5 (in any order)
   *
   *  If numList is: [1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6],
   *  then numList contains no mode because all values appear the same number of times
   *  and this method returns an empty arrayList: []
   *
   *  Does NOT mutate (modify) elements in numList
   *  PRECONDITIONS: numList.length > 0
   *
   *  @param numList  numList of ints
   */
    public static ArrayList<Integer> modes(int[] numList){
        // array to store the modes
        ArrayList<Integer> mode = new ArrayList<Integer>();
        // array to return if there is no mode
        ArrayList<Integer> empty = new ArrayList<Integer>();
        // array to copy over
        ArrayList<Integer> copy = new ArrayList<Integer>();
        // array that is the numList condensed
        ArrayList<Integer> toBeCondensed = new ArrayList<Integer>();
        // copies numList to condensed and copy list and turns it into ArrayList
        for (int i = 0; i < numList.length; i++) {
            toBeCondensed.add(numList[i]);
        }
        for (int i = 0; i < numList.length; i++) {
            copy.add(numList[i]);
        }
        // condenses the list
        ArrayList<Integer> condensed = removeDuplicates(toBeCondensed);
        // makes a repeated times list
        ArrayList<Integer> repeatedTimes = new ArrayList<Integer>();
        // greatest number of times a number has repeated
        int greatestCount = 0;

        // iterates to find how many times a number repeats
        for (int i = 0; i < condensed.size(); i ++) {
            // sets the repeat to 0
            int numCount = 0;
            // while the list still contains the number, runs
            while (copy.contains(condensed.get(i))) {
                // runs to the end of the list
                for (int j = 0; j < copy.size(); j ++) {
                    // if the element of the list is equal to the element of the condensed list, remove it and add it to number count
                    if (copy.get(j) == condensed.get(i)) {
                        copy.remove(j);
                        numCount ++;
                    }
                }
            }
            // adds the time the number is repeated
            repeatedTimes.add(numCount);
        }

        // iterates through repeatedTimes
        for (int i = 0; i < repeatedTimes.size(); i ++) {
            // finds the greatest time a number has been repeated
            if (repeatedTimes.get(i) > greatestCount) {
                greatestCount = repeatedTimes.get(i);
            }
        }

        // iterates through repeated times
        for (int i = 0; i < repeatedTimes.size(); i ++) {
            // if the number to repeated is the same as the greatest, adds it to modde array
            if (repeatedTimes.get(i) == greatestCount) {
                mode.add(condensed.get(i));
            }
        }
        // if the length of mode is equal to repeatedTimes (same length as conddensed), then return empty because every number repeated the same amount of time
        if (mode.size() == repeatedTimes.size()) {
            return empty;
        }
        return mode;
    }
}
