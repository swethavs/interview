
import java.util.Scanner;
 // overlapping subproblem - Dynamic programming
 //will easily overflow if the number of stairs is > 34  - use big integer instead
 // complexity is 3^noOfStaris. 3 here is number of ways steps can be taken
public class CountingStairs {
    
    CountingStairs(){
        int noOfStairs = 0; 
		Scanner input = new Scanner(System.in);
		
		while(true)
		{
		    System.out.println("we will be ascending the stairs in 1, 2, 3 ways");
		    System.out.println("Enter number of stairs");
			try{
				noOfStairs = input.nextInt();
				break;
			}
			catch(Exception e)
			{
				System.out.println("Enter a valid number");
			}
		}
		
		int[] memoArray = new int[noOfStairs + 1];
    	System.out.println(countStairsLogic(noOfStairs));
    	initMemoArray(memoArray);
    	countStairsMemo(memoArray, noOfStairs);
    	System.out.println("using memoization technique: vaue is " + memoArray[noOfStairs]);
    	if (input != null)
    	{
		  input.close();
	    }

	}
    
    public int countStairsLogic(int noOfStairs)
	{
		if (noOfStairs == 0)
		{
			return 1;
		}
		else if(noOfStairs < 0)
		{
			return 0;
		}
		
		return countStairsLogic(noOfStairs - 1) + countStairsLogic(noOfStairs - 2) + countStairsLogic(noOfStairs - 3);
	}
	
	// using memoization - top down
	
	public void initMemoArray(int[] memoArray)
	{
	    for (int i = 0; i < memoArray.length; i++)
	    {
	        memoArray[i] = -1;
	    }
	}
	
	
	public int countStairsMemo(int[] memoArray, int noOfStairs)
	{
	    if (noOfStairs == 0)
	    {
	        return 1;
	    }
	    else if (noOfStairs < 0)
	    {
	        return 0;
        }
	    else if (memoArray[noOfStairs] != -1)
	    {
	        return memoArray[noOfStairs];
	    }
	
	    memoArray[noOfStairs]  = countStairsMemo(memoArray, noOfStairs - 1) + countStairsMemo(memoArray, noOfStairs - 2)
	       + countStairsMemo(memoArray, noOfStairs - 3);
	       
	    return memoArray[noOfStairs];
	}

}
