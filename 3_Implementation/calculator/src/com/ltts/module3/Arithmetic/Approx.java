package com.ltts.module3.Arithmetic;

import java.util.Scanner;

public class Approx {
	private double operator;
	private int result;
	public Approx(double operator, int result) {
		super();
		this.operator = operator;
		this.result = result;
	}
	public Approx() {
		super();
	}
	public double getOperator() {
		return operator;
	}
	public void setOperator(double operator) {
		this.operator = operator;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public void resl()
	{
Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Your Operator:-");
		double a=sc.nextDouble();
		setOperator(a);
		int res=(int)Math.round(getOperator());
		setResult(res);
		System.out.print(getResult());
		System.out.print("\n");
		Arithmetic br=new Arithmetic();
		br.option();
	}

}
