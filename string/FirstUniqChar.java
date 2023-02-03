package string;

import java.util.HashSet;

/*
    Input: s = "leetcode"
    Output: 0
*/

/*
    Input: s = "loveleetcode"
    Output: 2
*/

/*
    Input: s = "aabb"
    Output: -1
*/

public class FirstUniqChar {

    public static void main(String[] arrgs) {

        // ------------------- 1 -------------------
        String s1 = "leetcode";
        System.out.println(myFirstUniqChar(s1));

        // ------------------- 2 -------------------
        String s2 = "loveleetcode";
        System.out.println(myFirstUniqChar(s2));

        // ------------------- 3 -------------------
        String s3 = "aabb";
        System.out.println(myFirstUniqChar(s3));

    }

    public static int myFirstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!s.substring(i + 1, s.length()).contains(Character.toString(s.charAt(i)))
                    && !s.substring(0, i).contains(Character.toString(s.charAt(i))))
                return i;
        }
        return -1;
    }

    public static int bestFirstUniqChar2(String s) {
        HashSet<Character> set = new HashSet<Character>();
        for (char c : s.toCharArray()) {
            if (set.add(c)) {
                int index = s.indexOf(c);
                int lastIndex = s.lastIndexOf(c);
                if (index == lastIndex)
                    return index;
            }
        }
        return -1;
    }

}
