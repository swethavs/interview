package bst;

public class InorderPredAndSuc {
    InsertUpdateDelete iud;
    TreeNode pre = null;
    TreeNode suc = null;
    public InorderPredAndSuc(){
        iud = new InsertUpdateDelete(true);
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
      
        inorderPredAndSuc(iud.root, 44);
        if (pre != null)
            System.out.println("Inorder predecessor is " +pre.data);
        if (suc != null)
            System.out.println("Inorder successor is " + suc.data);
    }
    
    private void inorderPredAndSuc(TreeNode node, int key){
        
        if (node == null)
            return;
        
        if (node.data == key){
            
            // find min value in the right - inorder successor
            TreeNode temp = node.right;
            if (temp != null){
                while (temp != null)
                {
                    suc = temp;
                    temp = temp.left;
                }
            }
            
            // find max element in left tree - inorder predecessor
            temp = node.left; 
            if (temp != null)
            {
                while (temp != null)
                {
                    pre = temp;
                    temp = temp.right;
                }
            }
            return;
        }
        else if (node.data < key){
            
            pre = node;
            inorderPredAndSuc(node.right, key);
            
        }
        else{
            suc = node;
            inorderPredAndSuc(node.left, key);
        }

    }
}

