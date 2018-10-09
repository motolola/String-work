package io.motolola.classes;

public class StringIntegerConversion {

    public static void main(String[] args)
    {
        System.out.println(intToString(345));
        System.out.println(stringToInt("348"));
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
}
