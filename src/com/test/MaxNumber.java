package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MaxNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++)
		{
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		Map<Integer, Integer> hashMap = new HashMap<Integer,Integer>();
		
		for(int i = 0; i < list.size(); i++)
		{
			if(!hashMap.isEmpty() && hashMap.containsKey(list.get(i)))
			{
				hashMap.put(list.get(i), hashMap.get(list.get(i)) + 1);
			}
			else
			{
				hashMap.put(list.get(i), 1);
			}
		}
		int max = 0;
		int index = 0;
		for(int i = 0; i < hashMap.size(); i++)
		{
			if(max < hashMap.get(list.get(i)))
			{
				max = hashMap.get(list.get(i));
				index = i;
			}
		}
		System.out.println(list.get(index));
	}
	
}	
