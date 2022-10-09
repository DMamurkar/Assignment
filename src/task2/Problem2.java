package task2;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Problem2 {

public static void main(String[] args) {
		
		String s = "abcabcbb";
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(int i=0; i<s.length();i++ )
		{
			if(hm.containsKey(s.charAt(i)))
			{
				hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
			}
			
			else
			{
				hm.put(s.charAt(i), 1);
			}
		}
		
		System.out.println(hm);
		
	}
}
