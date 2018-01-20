package others;
import java.util.ArrayList;
import java.util.Arrays;

public class DecideIfWeCanGiveDiscount {
    ArrayList<Integer> purchaseOrderArr = new ArrayList<Integer>(); 
    private void isEligibleForDiscount(String[] purchasedItems, String[] discountItems){
        
        for (int i = 0; i < purchasedItems.length; i++){
            for (int j = 0; j < discountItems.length; j++){
                if (purchasedItems[i].equalsIgnoreCase(discountItems[j])){
                    purchaseOrderArr.add(i);
                }
            }
        }
        
        if (purchaseOrderArr.size() == 3)
        {
            System.out.println("eligible for discount");
        }
        else{
            System.out.println("not eligible for discount");
        }
    
    }
    
    public DecideIfWeCanGiveDiscount()
    {
        String purchasedItems[] = {"Apple", "Orange", "banana", "Mango", "bread", "grapes", ""};
        String[] distinctArr = Arrays.stream(purchasedItems).distinct().toArray(String[]::new);
        System.out.println("elements in array" + Arrays.toString(distinctArr));
        String discountItems[] = {"orange", "mango", "butter"};
        isEligibleForDiscount(distinctArr, discountItems);
    }
}
