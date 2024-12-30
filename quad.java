import java.io.*;

import java.util.Scanner;
import java.lang.Math;

class quad
{
public static void main(String args[])
{
System.out.println(" Enter coefficients of the quadratic Equation : ");
Scanner x = new Scanner(System.in);
int a = x.nextInt();
int b = x.nextInt();
int c = x.nextInt();
double d = b*b - 4*a*c;
double r1,r2;
if(d>0)
{
System.out.println(" Roots are real and distinct ");
r1 = (-b + Math.sqrt(d))/(2*a);
r2 = (-b - Math.sqrt(d))/(2*a);
System.out.println(r1 + " " + r2);
}
else if(d == 0)
{
System.out.println(" Roots are real and equal ");
r1 = -b/(2.0*a);
r2 = -b/(2.0*a);
System.out.println(r1 + " " + r2);
}
else
{
System.out.println(" Roots are Imaginary ");

double p = Math.abs(d);
System.out.println(-b/(2.0*a) + " + " + "i" + Math.sqrt(p)/(2*a));
System.out.println(-b/(2.0*a) + " - " + "i" + Math.sqrt(p)/(2*a));
}
}
}