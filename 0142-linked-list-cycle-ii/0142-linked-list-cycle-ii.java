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
    public ListNode detectCycle(ListNode head) {
        ListNode temp = head ;
        ListNode camp = head ;

        while(camp!=null && camp.next!=null){
           
            temp = temp.next;
            camp = camp.next.next;

             if(camp==temp){
                temp =head;
            
              int index = 0;
            while(camp!=temp){
                camp = camp.next;
                temp=temp.next;
                index++;
            }
            return temp;
        }}
        return null;
    }
}