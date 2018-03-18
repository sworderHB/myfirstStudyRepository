package com.interview;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class TestString_001
{
	public static void main(String[] args)
	{
		HashMap hm = new HashMap();
		hm.entrySet();

		
		
		ConcurrentHashMap s;
		String str1 = "hello";
		String str2 = "he" + new String("llo");
		System.out.println(str1 == str2);
		
		String str3 = "he" + "llo";
		System.out.println(str1 == str3);
		
		
		String hello = "hello";  
        String he = "he";  
        String llo = "llo";  
        System.out.println(hello=="he"+"llo"); //true "he"+"llo"  “+”java判断pool中是否存在hello，有则返回字符串池中的对象  
        System.out.println(hello == "he" + llo); //false "he" + llo 在堆中新创建对象
	}
}
