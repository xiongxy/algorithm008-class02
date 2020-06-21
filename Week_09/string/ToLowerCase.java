package string;

/**
 * @author xxyWi
 */
public class ToLowerCase {
    public static void main(String[] args) {
        ToLowerCase toLowerCase = new ToLowerCase();
        System.out.println(toLowerCase.toLowerCase("Hello"));
        System.out.println(toLowerCase.toLowerCase("here"));
        System.out.println(toLowerCase.toLowerCase("LOVELY"));
    }

    /**
     * 利用ASCII码来做判断转换
     * @param str
     * @return
     */
    public String toLowerCase(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : str.toCharArray()) {
            char temp;
            if (c > 64 && c < 91) {
                temp = (char) (c + 32);
            } else {
                temp = c;
            }
            stringBuilder.append(temp);
        }
        return stringBuilder.toString();
    }
}
