package com.ltts.module3.Arithmetic;

import java.util.Scanner;

public class division {
	private double operator1;
	private double operator2;
	private double result;
	public double getOperator1() {
		return operator1;
	}
	public void setOperator1(double operator1) {
		this.operator1 = operator1;
	}
	public double getOperator2() {
		return operator2;
	}
	public void setOperator2(double operator2) {
		this.operator2 = operator2;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public division(double operator1, double operator2, double result) {
		super();
		this.operator1 = operator1;
		this.operator2 = operator2;
		this.result = result;
	}
	public division() {
		super();
	}
	public void resl()
	{
Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter First Operator:-");
		double a=sc.nextDouble();
		setOperator1(a);
		System.out.print("Enter Second Operator:-");
		double b=sc.nextDouble();
		setOperator2(b);
		if(getOperator2()==0)
		{
			System.out.print("Can not Divide by Zero");
		}
		else
		{
			double res=getOperator1()/getOperator2();
		    setResult(res);
			System.out.print( getResult());
		}
		System.out.print("\n");
		Arithmetic br=new Arithmetic();
		br.option();
	}

}
