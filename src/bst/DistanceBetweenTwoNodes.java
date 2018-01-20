package bst;

public class DistanceBetweenTwoNodes {
    
    private TreeNode lca(TreeNode root, int data1, int data2)
    {
        if (root == null) return null; 
        TreeNode temp = root;
        while(temp != null){
         if (root.data < data1 && root.data < data2){
             temp = temp.right;
         }
         else if (root.data > data1 && root.data > data2){
             temp = temp.left;
         }
         else{
             break;
         }
         
     }
        return temp;
            
    }
    
    private int distanceFromRoot(TreeNode node, int data){
        int distance = 0;
        if (node == null) return 0;
        while(node != null)
        {
         if (node.data < data){
             node = node.right; 
             distance++;
         }
         else if (node.data > data){
             node = node.left;
             distance++;
         }
         else{
             break;
         }

     }

        return distance;
    }
    public DistanceBetweenTwoNodes(){
        
        InsertUpdateDelete iud = new InsertUpdateDelete(true);
        iud.insert(25);
        iud.insert(10);
        iud.insert(30);
        iud.insert(7);
        iud.insert(23);
        iud.insert(31);
        iud.insert(12);
        iud.insert(24);
        iud.insert(6);
        iud.print(iud.root);
        int data1 = 10;
        int data2 = 12;
        iud.find(iud.root, data1);
        iud.find(iud.root, data2);
        TreeNode lca = lca(iud.root, 10, 12);
        int lcaDist = distanceFromRoot(iud.root, lca.data);
        int node1Dist = distanceFromRoot(iud.root, data1);
        int node2Dist = distanceFromRoot(iud.root, data2);
        
        int actDist = node1Dist + node2Dist - (2 * lcaDist);
        System.out.println("distance between two nodes is " +actDist);
    }
    
}
