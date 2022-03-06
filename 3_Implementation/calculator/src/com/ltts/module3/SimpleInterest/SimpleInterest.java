package com.ltts.module3.SimpleInterest;

import java.util.Scanner;

public class SimpleInterest {
	Scanner sc=new Scanner(System.in);
	private double princple;
	private double rate;
	private int time;
	private double intrest;
	private double totalAmount;
	public double getPrincple() {
		return princple;
	}
	public void setPrincple(double princple) {
		this.princple = princple;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public double getIntrest() {
		return intrest;
	}
	public void setIntrest(double intrest) {
		this.intrest = intrest;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public SimpleInterest(double princple, double rate, int time, double intrest, double totalAmount) {
		super();
		this.princple = princple;
		this.rate = rate;
		this.time = time;
		this.intrest = intrest;
		this.totalAmount = totalAmount;
	}
	public SimpleInterest() {
		super();
	}
	public void simple()
	{
		System.out.println("Enter Princple Amount:-");
		double p=sc.nextDouble();
		setPrincple(p);
		System.out.println("Enter Rate Of Interest:-");
		double r=sc.nextDouble();
		setRate(r);
		System.out.println("Enter Time in year:-");
		int t=sc.nextInt();
		setTime(t);
		double in=(getPrincple()*getRate()*getTime())/100;
		setIntrest(in);
		System.out.println("Your interest is :-");
		System.out.print(getIntrest());
		double tamount=getPrincple()+getIntrest();
		setTotalAmount(tamount);
		System.out.println("\nYour TotalAmount is :-");
		System.out.print(getTotalAmount());
		
		
		
	}
	

}
