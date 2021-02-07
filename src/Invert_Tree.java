import java.util.*;

class Tree {
	int val;
	Tree left;
	Tree right;
}// Tree

public class Invert_Tree {

	public static Tree solve(Tree root) {

		Tree tempRoot = new Tree();

		if (root == null)
			return null;

		tempRoot.left = solve(root.right);
		tempRoot.right = solve(root.left);

		return tempRoot;
	}// solve

	public static void main(String[] args) {

	}// main
}// className
