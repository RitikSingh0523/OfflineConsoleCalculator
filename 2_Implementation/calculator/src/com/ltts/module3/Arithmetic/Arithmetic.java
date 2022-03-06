package com.ltts.module3.Arithmetic;
import java.util.Scanner;

import com.ltts.module3.main.Begin;
import com.ltts.module3.main.End;
import com.ltts.module3.operation.operation;

public class Arithmetic {
	Scanner sca=new Scanner(System.in);
	public void option()
	{
		
		System.out.println("1.Sum\n2.Substract\n3.Multiplication\n4.Division\n5.Square\n6.SquareRoot\n7.Approx Value\n8.Power of Number\n9.Factorial\n10.Trignomatric Function\n11.Persentage\n12.Log Functions\n13.Exit\n14.END");
		int opti=sca.nextInt();
		operation s1=new operation();
		switch(opti)
		{
		case 1:
			
			s1.sum();
			break;
        case 2:
        	
        	s1.Subs();
			
        	break;
        case 3:
			
			s1.mult();
			break;
        case 4:
			
			s1.divi();
			break;
        case 5:
        	
        	s1.square();
			
        	break;
        case 6:
        	
        	s1.Squareroot();
        	break;
        case 7:
        	
        	s1.approx();
        	break;
        case 8:
        	
        	s1.power();
        	break;
        case 9:
        	
        	s1.facto();
        	break;
        case 10:
        	
        	s1.trigo();
        	break;
        case 11:
			s1.persentage();
			break;
        case 12:
        	s1.log();
        	break;
        case 13:
        	Begin bg=new Begin();
    		bg.start();
    		System.out.print("\n");
    		break;
        case 14:
        	End ed=new End();
			ed.end();
			break;
		default:
			System.err.print("Wrong Input");
        
		}
		
	}

}
