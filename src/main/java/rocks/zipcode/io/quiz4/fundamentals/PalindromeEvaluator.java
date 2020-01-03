package rocks.zipcode.io.quiz4.fundamentals;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        return null;
    }

    public static Boolean isPalindrome(String string) {
        int i = 0,
        j = string.length()-1;

        while (i < j){
            if(string.charAt(i) != string.charAt(j))
                return false;
            i++;
            j++;
        }


        return true;
    }

    public static String reverseString(String string) {
        StringBuilder toReverse = new StringBuilder();
        toReverse.append(string);
        toReverse = toReverse.reverse();

        return toReverse.toString();
    }
    }

