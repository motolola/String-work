package io.motolola.classes;

import java.util.Arrays;

public class AnagramChecker {

    public static void main(String[] args)
    {
        System.out.println(isAnagram("listen", "enlist"));
    }

    public static Boolean isAnagram(String word1, String word2)
    {
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return (Arrays.equals(arr1, arr2)) ? true: false;
    }
}
