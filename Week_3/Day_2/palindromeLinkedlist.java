class Solution {
    public ListNode rev(ListNode head){
        ListNode curr=head;
        ListNode prev=null,after=null;
        while(curr!=null){
            after=curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
      ListNode slow=head;
      ListNode fast=head;
      while(fast.next!=null && fast.next.next!=null){
        fast=fast.next.next;
        slow=slow.next;
      }
      ListNode sec=rev(slow.next);
      ListNode temp1=sec;
      ListNode temp2=head;
      while(temp1!=null){
        if(temp1.val!=temp2.val) return false;
        temp1=temp1.next;
        temp2=temp2.next;
      }
      return true;
    }
}