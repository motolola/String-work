package io.motolola.classes;

import java.util.Arrays;

public class StringIntegerConversion {

    public static void main(String[] args)
    {
        System.out.println(intToString(345));
        System.out.println(stringToInt("348"));
        System.out.println(strReverse("boy"));
        System.out.println(strReverse2("Congratulations"));

    }

    public static String intToString(int number)
    {
        return String.valueOf(number);
    }
    public static int stringToInt(String str)
    {
        //return Integer.valueOf(str); Also a goog choice.
        return Integer.parseInt(str);
    }
    public static String strReverse(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    public static String strReverse2(String str)
    {
        char[] arr = str.toCharArray();
        int index = str.length() - 1;
        String rev = "";
        for (int i = index; i >= 0; i-- ){
            rev += str.charAt(i);
        }
        return rev;
    }
}
