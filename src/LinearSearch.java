import java.util.Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		 char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		 
		 LinearSearch ls = new LinearSearch();
		 
		 System.out.println("Index is: " + (ls.findLetterIdx('c', letters)));
		 System.out.println("findLetterIdxBackwards is: " + (ls.findLetterIdxBackwards('x', letters)));
		 System.out.println("findLetterFromMiddle is: " + (ls.findLetterFromMiddle('l', letters)));
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
	
	
	public int findLetterFromMiddle(char target, char[] data) {
		if(data == null || data.length == 0) return -1;
		
		int middleP = (int)(data.length / 2);
		
		if(data[middleP] == target) return middleP;
		else {
			int leftP = middleP - 1;
			int rightP = middleP + 1;
			
			while(leftP >= 0 && rightP <= data.length) {
				
				if(data[leftP] == target) return leftP;
				if(data[rightP] == target) return rightP;
				
				leftP--;
				rightP++;
			}
		}

		return -1;
	}

}
