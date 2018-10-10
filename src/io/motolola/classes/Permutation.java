package io.motolola.classes;

/**
 * Created by Akinjide Motolola.
 * email: motolola@icloud.com
 */
public class Permutation {
    public static void main(String[] args)
    {
        String str = "abcde";
        char[] inputString = str.toCharArray();
        permutate(inputString, 0);


    }
    /*
    *A recursive function to keep the first, Swap the rest ...
     */
    public static void permutate(char[] strArr, int startIndex)
    {
        if (startIndex == strArr.length-1){ //The Swap is now complete because the
                                            //starting index is now equal to the last index
            System.out.println(strArr);
        } else {

            for (int i = startIndex; i < strArr.length; i++) {
                swap(strArr, startIndex, i); //The rest of the characters are swapped, (thick 3 chars like "abc"
                permutate(strArr, startIndex+1); //Recursive as it passes it to the next, as the index moves right
                swap(strArr, startIndex, i );
            }
        }
    }

    /*
    *This is supposed to swap the positions of two Characters in a String
    * eg, String girl, swap g and r = rigl
     */
    public static void swap(char[] strArray, int pos1, int pos2){
        //char[] strArray = str.toCharArray();
        char temp = strArray[pos1];
        strArray[pos1] = strArray[pos2];
        strArray[pos2] = temp;
    }
}
