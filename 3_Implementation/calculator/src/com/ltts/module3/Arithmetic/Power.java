package com.ltts.module3.Arithmetic;

import java.util.Scanner;

public class Power {
	private double operator;
	private double power;
	private double result;
	public Power(double operator, double power, double result) {
		super();
		this.operator = operator;
		this.power = power;
		this.result = result;
	}
	public double getOperator() {
		return operator;
	}
	public void setOperator(double operator) {
		this.operator = operator;
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = power;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public Power() {
		super();
	}
	public void resl()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Operator:-");
		double a=sc.nextDouble();
		setOperator(a);
		System.out.print("Enter Second Operator:-");
		double b=sc.nextDouble();
		setPower(b);
		double res=Math.pow(getOperator(), getPower());
		setResult(res);
		System.out.print( getResult());
		System.out.print("\n");
		Arithmetic br=new Arithmetic();
		br.option();
	}

}
