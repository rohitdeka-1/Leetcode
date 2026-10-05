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

    ListNode head;
    int size;
    Random random;

    public Solution(ListNode head) {
        this.head = head;
        this.random = new Random();
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
    }

    public int getRandom() {

        int randInt = random.nextInt(size);
        ListNode curr = head;
        for (int i = 0; i < randInt; i++) {
            curr = curr.next;
        }
        return curr.val;

    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */