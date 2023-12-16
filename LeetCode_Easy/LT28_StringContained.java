package LeetCode_Easy;

public class LT28_StringContained {
    public static void main(String[]args){
        /*
        Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

        Example 1:

        Input: haystack = "sadbutsad", needle = "sad"
        Output: 0
        Explanation: "sad" occurs at index 0 and 6.
        The first occurrence is at index 0, so we return 0.

        Example 2:

        Input: haystack = "leetcode", needle = "leeto"
        Output: -1
        Explanation: "leeto" did not occur in "leetcode", so we return -1.
        
        https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

        */
        
        String haystack="butsad";
        String needle="sad";
        
        System.out.println(strStr(haystack, needle));

    }
    public static int strStr(String haystack,String needle){
        
        //variables
        int position;
        
        //programa
        if(haystack.contains(needle)){//comprobamos si nuestra palabra esta contenida en la otra
            position=haystack.indexOf(needle);//mira la posicion en la que encontramos nuestra palabra 
            return position;
        }
        return -1;
    }
}
