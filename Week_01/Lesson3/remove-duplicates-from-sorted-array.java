public static int removeDuplicates(int[] nums) {
    int j = 0;
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] != nums[j]) {
            nums[++j] = nums[i];
        }
    }
    return j + 1;
}

public static int removeDuplicates(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    int j = 0;//要被排除掉的
    for (int i = 0; i < nums.length; i++) {
        if (!map.containsKey(nums[i])) {
            nums[j] = nums[i];
            map.put(nums[i], 0);
            j++;
        }
    }
    return j + 1;
}