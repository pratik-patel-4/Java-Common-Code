import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> list = groupAnagrams(strs);
		System.out.println(list);
	}
	

	public static List<List<String>> groupAnagrams(String[] strs) {
		
		List<List<String>> list = new AbstractList<List<String>>() {
			
			List<List<String>> resultList = null; 
			
			@Override
			public int size() {
				if(resultList == null) {
					init();
				}
				return resultList.size();
			}			

			@Override
			public List<String> get(int index) {
				if(resultList == null) {
					init();
				}
				return resultList.get(index);
			}
			
			private void init() {
				Map<String,List<String>> resMap = new HashMap<>();
				
				for(String s : strs ) {
					char[] arr = new char[26];
					for(char ch : s.toCharArray()) {
						arr[ch - 97]++;
					}
					
					String strKey = String.valueOf(arr);
					resMap.computeIfAbsent(strKey, k -> new ArrayList<>());
					resMap.get(strKey).add(s);
				}
				
				resultList = new ArrayList<>(resMap.values().size());
				
				for(Map.Entry<String, List<String>> mapToList : resMap.entrySet()) {
					resultList.add(mapToList.getValue());
				}
				
			}
			
		};
		return list;
	}

}
