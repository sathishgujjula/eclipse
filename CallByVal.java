package com.Stringprob;

class Globe{
	int x = 10;
	
	void m1(int x) {
		x=x+100;
		System.out.println("changing the value :"+x);
	}
}

public class CallByVal {

	public static void main(String[] args) {
		Globe obj = new Globe();
		/*
		 * int a = 200; System.out.println("Before paasing the value :"+a); obj.m1(a);
		 * System.out.println("After passing the value :"+a);
		 */
		
		System.out.println("Before passing the value "+obj.x);
		obj.m1(24);
		System.out.println("After change the value "+obj.x);
	}

}
