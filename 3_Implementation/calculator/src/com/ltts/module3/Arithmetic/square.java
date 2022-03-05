package com.ltts.module3.Arithmetic;

import java.util.Scanner;

public class square {
	private double operator1;
	private double result;
	public double getOperator1() {
		return operator1;
	}
	public void setOperator1(double operator1) {
		this.operator1 = operator1;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public square(double operator1, double result) {
		super();
		this.operator1 = operator1;
		this.result = result;
	}
	public square() {
		super();
	}
	public void resl()
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your Operator:-");
		double a=sc.nextDouble();
		setOperator1(a);
		double res=getOperator1()*getOperator1();
	    setResult(res);
		System.out.print( getResult());
		System.out.print("\n");
		Arithmetic br=new Arithmetic();
		br.option();
		
		
	}

	
}
