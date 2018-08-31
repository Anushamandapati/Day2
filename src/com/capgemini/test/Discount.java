package com.capgemini.test;

public class Discount
{

	public static double[] calculateDiscount(int newItem) 
	{
		// TODO Auto-generated method stub
		double arr[]= {0,0};
		int discount = newItem*35/100;
		int newItemPrice=newItem-discount;
		arr[0]=discount;
		arr[1]=newItemPrice;
		return arr;
	}

}
