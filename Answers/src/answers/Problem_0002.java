package answers;
/**
 * Add two linked lists representing numbers together.
 * 
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * @author Jackson Splinter
 */

public class Problem_0002 
{
/**
 * Goes through the linked lists and adds them together, returning a linked list as the answer.
 * <p>
 * Goes through each node and adds them together, if the solution is over 10 then 10 is subtracted
 * and the remainder is carried over. If one linked list is longer than the other the extra numbers are added in place
 * <p>
 * O(n)
 * 
 * @param l1    head node of linked list number 1
 * @param l2    head node of linked list number 2
 * @return      head node of the linked list with the answer
 */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        int remainder = 0;
        ListNode ans = new ListNode(0);
        ListNode pointer;
        pointer=ans;
        
        while(l1!=null && l2!=null)
        {
            pointer.val = l1.val+l2.val+remainder; // add the values together
            if(remainder==1)
            {
                remainder=0;
            }
            if(pointer.val>=10) // if value over 10, move the 10s place over to the remainder
            {
                pointer.val-=10;
                remainder=1;
            }
            if(l1.next!=null||l2.next!=null) // if either list has a number to add move the pointer forward
            {
                pointer.next = new ListNode(0);
                pointer=pointer.next;
            }
            
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null) // if only list 1 still has numbers left just add the values plus the remainder
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
        while(l2!=null) // if only list 2 still has numbers left just add the values plus the remainder
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
        if(remainder==1) // if their is a remainder, add it to the top of the list
        {
            pointer.next = new ListNode(1);
        }
        
        return ans;
    }
}
