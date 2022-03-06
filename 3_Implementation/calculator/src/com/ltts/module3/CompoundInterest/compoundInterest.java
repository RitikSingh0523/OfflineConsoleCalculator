package com.ltts.module3.CompoundInterest;

import java.util.Scanner;

import com.ltts.module3.main.Begin;

public class compoundInterest {
	Scanner sc=new Scanner(System.in);
	private double prin;
	private double rate1;
	private int time1;
	private double interest1;
	private double tamount;
	public double getPrin() {
		return prin;
	}
	public void setPrin(double prin) {
		this.prin = prin;
	}
	public double getRate1() {
		return rate1;
	}
	public void setRate1(double rate1) {
		this.rate1 = rate1;
	}
	public int getTime1() {
		return time1;
	}
	public void setTime1(int time1) {
		this.time1 = time1;
	}
	public double getInterest1() {
		return interest1;
	}
	public void setInterest1(double interest1) {
		this.interest1 = interest1;
	}
	public double getTamount() {
		return tamount;
	}
	public void setTamount(double tamount) {
		this.tamount = tamount;
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
		setPrin(p);
		System.out.println("Enter Rate Of Interest:-");
		double r=sc.nextDouble();
		setRate1(r);
		System.out.println("Enter Time in year:-");
		int t=sc.nextInt();
		setTime1(t);
		double q=(1+getRate1()/100);
        
        double pow=1;
        for(int i=0; i<t;i++)
        {
            pow=pow*q;
        }
        double tin=getPrin()*pow;   
        double in=tin-getPrin();
		setInterest1(in);
		System.out.println("Your interest is :-");
		System.out.print(getInterest1());
		
		setTamount(tin);
		System.out.println("\nYour TotalAmount is :-");
		System.out.print(getTamount());
		System.out.print("\n");
		compoundInterest si=new compoundInterest();
		si.simple();
		break;
	case 2:
		System.out.println("Enter Princple Amount:-");
		double p1=sc.nextDouble();
		setPrin(p1);
		System.out.println("Enter Rate Of Interest:-");
		double r1=sc.nextDouble();
		setRate1(r1);
		System.out.println("Enter Time Year period:-");
		int t1=sc.nextInt();
		setTime1(t1);
		double q1=(1+getRate1()/200);
        double pow1=1;
        for(int i=0; i<t1*2;i++)
        {
            pow1=pow1*q1;
        }
        double tin1=getPrin()*pow1;   
        double in1=tin1-getPrin();
		setInterest1(in1);
		System.out.println("Your interest is :-");
		System.out.print(getInterest1());
		
		setTamount(tin1);
		System.out.println("\nYour TotalAmount is :-");
		System.out.print(getTamount());
		System.out.print("\n");
		compoundInterest si1=new compoundInterest();
		si1.simple();
		break;
		
	case 3:
		System.out.println("Enter Princple Amount:-");
		double p11=sc.nextDouble();
		setPrin(p11);
		System.out.println("Enter Rate Of Interest:-");
		double r11=sc.nextDouble();
		setRate1(r11);
		System.out.println("Enter Time Year period:-");
		int t11=sc.nextInt();
		setTime1(t11);
		double q11=(1+getRate1()/400);
        double pow11=1;
        for(int i=0; i<t11*4;i++)
        {
            pow11=pow11*q11;
        }
        double tin11=getPrin()*pow11;   
        double in11=tin11-getPrin();
		setInterest1(in11);
		System.out.println("Your interest is :-");
		System.out.print(getInterest1());
		
		setTamount(tin11);
		System.out.println("\nYour TotalAmount is :-");
		System.out.print(getTamount());
		System.out.print("\n");
		compoundInterest si11=new compoundInterest();
		si11.simple();
		break;
		
	case 4:
		System.out.println("Enter Princple Amount:-");
		double p111=sc.nextDouble();
		setPrin(p111);
		System.out.println("Enter Rate Of Interest:-");
		double r111=sc.nextDouble();
		setRate1(r111);
		System.out.println("Enter year period:-");
		int t111=sc.nextInt();
		setTime1(t111);
		double q111=(1+getRate1()/1200);
        double pow111=1;
        for(int i=0; i<t111*12;i++)
        {
            pow111=pow111*q111;
        }
        double tin111=getPrin()*pow111;   
        double in111=tin111-getPrin();  
    
		setInterest1(in111);
		System.out.println("Your interest is :-");
		System.out.print(getInterest1());

		setTamount(tin111);
		System.out.println("\nYour TotalAmount is :-");
		System.out.print(getTamount());
		System.out.print("\n");
		compoundInterest si111=new compoundInterest();
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
