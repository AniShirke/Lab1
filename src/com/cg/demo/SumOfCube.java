package com.cg.demo;

public class SumOfCube {
	
	public static int square(int rem)
	{
		return rem*rem*rem;
	}
	
	public static void main(String[] args) {
		System.out.println(sum(123));
	}
		
		public static int sum(int num)
		{
			int sum=0;
			for(int i=num;i>0;i=i/10)
			{
				int rem=i%10;
				sum=sum+square(rem);
			}
			return sum;
			}
		
	}

