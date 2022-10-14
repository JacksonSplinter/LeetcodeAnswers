package answers;
import java.util.Arrays;
import java.util.LinkedList;
/**
 * Design a HashMap without using any built-in hash table libraries.
 * Implement the MyHashMap class:
 * 
 * @author Jackson Splinter
 */
public class Problem_0706 
{
    LinkedList<int[]> list = new LinkedList();
    /**
     * Initializes the object with an empty map.
     */
    public Problem_0706() 
    {
    }
    
    /**
     * inserts a (key, value) pair into the HashMap.
     * If the key already exists in the map, update the corresponding value.
     * <p>
     * Checks if the key has already been added to the list, if it has the key value will be updated.
     * If the key is not in the list then it is added to the array.
     * <p>
     * O(n)
     * 
     * @param key       integer value for the key
     * @param value     integer value for the value
     */
    public void put(int key, int value) 
    {
        int[] val = {key,value};
        for(int i =0;i<list.size();i++)
        {
            if(list.get(i)[0]==key)
            {
                list.set(i, val);
                return;
            }
        }
        list.add(val);
    }
    
    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.
     * <p>
     * Checks through the map to find the key, if the key is found returns the value.
     * If the key is not found in the map returns -1.
     * <p>
     * O(n)
     * 
     * @param key   Integer value representing the key value
     * @return      the value for the corresponding key, -1 if the key is not in the list
     */
    public int get(int key) 
    {
        for(int i =0;i<list.size();i++)
        {
            if(list.get(i)[0]==key)
            {
                return list.get(i)[1];
            }
        }
        return -1;
    }
    
    /**
     * Removes the key and its corresponding value if the map contains the mapping for the key.
     * <p>
     * Checks the map for the provided key, if the key is found then it is removed.
     * If the key is not found nothing happens.
     * <p>
     * O(n)
     * 
     * @param key   Integer representing the key in the map
     */
    public void remove(int key) 
    {
        for(int i =0;i<list.size();i++)
        {
            if(list.get(i)[0]==key)
            {
                list.remove(i);
                return;
            }
        }
    }
}