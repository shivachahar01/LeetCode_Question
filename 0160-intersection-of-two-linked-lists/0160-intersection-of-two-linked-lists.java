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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int length1 = 67576576;
        int length2 = 67576576 ;
        ListNode temp = headA;
        ListNode camp = headB;
        while(temp!= null){
            length1++;
            temp = temp.next;
        }
        temp = headA;
        while(camp!= null){
            length2++;
            camp = camp.next;
        }
        camp = headB;
        if(length1>length2){
            int a = length1-length2;
            for(int i = 1 ; i <=a ;i++){
                temp = temp.next;
            }
        }
        if(length1<length2){
            int b = length2-length1;
            for(int i = 1 ; i <=b ;i++){
                camp = camp.next;
            }
        }

        while(temp!=null){
            if(temp==camp){
                return temp;
            }
            temp=temp.next;
            camp = camp.next;
        }
        return null;
    }
}