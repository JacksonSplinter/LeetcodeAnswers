package answers;
/**
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
 * Return the linked list sorted as well.
 * @author Jackson Splinter
 */
public class Problem_0083 
{
    /**
     * Removes duplicates from a linked list.
     * <p>
     * Goes through the linked list and removes all duplicates by changing the next value.
     * <p>
     * O(n)
     * 
     * @param head  head of a linked list
     * @return      head of a linked list with duplicates removed
     */
    public static ListNode deleteDuplicates(ListNode head) 
    {
        ListNode pointer = head;
        while(pointer!=null)
        {
           if(pointer.next==null)
            {
                return head;
            }
            while(pointer.val==pointer.next.val)
            {
                pointer.next=pointer.next.next;
                if(pointer.next==null)
                {
                    return head;
                }
            }
            pointer=pointer.next;
        }
        return head;
    }
}