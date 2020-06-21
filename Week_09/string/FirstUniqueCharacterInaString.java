package string;

import java.util.HashMap;

/**
 * @author xxyWi
 */
public class FirstUniqueCharacterInaString {
    public static void main(String[] args) {
        FirstUniqueCharacterInaString firstUniqueCharacterInaString = new FirstUniqueCharacterInaString();
        System.out.println(firstUniqueCharacterInaString.firstUniqChar("leetcode"));
        System.out.println(firstUniqueCharacterInaString.firstUniqChar("loveleetcode"));

    }

    public int firstUniqChar(String s) {
        var map = new HashMap<Character, Integer>();
        var array = s.toCharArray();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (map.get(array[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}
