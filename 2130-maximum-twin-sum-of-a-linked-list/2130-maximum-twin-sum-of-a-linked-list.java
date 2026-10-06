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

    public int pairSum(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;

        while(temp!=null){
            arr.add(temp.val);
            temp = temp.next;
        }

        int i=0;
        int j = arr.size()-1;
      
        int maxSum = 0;

        while(i<j){
            int left = arr.get(i);
            int right = arr.get(j);

            int sum = left + right;
            maxSum = Math.max(sum,maxSum);
            i++;
            j--;
        }

        return maxSum;

    }
}