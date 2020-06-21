package string;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author xxyWi
 */
public class JewelsAndStones {
    public static void main(String[] args) {
        JewelsAndStones jewelsAndStones = new JewelsAndStones();
        jewelsAndStones.numJewelsInStones("aA", "aAAbbbb");
    }

    public int numJewelsInStones(String J, String S) {
        var set = new HashSet<>();
        for (char c : J.toCharArray()) {
            set.add(c);
        }
        int res = 0;
        for (char c : S.toCharArray()) {
            if (set.contains(c)) {
                res++;
            }
        }
        return res;
    }
}
