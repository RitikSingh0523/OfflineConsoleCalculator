package com.ltts.module3.Arithmetic;

import java.util.Scanner;

import com.ltts.module3.operation.Operation;


public class Trigno {
	Scanner sc=new Scanner(System.in);
	private double angle;
	private double result;
	public Scanner getSc() {
		return sc;
	}
	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	public double getAngle() {
		return angle;
	}
	public void setAngle(double angle) {
		this.angle = angle;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public Trigno(Scanner sc, double angle, double result) {
		super();
		this.sc = sc;
		this.angle = angle;
		this.result = result;
	}
	public Trigno() {
		super();
	}
	public void sine()
	{
		System.out.println("Enter Angle");
		double ab=sc.nextDouble();
		setAngle(ab);
		double res=Math.sin(getAngle());
		setResult(res);
		System.out.print(getResult());
		System.out.print("\n");
		Operation s1=new Operation();
		s1.trigo();
	}
	public void cosc()
	{
		System.out.println("Enter Angle");
		double ab=sc.nextDouble();
		setAngle(ab);
		double res=Math.cos(getAngle());
		setResult(res);
		System.out.print(getResult());
		System.out.print("\n");
		Operation s1=new Operation();
		s1.trigo();
	}
	public void Tang()
	{
		System.out.println("Enter Angle");
		double ab=sc.nextDouble();
		setAngle(ab);
		double res=Math.tan(getAngle());
		setResult(res);
		System.out.print(getResult());
		Operation s1=new Operation();
		s1.trigo();
	}
	public void cose()
	{
		System.out.println("Enter Angle");
		double ab=sc.nextDouble();
		setAngle(ab);
		double res=Math.cosh(getAngle());
		setResult(res);
		System.out.print(getResult());
		System.out.print("\n");
		Operation s1=new Operation();
		s1.trigo();
	}
	public void secc()
	{
		System.out.println("Enter Angle");
		double ab=sc.nextDouble();
		setAngle(ab);
		double res=1/Math.cos(getAngle());
		setResult(res);
		System.out.print(getResult());
		System.out.print("\n");
		Operation s1=new Operation();
		s1.trigo();
	}
	public void cote()
	{
		System.out.println("Enter Angle");
		double ab=sc.nextDouble();
		setAngle(ab);
		double res=1/Math.tan(getAngle());
		setResult(res);
		System.out.print(getResult());
		System.out.print("\n");
		Operation s1=new Operation();
		s1.trigo();
	}

}
