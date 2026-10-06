/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        HashMap<Integer, ListNode> map = new HashMap<>();
        int preSum = 0;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        //         Node:        1     2      3      -3      1
        //                      ↓     ↓      ↓      ↓      ↓
        //         Prefix:      1     3      6       3      4

        ListNode temp = dummy;

        while (temp != null) {
            preSum += temp.val;
            map.put(preSum, temp);
            temp = temp.next;
        }
        preSum = 0;
        temp = dummy;
        while (temp != null) {
            preSum += temp.val;
            ListNode prev = map.get(preSum);
            temp.next = prev.next;
            temp = temp.next;
        }

        return dummy.next;

    }
}