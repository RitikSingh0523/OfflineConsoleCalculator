package com.ltts.module3.main;

import java.util.Scanner;

import com.ltts.module3.Arithmetic.Arithmetic;
import com.ltts.module3.CompoundInterest.compoundInterest;
import com.ltts.module3.SimpleInterest.SimpleInterest;

public class Begin {
	Scanner scan=new Scanner(System.in);
	public void start()
	{
		
		System.out.println("Choose A Calculator From\n1.Arthmatic Functional Calculator\n2.Simple Interest Calculator\n3.Compound Interest Calculator\n4.EXIT");
		int opt=scan.nextInt();
		
		switch(opt)
		{
		case 1:
			Arithmetic ar=new Arithmetic();
			ar.option();
			break;
		case 2:
			SimpleInterest si=new SimpleInterest();
			si.simple();
			break;
		case 3:
			compoundInterest ci=new compoundInterest();
			ci.simple();
		break;
		case 4:
			End ed=new End();
			ed.end();
			break;
		default:
			System.err.print("Wrong Input");
		    
		}
	}

}
