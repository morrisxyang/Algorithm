/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
         ListNode l = new ListNode(0);
         ListNode lr = l;
        while(l1!=null && l2 !=null){
            if(l1.val<=l2.val){
                l.next=l1;
                l=l.next;
                l1=l1.next;
            }else{
                l.next=l2;
                 l=l.next;
                l2=l2.next;
            }
        }
         while(l1!=null){
              l.next=l1;
              l=l.next;
                l1=l1.next;
         }
         while(l2!=null){
             l.next=l2;
              l=l.next;
                l2=l2.next;
             
         }
        return lr.next;
        
    }
}