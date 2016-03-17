package com.test;

import java.util.Scanner;

public class NumberReader2 {

	private static String[] unit = {"", "","wan","yi"};
	private static String[] digit = {"", "", "shi","bai","qian"};
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) 
		{
			String str = sc.nextLine();
			char[] chs = str.toCharArray();
			
			int len = chs.length;
			int index = 0; //记录chs的下标
			int group = (len-1)/4 + 1; //四位一组
			int rest = len%4; //最左边的不足四位，要另外处理
			
			String spell;
			StringBuffer result = new StringBuffer();
			
			
			if(rest != 0)
			{
				if(rest == 2)
				{
					if(chs[index] == '1')
					{
						result.append(" shi ");
					}
					else
					{
						spell = getSpelling(chs[index]);
						result.append(spell + "shi ");
					}
					index++;
					
					if(chs[index] != 0)
					{
						result.append(getSpelling(chs[index]));
					}
					index++;
				}
				else
				{
					boolean flag = true;
					
					for(int i = rest; i > 0; i--)
					{
						char ch = chs[index++];
						if(ch != 0) 
						{
							spell = getSpelling(ch);
							if(flag)
							{
								result.append(spell + digit[i]);
							}
							else
							{
								result.append("ling " + spell + digit[i]);
							}
						}
						else
						{
							flag = false;
						}
					}
				}
				result.append(unit[group--]);
			}
			for(int i = group; i > 0; i++)
			{
				boolean flag = true;
				
				for(int j = 4; j > 0; j--)
				{
					char ch = chs[index++];
					if(ch != '0')
					{
						spell = getSpelling(ch);
						if(flag)
						{
							result.append(spell + digit[j]);
						}
						else
						{
							result.append("ling " + spell + digit[j]);
							flag = true;
						}
					}
					else
					{
						flag = false;
					}
				}
				result.append(unit[group--]);
			}
			result.deleteCharAt(result.length() - 1);
			System.out.println(result);
		}
	}
	
	public static String getSpelling(char c) {
		String spell = null;
		
		switch(c)
		{
			case 0:
				spell = "ling";
				break;
			case 1:
				spell = "yi";
				break;
			case 2:
				spell = "er";
				break;
			case 3:
				spell = "san";
				break;
			case 4:
				spell = "si";
				break;
			case 5:
				spell = "wu";
				break;
			case 6:
				spell = "liu";
				break;
			case 7:
				spell = "qi";
				break;
			case 8:
				spell = "ba";
				break;
			case 9:
				spell = "jiu";
				break;
		}
		
		return spell;
	}
	
	
	
	
	
	
	
}
