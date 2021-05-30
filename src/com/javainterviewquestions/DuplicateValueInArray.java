package com.javainterviewquestions;

//import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateValueInArray {

	public static void main(String[] args) {
		String language[] ={"java","ruby","python","pho","java"};
		
		//Approach 1--using 2 for loops time complexity is O(n)2
		for(int i=0; i<language.length;i++){
			for(int j=i+1;j<language.length;j++){
				if(language[i].equals(language[j])){
					System.out.println("duplicate value is::"+language[j]);
				}
				
			}
			
		}

		
		//Approach 2 using Set time comlexity O(n)
		System.out.println("***************************");
		
		Set<String> hashSet = new HashSet<String>();
		
		for(String name :language){
			if(hashSet.add(name)==false){
				System.out.println("duplicate value is::"+name);
			}
		}
		
		//Approach 3 --with Entry Set time complexity O(2n)
		System.out.println("*****3rd approach*****");
		
		Map<String, Integer> storeMap = new HashMap<String,Integer>();	
		for(String name : language){
			Integer count = storeMap.get(name);
			if(count==null){
				storeMap.put(name, 1);
			}
			else{
				storeMap.put(name, ++count);
			}
		}
		
		//iterate HashMap
		
		Set<Entry<String,Integer>> entrySet =storeMap.entrySet();
		for(Entry<String, Integer> entry : entrySet){
			if(entry.getValue()>1){
				System.out.println("duplicate value is::"+entry.getKey());
			}
		}
		
		
	}

}
