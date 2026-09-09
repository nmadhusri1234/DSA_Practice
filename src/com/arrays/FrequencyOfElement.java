package com.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencyOfElement {

	public static void main(String[] args) {
		
		int arr[] = {4,4,2,2,3,1,1,1};
		
		boolean vis [] = new boolean[arr.length];
		
		for(int i = 0;i<arr.length;i++)
		{
			if(vis[i])
			{
				continue;
			}
			int count=1;
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					vis[j]=true;
				}
			}
			System.out.println(arr[i]+"->"+count);
		}
		
		
		System.out.println();
		
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		
		for(int num : arr)
		{
			m.put(num, m.getOrDefault(num,0)+1);
		}
		
		for(Entry<Integer, Integer> mp : m.entrySet() )
		{
			System.out.println(mp.getKey()+"->"+mp.getValue());
		}
	}

}
