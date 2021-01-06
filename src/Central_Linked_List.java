import java.util.*;

class LLNode {
	int val;
	LLNode next;
}

public class Central_Linked_List {

	public static int solve(LLNode node) {

		LLNode head = node;
		int size = 0;
		while (head != null) {
			size++;
			head = head.next;
		}//while
		
		if (size % 2 == 0) {
			size = (size / 2) + 1;
            int i = 1;
		    while (i != size) {
            System.out.println(node.val);
			node = node.next;
            i++; 
		    }//while
		}//if
		else {
			size = size / 2;
            int i = 0;
            while (i != size) {
            System.out.println(node.val);
			node = node.next;
            i++; 
		    }//while
		}//else
				
		return node.val;
	}// solve

	public static void main(String[] args) {
		
	}// main
}// classname
