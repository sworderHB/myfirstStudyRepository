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
        System.out.println(hello=="he"+"llo"); //true "he"+"llo"  ��+��java�ж�pool���Ƿ����hello�����򷵻��ַ������еĶ���  
        System.out.println(hello == "he" + llo); //false "he" + llo �ڶ����´�������
	}
}
