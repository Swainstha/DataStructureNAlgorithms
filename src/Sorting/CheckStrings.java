package Sorting;
import java.util.ArrayList;
import java.util.List;

public class CheckStrings {
    private String name;

    /** return true if there is a same character in the string turned array*/
    public boolean hasDuplicateChars(String s) {

        char[] array = s.toCharArray();
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(array[i] == array[j])
                    return true;
            }
        }
        return false;
    }

    public int numDuplicateChars(String s) {

        int count = 0;
        char[] array = s.toCharArray();
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(array[i] == array[j])
                    count++ ;
            }
        }
        return count;
    }

    /**Checking for anagram.
     * Converting the strings to arrays and comparing each element of string1 to string2.If there is a match the index of the string2 character is
     * added to the list and so the indexes in the list is not further compared with the characters of string1
     * If the same character count matches the length of the string the two strings are the anagram*/

    public boolean isAnagram(String s1, String s2) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        if(s1.length() == s2.length()) {
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            for(int i = 0; i < s1.length(); i++ ) {
                for(int j = 0; j < s1.length(); j++) {
                    if(!list.contains(j)) {
                        if (c1[i] == c2[j] && c1[i] != 32 && c2[i] != 32) {
                            list.add(j);
                            count++;
                        }
                    }
                }
            }
            if(count == s1.length()) {
                return true;
            }
        }
        return false;
    }
}
