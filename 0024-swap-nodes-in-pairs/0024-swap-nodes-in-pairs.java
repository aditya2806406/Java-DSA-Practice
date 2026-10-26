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
    public static ListNode swapPairs(ListNode head) {
        if(head==null){
            return null;
        }
       ListNode dummy=new ListNode(0);
       dummy.next=head;
        ListNode curr=head;
        ListNode left=dummy;
      
        while(curr!=null && curr.next!=null){
          ListNode temp=curr.next;
          left.next=temp;
          curr.next=temp.next;
          temp.next=curr;
          left=curr;
          curr=curr.next;
           
            

        }
        return dummy.next;

        
    }public static void main(String[] args){
        ListNode head=new ListNode();
        head.next=new ListNode();
        head.next.next=new ListNode();
        System.out.println(swapPairs(head));
    }
}