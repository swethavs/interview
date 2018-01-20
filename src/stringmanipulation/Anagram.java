package stringmanipulation;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
    Map<Character, Integer> hmap = new HashMap<Character, Integer>();
    public Anagram(String string1, String string2)
    {
        if (string1.length() != string2.length())
        {
            System.out.println("strings are not of same length: not anagrams");
        }
        else
        {
            System.out.println("IsAnagram: " + isAnagram(string1, string2));
        }
    }
    
    private boolean isAnagram(String string1, String string2)
    {
        char carr1[] = string1.toCharArray();
        for (int i = 0; i < carr1.length; i++)
        {
            if (hmap.get(carr1[i]) != null)
            {
                int count = hmap.get(carr1[i]);
                count++;
                hmap.put(carr1[i], count);
            }
            else{
                hmap.put(carr1[i], 1);
            }
        }
        
        char carr2[] = string2.toCharArray();
        for (int i = 0; i < carr2.length; i++ )
        {
            if (hmap.get(carr2[i]) == null)
            {
                return false;
            }
            else 
            {
                int count = hmap.get(carr2[i]);
                count = count - 1; 
                if (count == 0)
                {
                    hmap.remove(carr2[i]);
                }
                else
                {
                    hmap.put(carr2[i], count);
                }
            }
        }
        
        return true; 
    }
}
