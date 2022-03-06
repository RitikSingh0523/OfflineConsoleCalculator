package com.ltts.module3.SimpleInterest;

import java.util.Scanner;

import com.ltts.module3.main.Begin;

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
	System.out.print("1.Yearly\n2.HalfYearly\n3.Quaterly\n4.Monthly\n5.Exit\n");
	int c=sc.nextInt();
	switch(c)
	{
	case 1:
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
		System.out.print("\n");
		SimpleInterest si=new SimpleInterest();
		si.simple();
		break;
	case 2:
		System.out.println("Enter Princple Amount:-");
		double p1=sc.nextDouble();
		setPrincple(p1);
		System.out.println("Enter Rate Of Interest:-");
		double r1=sc.nextDouble();
		setRate(r1);
		System.out.println("Enter Time half month period:-");
		int t1=sc.nextInt();
		setTime(t1);
		double in1=(getPrincple()*(getRate()/2)*getTime())/100;
		setIntrest(in1);
		System.out.println("Your interest is :-");
		System.out.print(getIntrest());
		double tamount1=getPrincple()+getIntrest();
		setTotalAmount(tamount1);
		System.out.println("\nYour TotalAmount is :-");
		System.out.print(getTotalAmount());
		System.out.print("\n");
		SimpleInterest si1=new SimpleInterest();
		si1.simple();
		break;
	case 3:
		System.out.println("Enter Princple Amount:-");
		double p11=sc.nextDouble();
		setPrincple(p11);
		System.out.println("Enter Rate Of Interest:-");
		double r11=sc.nextDouble();
		setRate(r11);
		System.out.println("Enter Time Quater period:-");
		int t11=sc.nextInt();
		setTime(t11);
		double in11=(getPrincple()*(getRate()/4)*getTime())/100;
		setIntrest(in11);
		System.out.println("Your interest is :-");
		System.out.print(getIntrest());
		double tamount11=getPrincple()+getIntrest();
		setTotalAmount(tamount11);
		System.out.println("\nYour TotalAmount is :-");
		System.out.print(getTotalAmount());
		System.out.print("\n");
		SimpleInterest si11=new SimpleInterest();
		si11.simple();
		break;
	case 4:
		System.out.println("Enter Princple Amount:-");
		double p111=sc.nextDouble();
		setPrincple(p111);
		System.out.println("Enter Rate Of Interest:-");
		double r111=sc.nextDouble();
		setRate(r111);
		System.out.println("Enter Time in month period:-");
		int t111=sc.nextInt();
		setTime(t111);
		double in111=(getPrincple()*(getRate()/12)*getTime())/100;
		setIntrest(in111);
		System.out.println("Your interest is :-");
		System.out.print(getIntrest());
		double tamount111=getPrincple()+getIntrest();
		setTotalAmount(tamount111);
		System.out.println("\nYour TotalAmount is :-");
		System.out.print(getTotalAmount());
		System.out.print("\n");
		SimpleInterest si111=new SimpleInterest();
		si111.simple();
		break;
	case 5:
		Begin bg=new Begin();
		bg.start();
		System.out.print("\n");
		break;
    default:
    	System.err.print("Wrong Input");
    	
	}
		
		
	}
	

}
