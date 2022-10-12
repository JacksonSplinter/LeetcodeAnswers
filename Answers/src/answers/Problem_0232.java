package answers;
import java.util.Stack;
/**
 * Implement a first in first out (FIFO) queue using only two stacks.
 * The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).
 * <p>
 * Notes:
 * <p>
 * You must use only standard operations of a stack, which means only push to top,
 * peek/pop from top, size, and is empty operations are valid.
 * Depending on your language, the stack may not be supported natively.
 * You may simulate a stack using a list or deque (double-ended queue) as long as you use
 * only a stack's standard operations.
 * 
 * @author Jackson Splinter
 */
public class Problem_0232 
{
    Stack<Integer> in;
    Stack<Integer> out;
    int front;
    /**
     * Constructs an object of type problem_232
     * <p>
     * O(1)
     */
    public Problem_0232() 
    {
        in= new Stack<>();
        out= new Stack<>();
    }
    
    /**
     * Pushes element x to the back of the queue.
     * 
     * @param x integer added to the queue
     */
    public void push(int x) 
    {
        if(in.isEmpty()){front=x;}
        in.push(x);
    }
    
    /**
     * Removes the element from the front of the queue and returns it.
     * 
     * @return  int at the front of the queue 
     */
    public int pop() 
    {
        if(out.isEmpty())
        {
            while(!in.isEmpty())
            {
                out.push(in.pop());
            }
        }
        return out.pop();
    }
    
    /**
     * Returns the element at the front of the queue.
     * 
     * @return  int at the front of the queue
     */
    public int peek() 
    {
        if(out.isEmpty())
        {
            return front;
        }
        return out.peek();
    }
    
    /**
     * Returns <code>true</code> if the queue is empty, <code>false</code> otherwise.
     * 
     * @return  <code>true</code> if the queue is empty, <code>false</code> otherwise.
     */
    public boolean empty() 
    {
        return in.isEmpty()&& out.isEmpty();
    }
}
