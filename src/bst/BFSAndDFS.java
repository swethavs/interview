package bst;

import java.util.LinkedList;
import java.util.Queue;

public class BFSAndDFS {
    Queue<TreeNode> bfsq = new LinkedList<TreeNode>();
    
    private boolean bfs(TreeNode node, int data){

      if(node == null) 
      { return false;}
      else{
            bfsq.add(node);
            while(!bfsq.isEmpty())
            {
                TreeNode n = bfsq.remove();
                if (n.data == data)
                    return true;
                if (n.left != null)
                    bfsq.add(n.left);
                if (n.right != null)
                    bfsq.add(n.right);
            }
      }

     return false;        
    }
    
    private boolean dfs(TreeNode node, int data){
        if (node == null) return false;
        if (dfs(node.left, data) ||(node.data == data) ||  dfs(node.right, data)){
            return true;
        }
        return false;        
    }

    public BFSAndDFS(){
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
        System.out.println();
        System.out.println("BFS returned " +bfs(iud.root, 23));
        System.out.println("DFS returned "+dfs(iud.root, 23));
        
    }
}
