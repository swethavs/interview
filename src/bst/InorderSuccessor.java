package bst;
import java.util.ArrayList;
// complexity here is O(n) as we traverse through the entire tree and return it
public class InorderSuccessor {
    
    public InorderSuccessor()
    {
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
        System.out.println("\nInorder successor of 30 is "+inOrder(iud.root, 30));
    }
    
    private int inOrder(TreeNode node, int data)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        inOrderTraversal(node, al);
        for (int i = 0; i < al.size(); i++){
            if (al.get(i) == data && (i + 1 < al.size()))
                return al.get(i+1);
        }
        return -1;
    }
    
    private void inOrderTraversal(TreeNode node, ArrayList<Integer> al)
    {
        if (node == null) return; 
        inOrderTraversal(node.left, al);
        al.add(node.data);
        inOrderTraversal(node.right, al);
        
    }
}
