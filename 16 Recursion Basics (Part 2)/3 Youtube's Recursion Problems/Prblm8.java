// NOTE : Not Printing Unique Subsequences while Mam's Code doing Well Work

import java.util.HashSet; // It's especially for Hashset
// import java.util.*; // It's for all packages of util including Hashset

public class Prblm8 {
    public static void main(String[] args) {
        // Problem 8 : Print all the Unique Subsequences of a String
        // It will be using Hashset (At this time, We don't know about Hashset but doing this prblm)
        String str = "aaa";
        HashSet<String> set = new HashSet<>();

        printUniqueSubsequences(str, 0, "", set);
    }
    public static void printUniqueSubsequences(String str, int i, String newStr, HashSet<String> set) {
        if (i == str.length()) {
            if (set.contains(newStr)) { // If exists
                return;
            } else { // If not exists
                System.out.print(newStr + " ");
                set.add(newStr);
                return;
            }
        }
        // To be
        char currChar = str.charAt(i);
        printUniqueSubsequences(str, i+1, newStr +currChar, set);
        // Not to be
        char space = '_';
        printUniqueSubsequences(str, i+1, newStr +space, set);
    }   
}