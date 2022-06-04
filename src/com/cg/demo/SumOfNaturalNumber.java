package com.cg.demo;

public class SumOfNaturalNumber {
	
	public static int sum(int n,int x,int y)
	{
		int s1;
		int s2;
		int s3;
		
		
		
		s1=((n/x)) * (2*x+(n/x-1)*x)/2;
		s2=((n/y)) * (2*y+(n/y-1)*y)/2;
		s3=((n/(x*y)))*(2*(x*y)+(n/(x*y)-1)*(x*y))/2;
		
		
		return s1 + s2 -s3;
	}
	public static void main(String[] args) {
		int n=12;
		int x=3;
		int y=5;
		
		System.out.println(sum(n,x,y));
	}
}
	
	
