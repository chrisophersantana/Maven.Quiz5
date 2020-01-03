package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {

        ArrayList<String> list = new ArrayList<>();


        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j <= string.length(); j++) {
                if(!list.contains(string.substring(i, j))) {
                    list.add(string.substring(i, j));
                }
            }
        }
        String[] allsubber = list.toArray(new String[list.size()]);
        return allsubber;
    }


    public static String[] getCommonSubstrings(String string1, String string2) {
        ArrayList<String> temp = new ArrayList<>();

        String [] subber1 = getAllSubstrings(string1);

        String[] subber2 = getAllSubstrings(string2);

        for (String word:subber1) {
            for (String word2: subber2) {
                if(word2.equals(word)){
                    temp.add(word2);
                }
            }
        }
        String[] commonsubs = temp.toArray(new String[temp.size()]);
        return commonsubs;
    }






    public static String getLargestCommonSubstring(String string1, String string2) {

        String [] large = getCommonSubstrings(string1,string2);
        String currentBiggest = large[0];

        for (String str: large) {
            if(str.length() > currentBiggest.length()){
                currentBiggest = str;
            }
        }
        return currentBiggest;
    }
}
