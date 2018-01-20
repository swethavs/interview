package stringmanipulation;
import java.util.Arrays;
public class SubstringIsPermutationOfBiggerString {
    // complexity here is O(n) - just for sorting and finding indexOf
    public SubstringIsPermutationOfBiggerString(){
        String small = "jkfddf";
        String bigger = "fsafffddjksggg"; // ffddj
        System.out.println("substring from 4 to 8" + bigger.substring(4,9));
        char[] smallAr = small.toCharArray();
        char[] biggerAr = bigger.toCharArray();
        Arrays.sort(smallAr);
        String smallString = new String(smallAr);
        System.out.println("sorted small string is " +smallString);
        // Arrays.sort(biggerAr);
        for (int i = 0; (i + smallAr.length - 1) < biggerAr.length; i++){
            char[] curSubAr  = (new String(biggerAr).substring(i, (i + smallAr.length))).toCharArray();
            Arrays.sort(curSubAr);
            System.out.println("current subarray is " + new String(curSubAr));
            System.out.println("smaller array is " + new String(smallAr));
             if (new String(curSubAr).equals(new String(smallAr))){
            System.out.println("smaller array is permutation of substring in bigger array");
            break;
        }
        else{
            System.out.println("smaller string is not permutation of substring of bigger array");
        }
        }
       
    }
}