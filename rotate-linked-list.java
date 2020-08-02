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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        
        if(k == 0 || head == null){
            return head;
        }
        
        int size = 0;
        ListNode next = head;
        while(next != null){
            size++;
            next = next.next;
        }
        
        if(size == 0){
            return null;
        }
        
        k = k%size;
        
        
        while(k-- > 0 && fast != null){
            fast = fast.next;
        }
        
        while(fast !=null && fast.next != null){
            
            fast = fast.next;
            slow = slow.next;
        }
        
        fast.next = head;
        
        head = slow.next;

        slow.next = null;
        
        return head;
        
    }
}