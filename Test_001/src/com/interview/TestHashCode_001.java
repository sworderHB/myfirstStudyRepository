package com.interview;

class A{
	private int id;	
	public A(int id)	{   this.id = id;	}
}
class B{
	private int id;	
	public B(int id) {   this.id = id;  	}
	public int hashCode(){  return new Integer(id).hashCode();  }
}
public class TestHashCode_001{
	public static void main(String[] args) {
		System.out.println("new A(1).hashCode() = " + new A(1).hashCode());
		System.out.println("new A(1).hashCode() = " + new A(1).hashCode());
		System.out.println();		
		System.out.println("new Integer(1).hashCode() = " + new Integer(1).hashCode());
		System.out.println("new Integer(1).hashCode() = " + new Integer(1).hashCode());
		System.out.println();		
		System.out.println("new String(\"haha\").hashCode() = " + new String("haha").hashCode());
		System.out.println("new String(\"haha\").hashCode() = " + new String("haha").hashCode());
		System.out.println();		
		System.out.println("\"haha\".hashCode() = " + "haha".hashCode());
		System.out.println("\"haha\".hashCode() = " + "haha".hashCode());
		System.out.println();		
		System.out.println("new B(1).hashCode() = " + new B(1).hashCode());
		System.out.println("new B(1).hashCode() = " + new B(1).hashCode());
		
		Integer it1 = new Integer(1);		Integer it2 = new Integer(1);
		System.out.println(it1 == it2);
		System.out.println(it1.equals(it2));
		System.out.println(it1.hashCode() == it2.hashCode());
	}
}
