import java.util.TreeSet;

/**
 * @Auther: lss
 * @Date: 2019/2/20 21:02
 * @Description:
 */
public class Solution {

    public int uniqueMorseRepresentations(String[] words) {
        String[] codes = {
                ".-", "-...", "-.-.", "-..", ".",
                "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---", ".--.",
                "--.-", ".-.", "...", "-", "..-", "...-",
                ".--", "-..-", "-.--", "--.."};

        TreeSet<String> set = new TreeSet<>();
        for (String word : words) {
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < word.length(); i++)
                res.append(codes[word.charAt(i) - 'a']);

            set.add(res.toString());
        }
        return set.size();
    }
}
