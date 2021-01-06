import java.util.*;
public class Reverse_Words {

    public static String solve(String sentence) {
        
    	Stack st = new Stack<String>();
    	String str = "";
    	for (int i = 0; i < sentence.length(); i++) {
    		if (sentence.charAt(i) == ' ') {
    			st.push(str);
    			str = "";
    		}
    		else {
    			str += sentence.charAt(i);
    		}
    	}//for
    	
    	st.push(str);
    	
    	System.out.println(st);
    	
    	str = "";
    	int size = st.size();
    	for (int i = 0; i < size; i++) {
    		str += st.pop();
    		str += " ";
    	}//for
    	
    	str = str.substring(0, str.length()-1);
    	
    	return str;
    }//solve
    
    
	public static void main(String [] args) {
		
		String sentence = "hello there my friend";
		
		System.out.println(solve(sentence));
		
	}//main
}//classname
