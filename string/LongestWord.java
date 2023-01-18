package string;

/*
    Input: string = "Esta es una frase para buscar la palabra mas larga"
    Output: palabra
    Explanation: The longest word is "palabra".
*/

public class LongestWord {

    public static void main(String[] args) {

        String s = "Esta es una frase para buscar la palabra mas larga";
        System.out.println(longestWord(s));

    }

    public static String longestWord(String s) {
        String res = "";
        String word = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (word.length() > res.length()) {
                    res = word;
                }
                word = "";
            } else {
                word += s.charAt(i);
            }
        }
        return res;
    }

}
