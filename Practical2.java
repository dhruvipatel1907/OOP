/**Write a Java program to solve a system of two linear equations with two variables (e.g., ax 
+ by = e and cx + dy = f). Prompt the user to enter the coefficients a, b, c, d, e, f. Calculate 
and display the values of x and y using Cramer's rule. Include error handling for cases where 
the denominator is zero.Cramer's rule : D=ad−bc, Dx=ed−bf, Dy=af−ce, x=Dx/D, y=Dy/D*/ 

import java.util.Scanner;

class Practical2
{
		public  static void main(String args[])
		{
			Scanner sc= new Scanner(System.in);
			double a,b,c,d,e,f;
			
			System.out.println("Enter value a:");
			a=sc.nextDouble();
			System.out.println("Enter value b:");
			b=sc.nextDouble();
			System.out.println("Enter value c:");
			c=sc.nextDouble();
			System.out.println("Enter value d:");
			d=sc.nextDouble();
			System.out.println("Enter value e:");
			e=sc.nextDouble();
			System.out.println("Enter value f:");
			f=sc.nextDouble();
			
			//D=ad−bc
			double D=(a*d)-(b*c);
			//Dx=ed−bf
			double Dx= (e*d)-(b*f);
			//Dy=af-ce
			double Dy=(a*f)-(c*e);
			
			if(D==0)
			{
				System.out.println("Denominator is zero.");
			}
			else
			{
				// x=Dx/D, y=Dy/D*
				double x=Dx/D;
				double y=Dy/D;
				System.out.println("Value of x: " +x);
				System.out.println("Value of y: " +y);
			}
		}
}