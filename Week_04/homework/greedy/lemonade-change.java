import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean lemonadeChange(int[] bills) {
        Map<Integer, Integer> myMoney = new HashMap<>();
        myMoney.put(5, 0);
        myMoney.put(10, 0);
        myMoney.put(15, 0);
        for (int i = 0; i < bills.length; i++) {
            int currentMoney = bills[i];
            if (currentMoney == 5) {
                myMoney.put(5, myMoney.get(5) + 1);
            } else if (currentMoney == 10) {
                if (myMoney.get(5) == 0) {
                    return false;
                } else {
                    myMoney.put(5, myMoney.get(5) - 1);
                    myMoney.put(10, myMoney.get(10) + 1);
                }
            } else if (currentMoney == 20) {
                if (myMoney.get(5) > 0 && myMoney.get(10) > 0) {
                    myMoney.put(5, myMoney.get(5) - 1);
                    myMoney.put(10, myMoney.get(10) - 1);
                } else if (myMoney.get(5) >= 3) {
                    myMoney.put(5, myMoney.get(5) - 3);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}