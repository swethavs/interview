package dynamicprogramming;
/*
 * complexity O((n! * n) * n)
 */
public class PermutationOfString {
    public PermutationOfString(String inputString) {
        
        permute(inputString, "", inputString.length());
    }
    
    private  void permute(String inputString, String prefix, int length)
    {
        if (inputString.length() == 0)
        {
            System.out.println("one of the permutaitons is" + prefix);
        }
        
        for (int i = 0; i < inputString.length(); i++)
        {
            permute(inputString.substring(0, i) + inputString.substring(i + 1), prefix + inputString.charAt(i), length - 1);
        }
    }
}
