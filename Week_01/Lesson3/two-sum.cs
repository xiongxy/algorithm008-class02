
//暴力求解
public class Solution
{
    public int[] TwoSum(int[] nums, int target)
    {
        for (int i = 0; i < nums.Length; i++)
        {
            for (int j = i + 1; j < nums.Length; j++)
            {
                if (nums[j] == target - nums[i])
                {
                    return new int[] { i, j };
                }
            }
        }
        throw new Exception("Error");
    }
}

//Dictionary
public class Solution
{
    public int[] TwoSum(int[] nums, int target)
    {
        Dictionary<int, int> dic = new Dictionary<int, int>();
        for (int i = 0; i < nums.Length; i++)
        {
            var result = target - nums[i];
            if (!dic.ContainsKey(result))
            {
                dic.TryAdd(nums[i], i);
            }
            else
            {
                var hashSet = dic[result];

                return new int[] { hashSet, i };
            }
        }
        throw new Exception("Error");
    }