package wow.tree;

/**
 *
 * @author Student's Account
 */
public class BinaryTree {
    Node root;
    
    public void insert(int value){
        root  = insertRec(root, value);
    }
    private Node insertRec(Node root, int value){
        if (root == null){
            return new Node(value);
        }
        if(value < root.value){
            root.left = insertRec(root.left, value);
        }else if (value > root.value){
            root.right = insertRec(root.right, value);
        }
        return root;
    }
     public void inorder(){inorderRec(root);}
     
     public void inorderRec(Node root){
         if(root != null){
             inorderRec(root.left);
             System.out.println(root.value + " ");
             inorderRec(root.right);
             
         }
     }
     
     public void preorder(){preorderRec(root);}
     
     public void preorderRec(Node root){
         if (root != null){
             System.out.println(root.value + " ");
             preorderRec(root.left);
             preorderRec(root.right);
         }
     }
     
     public void postorder(){postorderRec(root);}
     
      public void postorderRec(Node root){
         if (root != null){
             postorderRec(root.left);
             postorderRec(root.right);
             System.out.println(root.value + " ");
             
         }
     }
}
