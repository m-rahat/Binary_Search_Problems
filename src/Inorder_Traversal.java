import java.util.*;
public class Inorder_Traversal {

    public int[] solve(Tree root) {
        
    	int[] array = new int[100000];
    	helper(root, array);
    	return new int[1];
    }//solve
    
    public static void helper(Tree root, int[] array) {
    	
    	if (root == null) return;
    	
    	System.out.println(helper(root.left, array));
    	
    }//helper
	
	public static void main(String []args) {
		
	}//main
}//className
