package answers;
/**
 * Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
 * <p>
 * To flip an image horizontally means that each row of the image is reversed.
 * <p>
 * For example, flipping [1,1,0] horizontally results in [0,1,1].
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
 * <p>
 * For example, inverting [0,1,1] results in [1,0,0].
 * 
 * @author Jackson Splinter
 */
public class Problem_0832 
{
    /**
     * Goes through a 2D array and flips every array and then inverts every value.
     * <p>
     * Goes through each array in the array. First reverses the order of the values in the array.
     * Then goes through the array again and inverses the value of every integer. Returns the array once every
     * piece of data has been processed.
     * <p>
     * O(m*2n)
     * 
     * @param image 2D array that needs to be flipped and inverted.
     * @return      the 2D array image after it has been flipped and inverted.
     */
    public static int[][] flipAndInvertImage(int[][] image) 
    {
        int dummy;
        for (int[] image1 : image) 
        {
            int first =0, last=image.length-1;
            while (first<last) //flips the image
            {
                dummy = image1[first];
                image1[first] = image1[last];
                image1[last] = dummy;
                first++;
                last--;
            }
            for (int j = 0; j < image1.length; j++) //inverts the image
            {
                if (image1[j] == 1) 
                {
                    image1[j] = 0;
                } 
                else if (image1[j] == 0) 
                {
                    image1[j] = 1;
                }
            }
        }
        return image;
    }
}