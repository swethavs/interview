//package others;
//import java.util.HashMap;
//import java.util.ArrayList;
//import java.util.Map;
////  solution in O(n^2)
///*
// * Print all positive integer solutions to the equation a^3 + b^3 = c^3 + d^3
// *
//    where a, b, c and d are integers between 1 and 1000
//*/
//class ABPair{
//    int a; 
//    int b;
//    ABPair(int a, int b){
//        this.a = a;
//        this.b = b;
//    }
//    @override
//    String toString(){
//        return "Pair is " + this.a + this.b;
//    }
//}
//public class MathcubeFormula {
//        HashMap<Integer, ArrayList<ABPair>> hmap = new HashMap<Integer, ArrayList<ABPair>>();
//    public MathcubeFormula(){
//        for (int a = 1; a<= 1000; a++)
//        {
//            for (int b = 1; b <= 1000; b++)
//            {
//                int aCube = (int) Math.pow(a, 3);
//                int bCube = (int) Math.pow(b, 3);
//                ABPair p = new ABPair(a, b);
//                Integer sum = aCube + bCube;
//                if (!hmap.isEmpty() && hmap.containsKey(sum)){
//                   ArrayList<ABPair> alABPair = hmap.get(sum);
//                   alABPair.add(p);
//                   hmap.put(sum, alABPair);
//                }
//                else{
//                    hmap.put(sum, new ArrayList<ABPair>().add(p));
//                }
//            }
//        }
//        
//        for (Map.Entry entry : hmap.entrySet()){
//            
//            ArrayList<ABPair> abP = entry.getvalue();
//            if (abP.size() > 1){
//                System.out.println("the pairs of values that match include");
//                while (!abP.isEmpty()){
//                    System.out.println(abP.remove().toString());
//                }
//            }
//        }
//    }
//}
