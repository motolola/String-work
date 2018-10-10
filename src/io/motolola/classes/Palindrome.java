package io.motolola.classes;

import java.util.Arrays;

/**
 * Created by Akinjide Motolola.
 * email: motolola@icloud.com
 * This class is to check whether a given string is a palindrome, i.e it is the same when
 * read backwards, eg madam
 */
public class Palindrome {

    public static void main(String[] args)
    {
        System.out.println(palindrome("Madam"));
    }

    public static boolean palindrome(String str)
    {
        str = str.toLowerCase();
        char[] strArr = str.toCharArray();
        String strCheck = "";
        for(int i = str.length() - 1; i >=0 ; i--){
            strCheck = strCheck+strArr[i];
        }
        return (Arrays.equals(strArr, strCheck.toCharArray()))? true : false;
    }
}
