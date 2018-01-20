package dynamicprogramming;
import java.util.Arrays;
import java.util.Stack;
// Dynamic programming optimal substructure
// complexity is O(n^2), where n is the number of elements in the array
public class LongestIncreasingSubSeq {
    int[] inputAr;
    int[] sizeAr; 
    int[] prevIndexAr;
    public LongestIncreasingSubSeq(){
        inputAr = new int[]{34, 23, 12, 46, 11, 96, 56, 67, 10, 109};
        sizeAr = new int[inputAr.length];
        prevIndexAr = new int[inputAr.length];
        Arrays.fill(sizeAr, 1);
        Arrays.fill(prevIndexAr, -1);
        
        prevIndexAr = new int[inputAr.length];
        for (int i = 1; i < inputAr.length; i++)
        {
            for (int j = 0; j < i; j++)
            {
                if (inputAr[j] < inputAr[i] && (sizeAr[i] < (sizeAr[j]++)))
                {
                    sizeAr[i] = sizeAr[j]+ 1;
                    prevIndexAr[i] = j;
                }
            }
        }
        findLongestSeqAndPrint();
    }
    
    private void findLongestSeqAndPrint()
    {
        int maxSizeIndex = 0; 
        int maxValue = 1;
        for (int i = 0;  i < inputAr.length; i++)
        {
            System.out.println("sizeAr: " + sizeAr[i] +  ", prevIndexAr: " + prevIndexAr[i]);
            if (sizeAr[i] > maxValue)
            {
                maxValue = sizeAr[i];
                maxSizeIndex = i;
            }
        }
        return;
        /*int prevIndex = maxSizeIndex;
        Stack<Integer> s = new Stack<Integer>();
        while(prevIndexAr[prevIndex] != -1)
        {
            System.out.println("prev index value " + prevIndex);
            s.push(inputAr[prevIndex]);
            prevIndex = prevIndexAr[prevIndex];
        }
        
        System.out.println("value of the stack is" +s.toString());
        while(!s.isEmpty())
        {
            System.out.print(s.pop());
        }*/

    }
}
