package bst;

// the complexity here is O(h + k), where h is the height of the tree and k is 2
public class SecondLargestElementInBST {
    int count;
    private void secondLargestElement(TreeNode node)
    {


         if (node == null || count >= 2)
        {
            return;
        }
        secondLargestElement(node.right);
        ++count;
        if (count == 2)
        {
            System.out.println("The second largest element is " + node.data);
        }

        secondLargestElement(node.left);
    }
    
    public SecondLargestElementInBST()
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
        secondLargestElement(iud.root);
        
    }
}
