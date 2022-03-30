package package2;

import package1.ClassA;

public class ClassD
{
	public static void main(String[]args)
	{
		System.out.println(ClassA.a);
		//System.out.println(dhanu.c);   c is a static element so 
                                   //    here restrict this property
		//System.out.println(dhanu.c);
	}

}
