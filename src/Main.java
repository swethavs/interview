import bst.*;
import dynamicprogramming.*;
import others.*;
import stringmanipulation.*;
public class Main {

    public static void main(String[] args) {
        
        if (args.length < 2)
        {
            System.out.println("at least two args needed");
            return;
        }
	   
	   switch(args[0])
	   {
	       case "1": // Dynamic programming
	            switch(args[1])
	             {
	               case "1":
	                    new CountingStairs();
	                    break;
	               case "2": 
	                    int numberOfRings = 3;
	                     new TowerOfHanoi(numberOfRings);
	                   break;
	                case "3":
	                      String is = "ABC";
	                      new PermutationOfString(is);
	                    break;
	                case "4":
	                   new LongestIncreasingSubSeq();
	                   break;
	               default:
	                   System.out.println("1 - Counting stairs");
	             }
	             break;
	          case "2": // string manipulation
	           switch(args[1])
	           {
	               case "1":
	                   new ReversingVowelsInString("aeio2u");
	                   break;
	                case "2":
	                   new Anagram("hello", "elhlh");
	                   break;
	                case "3":
	                   new StringRotation();
	                   break;
	                case "4":
	                   new SubstringIsPermutationOfBiggerString();
	           }
	           break;
	           case "3": // BST
	              switch(args[1])
	              {
	                  case "1":
	                       new InsertUpdateDelete();
	                       break;
	                  case "2":
	                       new SecondLargestElementInBST();
	                       break;
	                  case  "3":
	                       new BFSAndDFS();
	                       break;
	                  case "4":
	                       new InorderSuccessor();
	                       break;
	                   case "5":
	                       new DistanceBetweenTwoNodes();
	                       break;
	                   case "6":
	                       new InorderPredAndSuc();
	                       break;
	              }
	           break;
	       case "4":  // others
	           switch (args[1])
	           {
	               case "1":
	               new DecideIfWeCanGiveDiscount();
	               break;
//	               case "2":
//	                  new MathcubeFormula();
//	                  break;
	           }
	       break;
	       default:
	           System.out.println("1. Dynamic Programming");
	           System.out.println("2. String Manipulation");
	           System.out.println("3. BST");
	           System.out.println("4. Other");
	   }
    }
}
