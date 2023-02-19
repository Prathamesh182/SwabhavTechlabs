package com.aurionpro.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OccurenceOFChar {

	public static void DuplicateChar(String obj) {
		Map<Character,Integer> map = new HashMap<>();
		char[] c = obj.toCharArray();
		for(char x : obj.toLowerCase().toCharArray()) {
			if(Character.isLetterOrDigit(x)) {
				
			
			if(map.containsKey(x)) {
				map.put(x,map.get(x)+1);
			}
			else {
				map.put(x, 1);
				
			}
			}
		}
	//	Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for(Entry<Character, Integer> set: map.entrySet()) {
			
				System.out.println(set.getKey()+" : "+set.getValue());
			
		}
		
		
	
	}
	public static void main(String[] args) {
		String str = "Mahabhara@ t";
		DuplicateChar(str);
		
	}
	

	

}
