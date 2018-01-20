package bst;

import java.util.Scanner;
/****
 * complexity 
 * Insert - O(h) - if it is a skewed tree h = n
 * Delete - O(h)
 * Update - O(h)
 */
class TreeNode
{
    int data;
    TreeNode left; 
    TreeNode right;
    TreeNode(int d)
    {
        this.data = d;
        this.left = null; 
        this.right = null;
    }
}
public class InsertUpdateDelete {
    TreeNode root = null;
    Scanner in; 
    
    public InsertUpdateDelete()
    {
        int el = -1;
        in  = new Scanner(System.in);
        while(true)
        {
         System.out.println("What  do you want to do?");
         System.out.println("1. Insert \n 2. Update \n 3. Delete");
         int choice = in.nextInt();
         switch(choice)
          {
             case 1:
                System.out.println("Enter the element to insert");
                 el = in.nextInt();
                insert(el);
                        System.out.println("Inorder traversal");
                print(root);
            break;
            case 2:
                  System.out.println("which element do you want to update");
                  el = in.nextInt();
                  if (find(root, el))
                 {
                    System.out.println("what do you want to update it to");
                   int to = in.nextInt();
                    update(el, to);
                            System.out.println("Inorder traversal");
                    print(root);
                }
                else
                {
                System.out.println("element not found");
                }
                break;
            case 3: 
                System.out.println("enter the element to delte");
                el = in.nextInt();
                if (find(root, el))
                {
                    delete(el);
                    System.out.println("Inorder traversal");
                    print(root);
                }
                else
                {
                    System.out.println("element not found");
                }
            break;
            default:
            in.close();
                return;
        }
      }

    }
    
    public InsertUpdateDelete(boolean optional)
    {
        
    }
    
    public void insert(int i)
    {
        if (null == root)
        {
            root = new TreeNode(i);
            return;
        }
        TreeNode temp = root; 
        TreeNode prev = root;
        while (temp != null)
        {
            prev = temp;
            if (temp.data < i)
            {
                temp = temp.right;
            }
            else if (temp.data > i)
            {
                temp = temp.left;
            }
            else
            {
                System.out.println("tree already contains this element");
                return;
            }
        } 
            if (prev.data < i)
                prev.right = new TreeNode(i);
            else 
                prev.left = new TreeNode(i);
    }
    
    private void delete(int el)
    {
        TreeNode temp = root;
        TreeNode prev = root;
        while (temp != null)
        {
            prev = temp; 
            if (temp.data < el)
            {
                temp = temp.right;
            }
            else if(temp.data > el)
            {
                temp = temp.left;
            }
            else{
                if (temp.left == null && temp.right == null)
                {
                  
                    if (prev.left != null && prev.left.data == el)
                    {
                        prev.left = null;
                    }
                        prev.right = null;
                }
                else if (temp.right == null)
                {
                    TreeNode prev2 = temp;
                    TreeNode temp2 = temp;
                    while(temp2.left != null)
                    {
                        prev2 = temp2;
                        temp2 = temp2.left;
                    }
                
                temp.data = temp2.data;
                if (temp2.right != null)
                {
                    prev2.left = temp2.right;
                }
                prev2.left = null;
            }
            else{
                TreeNode prev2 = temp; 
                TreeNode temp2 = temp; 
                while (temp2.right != null)
                {
                    prev2 = temp2;
                    temp2 = temp2.right;
                }
                temp.data = temp2.data;
                if (temp2.left != null)
                {
                    prev2.right = temp2.left;
                }
                prev2.right = null;
            } // end of nested if
                return;
            }
        }
    }
    
    public void update(int from, int to)
    {
        delete(from);
        insert(to);
    }
    
    public boolean find(TreeNode temp, int i)
    {
        while (temp != null)
        {
         if (i == temp.data)
             return true;
          else if (i < temp.data)
          {
               temp = temp.left;
           }
            else 
            temp = temp.right;
    }

        return false;
    }
    
    public void print(TreeNode temp)
    {

        if (temp != null)
        {
            print(temp.left);
            System.out.print("   " +temp.data);
            print(temp.right);
        }
        
    }

}
