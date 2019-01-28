//Return the number (count) of vowels in the given string.
//
//We will consider a, e, i, o, and u as vowels for this Kata.
//
//The input string will only consist of lower case letters and/or spaces.
package codewars;

public class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char sym = str.charAt(i);
            if (sym == 'a' || sym == 'e' || sym == 'i' || sym == 'o' || sym == 'u') {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

}


