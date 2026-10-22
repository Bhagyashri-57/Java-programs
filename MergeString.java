public class MergeString {
    public String mergeAlternately(String word1, String word2) {
        String characters = "";
        int cur_word = 1;
        int a = 0, b = 0;
        int A = word1.length(), B = word2.length();

        while (a < A && b < B) {
            if (cur_word == 1) {
                characters += word1.charAt(a++);
                cur_word = 2;
            } else {
                characters += word2.charAt(b++);
                cur_word = 1;
            }
        }

        while (a < A) {
            characters += word1.charAt(a++);
        }

        while (b < B) {
            characters += word2.charAt(b++);
        }

        return characters;
    }
}
