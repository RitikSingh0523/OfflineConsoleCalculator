package com.ltts.module3.Arithmetic;

import java.util.Scanner;

public class SquareRoot {
	private double operator;
	private double result;
	public double getOperator() {
		return operator;
	}
	public void setOperator(double operator) {
		this.operator = operator;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public SquareRoot(double operator, double result) {
		super();
		this.operator = operator;
		this.result = result;
	}
	public SquareRoot() {
		super();
	}
	public void resl()
	{
        Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Your Operator:-");
		double a=sc.nextDouble();
		setOperator(a);
		double res=Math.sqrt(getOperator());
	    setResult(res);
		System.out.print( getResult());
		System.out.print("\n");
		Arithmetic br=new Arithmetic();
		br.option();
	}
}
