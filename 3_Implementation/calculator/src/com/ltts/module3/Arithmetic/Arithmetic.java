package com.ltts.module3.Arithmetic;
import java.util.Scanner;
import com.ltts.module3.sum.sum;
public class Arithmetic {
	public void option()
	{
		Scanner sca=new Scanner(System.in);
		System.out.println("1.Sum\n2.Substract\n3.Multiplication\n4.Division\n5.Square\n6.SquareRoot\n7.Approx Value\n8.Power of Number");
		int opti=sca.nextInt();
		
		switch(opti)
		{
		case 1:
			sum s1=new sum();
			s1.resl();
			break;
        case 2:
        	substract s2=new substract();
        	s2.resl();
			
			break;
        case 3:
			multiply s3=new multiply();
			s3.resl();
			break;
        case 4:
			division s4=new division();
			s4.resl();
			break;
        case 5:
        	square s5=new square();
        	s5.resl();
			
			break;
        case 6:
        	SquareRoot s6=new SquareRoot();
        	s6.resl();
			break;
        case 7:
        	Approx s7=new Approx();
        	s7.resl();
        case 8:
        	Power s8=new Power();
        	s8.resl();
		}
	}

}
