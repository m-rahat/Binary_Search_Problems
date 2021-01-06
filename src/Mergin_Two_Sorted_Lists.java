import java.util.Arrays;

public class Mergin_Two_Sorted_Lists {

    public static int[] solve(int[] lst0, int[] lst1) {
        
    	int[] array = new int[lst0.length + lst1.length];
    	
    	int l0 = 0, l1 = 0;
    	for (int i = 0; i < array.length; i++) {
    		
    		if (l1 >= lst1.length) {
    			array[i] = lst0[l0];
    			l0++;
    			continue;
    		}
    		if (l0 >= lst0.length) {
    			array[i] = lst1[l1];
    			l1++;
    			continue;
    		}
    		
    		if (lst0[l0] < lst1[l1]) {
    			array[i] = lst0[l0];
    			l0++;
    		}
    		else {
    			array[i] = lst1[l1];
    			l1++;
    		}
    		
    		System.out.println(Arrays.toString(array));
    	}//for
    	
    	System.out.println(Arrays.toString(array));
    	return array;
    }//solve
    
	public static void main(String [] args) {
		
		int[] lst0 = {5, 10, 15};
		int[] lst1 = {3, 8, 9};
		
		System.out.println(solve(lst0, lst1));
		
	}//main
}//classname
