public class Solution
{
    public ListNode MergeTwoLists(ListNode l1, ListNode l2)
    {
        ListNode dummy = new ListNode(-1);
        var root = dummy;
        while (l1 != null && l2 != null)
        {
            if (l1.val < l2.val)
            {
                root.next = l1;
                l1 = l1.next;
            }
            else
            {
                root.next = l2;
                l2 = l2.next;
            }
            root = root.next;
        }

        if (l1 == null)
        {
            root.next = l2;
        }
        if (l2 == null)
        {
            root.next = l1;
        }
        return dummy.next;
    }
}

//使用递归一直弄不明白，以前数学归纳法没有学好，痛苦。