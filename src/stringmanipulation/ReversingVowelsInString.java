package stringmanipulation;
import java.util.Stack;

public class ReversingVowelsInString {
    Stack<Character>  alVowels = new Stack<Character>();
    String vowelString = "aeiouAEIOU";

    private boolean isVowel(char c)
    {
        int i = vowelString.indexOf(c);
        
        if (i >= 0)
        {
            return true;
        }
       return false;
    }
    
    private void swap(int i, int j, char[] inputArray)
    {
        char temp = inputArray[i];
        inputArray[i] = inputArray[j];
        inputArray[j] = temp;
       
    }
    
  
    public ReversingVowelsInString(String inputString) {
        
        reverseVowels(inputString);
        reverseVowelsNoExtraDS(inputString);
    }
    
      // Time Complexity - O(n) 
    // Space complexity - O(n) - clost to as we use array 
    private void reverseVowels(String inputString)
    {
        System.out.println("Using extra data structure");
           char inputArray[] = inputString.toCharArray();
        
        for (int i = 0; i < inputArray.length; i++)
        {
            if (isVowel(inputArray[i]))
            {
                alVowels.push(inputArray[i]);
            }
        }
         for (int i = 0; i < inputArray.length; i++)
        {
            if (isVowel(inputArray[i]) && !alVowels.isEmpty())
            {
                inputArray[i] = alVowels.pop();
            }
        }
        
        System.out.println(String.valueOf(inputArray));
    }
    
    // Time Complexity O(n)
    // Space complexity O(1)
    private void reverseVowelsNoExtraDS(String inputString)
    {
        
        System.out.println("Without using extra data structure");
        char inputArray[] = inputString.toCharArray();
        
        int i = 0, j = inputArray.length -1;
        
            while ( i < j)
            {
                 
                 if (!isVowel(inputArray[i]))
                {
                    i++;
                    continue;
                }
                if (!isVowel(inputArray[j]))
                {
                    j--;
                    continue;
                }
                
            
            swap(i, j, inputArray);
            i++;
            j--;
        }

        System.out.println(String.valueOf(inputArray));
    }

    
}
