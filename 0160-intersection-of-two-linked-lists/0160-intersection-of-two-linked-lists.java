/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    public int size(ListNode head){
        int count = 0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = size(headA);
        int sizeB = size(headB);

        int abs = Math.abs(sizeA - sizeB);
        
        ListNode tempA = headA;
        ListNode tempB = headB;

        if(sizeA>sizeB){
            for(int i=0;i<abs;i++){
                tempA = tempA.next;
            }

            while(tempA!=null && tempB!=null ){
                if(tempA == tempB ){
                    return tempA;
                }
                tempA = tempA.next;
                tempB = tempB.next;
            }

        } else{
            for(int i=0;i<abs;i++){
                tempB = tempB.next;
            }

            while(tempA!=null && tempB!=null){
                if(tempA == tempB ){
                    return tempA;
                }
                tempA = tempA.next;
                tempB = tempB.next;
            }
        }

        return null;

    }
}