package com.ltts.module3.Arithmetic;
import java.util.Scanner;
import com.ltts.module3.sum.sum;
public class Arithmetic {
	public void option()
	{
		Scanner sca=new Scanner(System.in);
		System.out.println("1.Sum\n2.Substract\n3.Multiplication\n4.Division\n5.Square\n6.SquareRoot\n7.Approx Value\n8.Power of Number\n9.Factorial");
		int opti=sca.nextInt();
		sum s1=new sum();
		switch(opti)
		{
		case 1:
			
			s1.resl();
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
        case 8:
        	
        	s1.power();
        case 9:
        	
        	s1.facto();
		}
	}

}
