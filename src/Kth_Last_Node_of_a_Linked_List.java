import java.util.*;

public class Kth_Last_Node_of_a_Linked_List {

	public int solve(LLNode node, int k) {

		LLNode tempNode = node;
		int size = 0;
		while (tempNode != null) {
			size++;
			tempNode = tempNode.next;
		} // while

		int nodeToReturn = size - k;
		System.out.println(nodeToReturn);

		int i = 1;
		while (i != nodeToReturn) {
			node = node.next;
			i++;
		} // while

		return node.val;
	}// solve

	public static void main(String[] args) {

	}// main
}// className
