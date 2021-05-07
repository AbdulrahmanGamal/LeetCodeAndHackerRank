package hackerrank;

import java.util.HashSet;
import java.util.Set;
//problem link on hacker rank
//https://www.hackerrank.com/challenges/two-strings/problem

public class TwoStrings {
    public static String twoStrings(String s1, String s2) {
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            characterSet.add(s1.charAt(i));
        }
        for (int i = 0; i < s2.length(); i++) {
            boolean contains = characterSet.contains(s2.charAt(i));
            if (contains) {
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        System.out.println(twoStrings("wouldyoulikefries", "abcabcabcabcabcabc"));

    }
}
