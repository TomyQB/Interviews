package string;

import java.util.HashMap;
import java.util.Map;
/*
    Input: s = "anagram", t = "nagaram"
    Output: true
*/

/*
    Input: s = "rat", t = "car"
    Output: false
*/

public class ValidAnagram {

    public static void main(String[] arrgs) {

        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println(isAnagram(s1, t1));

        String s2 = "rat";
        String t2 = "car";
        System.out.println(isAnagram(s2, t2));

    }

    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        if (s.length() != t.length())
            return false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (map.containsKey(c) && map.get(c) > 0) {
                map.put(c, map.get(c) - 1);
            } else {
                return false;
            }
        }

        for (int i : map.values()) {
            if (i > 0)
                return false;
        }

        return true;
    }

}
