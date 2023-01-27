package string;

/*
    Input: s = "A man, a plan, a canal: Panama"
    Output: true
    Explanation: "amanaplanacanalpanama" is a palindrome.
*/

/*
    Input: s = "race a car"
    Output: false
    Explanation: "raceacar" is not a palindrome.
*/

/*
    Input: s = " "
    Output: true
    Explanation: s is an empty string "" after removing non-alphanumeric characters.
    Since an empty string reads the same forward and backward, it is a palindrome.
*/

/*
    Input: s = "0P"
    Output: false
*/

public class ValidPalindrome {

    public static void main(String[] arrgs) {

        String s1 = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s1));

        String s2 = "race a car";
        System.out.println(isPalindrome(s2));

        String s3 = " ";
        System.out.println(isPalindrome(s3));

        String s4 = "0P";
        System.out.println(isPalindrome(s4));

    }

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        if (s.length() <= 1)
            return true;

        while (i <= j) {
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if (!Character.isLetter(ci) && !Character.isDigit(ci)) {
                i++;
            }
            if (!Character.isLetter(cj) && !Character.isDigit(cj)) {
                j--;
            }
            if ((Character.isLetter(ci) || Character.isDigit(ci))
                    && (Character.isLetter(cj) || Character.isDigit(cj))) {
                if (Character.toLowerCase(ci) != Character.toLowerCase(cj)) {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }

}
