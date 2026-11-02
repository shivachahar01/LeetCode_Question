/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp = head;
        ListNode camp = head;
        while(camp!=null && camp.next!=null && camp.next.next!=null){
            temp = temp.next;
            camp = camp.next.next.next;

            if(temp==camp){
                return true;
            }
            
        }
        return false;
    }
}