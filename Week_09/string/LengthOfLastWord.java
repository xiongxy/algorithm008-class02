package string;

/**
 * @author xxyWi
 */
public class LengthOfLastWord {
    public static void main(String[] args) {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        System.out.println(lengthOfLastWord.lengthOfLastWord("day"));
        System.out.println(lengthOfLastWord.lengthOfLastWord("b   a    "));
        System.out.println(lengthOfLastWord.lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord.lengthOfLastWord(" "));
    }

    public int lengthOfLastWord(String s) {
        var len = s.length();
        if (len == 0) {
            return 0;
        }
        var sArray = s.toCharArray();
        for (int i = sArray.length - 1; i >= 0; i--) {
            if (sArray[i] != ' ') {
                len = i;
                break;
            }
            if (sArray[i] == ' ') {
                len = i - 1;
            }
        }
        if (len < 0) {
            return 0;
        }
        for (int i = len; i >= 0; i--) {
            if (sArray[i] == ' ') {
                return len - i;
            }
        }
        return len + 1;
    }
}
