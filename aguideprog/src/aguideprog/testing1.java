package aguideprog;

public class testing1 {

	public static void main(String[] args) {
	
		 String str = "asddfghklkjshwuww";
	        
	        // Find the index of the last 'f' in the first substring
	        int endIndex1 = str.lastIndexOf('f') ;
	        // Get the first substring
	        String substring1 = str.substring(0, endIndex1);
	        System.out.println(substring1); // Output: asdf
	        
	        // Find the index of the first 'h' in the second substring
	        int startIndex2 = str.indexOf('h', str.indexOf('h')+1);
	        // Get the second substring
	        String substring2 = str.substring(startIndex2);
	        System.out.println(substring2); // Output: hwuw
			
	}

}
