package com.ltts.module3.sum;

import java.util.Scanner;

import com.ltts.module3.Arithmetic.Arithmetic;


public class sum {
		private double operator1;
		private double operator2;
		private double result;
		public sum() {
			super();
		}
		public sum(double operator1, double operator2, double result) {
			super();
			this.operator1 = operator1;
			this.operator2 = operator2;
			this.result = result;
		}
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
		Scanner sc=new Scanner(System.in);
		public void resl()
		{
			
			
			
			System.out.print("Enter First Operator:-");
			double a=sc.nextDouble();
			setOperator1(a);
			System.out.print("Enter Second Operator:-");
			double b=sc.nextDouble();
			setOperator2(b);
		    double res=getOperator1()+getOperator2();
		    setResult(res);
			System.out.print( getResult());
			System.out.print("\n");
			Arithmetic br=new Arithmetic();
			br.option();
			
			
		}
		public void Subs()
		{
			
			
			System.out.print("Enter First Operator:-");
			double a=sc.nextDouble();
			setOperator1(a);
			System.out.print("Enter Second Operator:-");
			double b=sc.nextDouble();
			setOperator2(b);
			double res=getOperator1()-getOperator2();
		    setResult(res);
			System.out.print( getResult());
			System.out.print("\n");
			Arithmetic br=new Arithmetic();
			br.option();	
		}
		public void mult()
        {		
			
			System.out.print("Enter First Operator:-");
			double a=sc.nextDouble();
			setOperator1(a);
			System.out.print("Enter Second Operator:-");
			double b=sc.nextDouble();
			setOperator2(b);
			double res=getOperator1()*getOperator2();
		    setResult(res);
			System.out.print( getResult());
			System.out.print("\n");
			Arithmetic br=new Arithmetic();
			br.option();
		}
		public void divi()
		{
	
			
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
		public void square()
		{
			
			
			
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
		public void Squareroot()
		{
	        
			
			System.out.print("Enter Your Operator:-");
			double a=sc.nextDouble();
			setOperator1(a);
			double res=Math.sqrt(getOperator1());
		    setResult(res);
			System.out.print( getResult());
			System.out.print("\n");
			Arithmetic br=new Arithmetic();
			br.option();
		}
		public void approx()
		{
	        
			
			System.out.print("Enter Your Operator:-");
			double a=sc.nextDouble();
			setOperator1(a);
			int res=(int)Math.round(getOperator1());
			setResult(res);
			System.out.print(getResult());
			System.out.print("\n");
			Arithmetic br=new Arithmetic();
			br.option();
		}
		public void power()
		{
			
			System.out.print("Enter First Operator:-");
			double a=sc.nextDouble();
			setOperator1(a);
			System.out.print("Enter power:-");
			double b=sc.nextDouble();
			setOperator2(b);
			double res=Math.pow(getOperator1(), getOperator2());
			setResult(res);
			System.out.print(getResult());
			System.out.print("\n");
			Arithmetic br=new Arithmetic();
			br.option();
		}
		public void facto()
		{
	        
			System.out.print("Enter First Operator:-");
			int a=sc.nextInt();
			setOperator1(a);
			int fact = 1;  
		        int i = 1;  
		  
		        while( i <= getOperator1() ) {  
		            fact = fact * i;   
		            i++;   
		        }  
		  
		        //returning result to main()  
		        
		    setResult(fact);
			System.out.print( getResult());
			System.out.print("\n");
			Arithmetic br=new Arithmetic();
			br.option();
		}
		
		

	}



