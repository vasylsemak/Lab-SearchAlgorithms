
public class LinearSearch {

	public static void main(String[] args) {
		 char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		 
		 LinearSearch ls = new LinearSearch();
		 
		 System.out.println("Index is: " + (ls.findLetterIdx('f', letters)));
		 System.out.println("Index from end is: " + (ls.findLetterIdxBackwards('f', letters)));
	}
	
	
	public int findLetterIdx(char target, char[] abc) {
		if(abc == null) return -1;
		
		for(int i = 0; i < abc.length; i++) {
			if(abc[i] == target) return i;
		}
		
		return -1;
	}
	
	
	public int findLetterIdxBackwards(char target, char[] data) {
		if(data == null) return -1;
		
		for(int i = (data.length -1); i >= 0; i--) {
			if(data[i] == target) return i;
		}
		
		return 7;
	}

}
