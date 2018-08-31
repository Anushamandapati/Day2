package com.capgemini.test;

public class Interest
{
	double simpleInterest(int p,int t,int r)
	{
		double num;
		num=(double)(p*t*r)/100;
		System.out.println("Simple Interest is:" + num);
		return num;
	}
	double compoundInterest(int p,int t,int r)
	{
		double i;
		i=((double)p*Math.pow(1.0+r*0.01,t));
		i=(double)i-p;
		System.out.println("Compound Interest is:" + i);
		return i;
	}
	public static double[] interest(int[] input)
	{
		double ar[]=new double[2];
		Interest i =new Interest();
		ar[0]=i.simpleInterest(input[0], input[1], input[2]);
		ar[1]=i.compoundInterest(input[0], input[1], input[2]);
		return ar;
	}
}
