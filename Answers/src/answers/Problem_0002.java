package answers;
/*
@author Jackson Splinter

You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
*/
// goes through each node and adds them together, if the soltuion is over 10 then 10 is subtracted 
// and the remainder is carried over. If one linked list is longer than the other the extra numbers are added in place
public class Problem_0002 
{
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        int remainder = 0;
        ListNode ans = new ListNode(0);
        ListNode pointer;
        pointer=ans;
        
        while(l1!=null && l2!=null)
        {
            pointer.val = l1.val+l2.val+remainder;
            if(remainder==1)
            {
                remainder=0;
            }
            if(pointer.val>=10)
            {
                pointer.val-=10;
                remainder=1;
            }
            if(l1.next!=null||l2.next!=null)
            {
                pointer.next = new ListNode(0);
                pointer=pointer.next;
            }
            
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null)
        {
            pointer.val = l1.val+remainder;
            if(remainder==1)
            {
                remainder=0;
            }
            if(pointer.val>=10)
            {
                pointer.val-=10;
                remainder=1;
            }
            if(l1.next!=null)
            {
                pointer.next = new ListNode(0); 
                pointer=pointer.next;
            }
            l1=l1.next;
        }
        while(l2!=null)
        {
            pointer.val = l2.val+remainder;
            if(remainder==1)
            {
                remainder=0;
            }
            if(pointer.val>=10)
            {
                pointer.val-=10;
                remainder=1;
            }
            if(l2.next!=null)
            {
                pointer.next = new ListNode(0);
                pointer=pointer.next;
            }
            l2=l2.next;
        }
        if(remainder==1)
        {
            pointer.next = new ListNode(1);
        }
        
        return ans;
    }
}
