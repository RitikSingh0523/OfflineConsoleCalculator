package com.ltts.module3.Arithmetic;

import java.util.Scanner;


import com.ltts.module3.operation.Operation;



public class Logrt {
	Scanner sc=new Scanner(System.in);
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
	public Logrt(double operator, double result) {
		super();
		this.operator = operator;
		this.result = result;
	}
	public Logrt() {
		super();
	}
	public void loge()
	{
		System.out.print("1.log10\n2.log2\n3.Exit");
		int op=sc.nextInt();
		switch(op)
		{
		case 1:
			System.out.println("Enter your number");
			double no=sc.nextDouble();
			setOperator(no);
			double res=Math.log10(getOperator());
			setResult(res);
			System.out.print(getResult());
			System.out.print("\n");
			Operation s1=new Operation();
			s1.log();
			break;
		case 2:
			System.out.println("Enter your number");
			double no1=sc.nextDouble();
			setOperator(no1);
			double res1=Math.log(getOperator());
			setResult(res1);
			System.out.print(getResult());
			System.out.print("\n");
			Operation s2=new Operation();
			s2.log();
			break;
		case 3:
			Arithmetic br=new Arithmetic();
			br.option();
			break;
		default:
			System.err.print("Wrong Input");
			
		}
	}

}
