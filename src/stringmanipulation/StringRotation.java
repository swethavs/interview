package stringmanipulation;
// O(n) as string concatenaiton takes O(n)
// Program to check if one string is rotation of another
public class StringRotation {
   public  StringRotation(){
        String s1 = "hello"; 
        String s2 = "elloh";
        if (s1.length() != s2.length())
            System.out.println("strings are not of same length");
        else if ((s1+s1).contains(s2))
            System.out.println("string " +s1 +" and " +s2 +" are rotations of each other");
        else
            System.out.println("strings are not rotations of each other");
    }
}
