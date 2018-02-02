package com.jocata.star.practisesecond;

public class FibonocciSeries {

	// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 
	
	
	public static void main(String[] args) {
		int n=10, a=0,b=1,c;
		c=a+b;
		System.out.println(a);
		System.out.println(b);
		while(c<=n)
		{
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
		}
	}	
	
}
