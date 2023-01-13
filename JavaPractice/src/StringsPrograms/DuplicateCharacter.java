package StringsPrograms;

import java.util.HashMap;

public class DuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String s1 = "Java Selenium";
		
	HashMap<Character,Integer> values = new HashMap<Character,Integer>();
	
	  for(int i=0 ; i<s1.length(); i++) {
		  
		 char ch = s1.charAt(i);
		 
		 Integer count = values.get(ch);
		 
		 if(!(values.containsKey(ch))) {
			 values.put(ch, 1);
		}
		 else {
			 //values.put(ch, values.get(ch)+1);
			 values.put(ch, ++count);
		 }
	  }
	  
	  values.forEach((key, value) -> System.out.println(key + " : " + value));
		
	}

}
