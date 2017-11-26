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
	               default:
	                   System.out.println("1 - Counting stairs");
	             }
	             break;
	       default:
	           System.out.println("1. Dynamic Programming");
	   }
    }
}
