/**Write a Java program using four different packages to demonstrate the use of access
specifiers.
● Package apack:
1. Define a class A with three variables:
a) public int pubVar
b) protected int protVar
c) private int privVar
2. Provide a constructor to initialize them.
● Package bpack:
1. Define a class B that extends A.
2. Create a display() method that tries to access variables of A using inheritance.
● Package cpack:
1. Define a class C with a display() method.
2. Inside display(), create an object of class A and try to access its variables.
● Package dpack:
1. Define a class ProtectedDemo with main().
2. Create objects of class B and class C.
3. Call their respective*/

package apack;
public class A {
	public int pubVar;
 	protected int protVar;
 	private int privVar;
	public A(int a, int b, int c) {
 		pubVar = a;
 		protVar = b;
 	privVar = c;
 	}
 
	public int getPrivVar() {
 		return privVar;
 	}
}

package bpack;
import apack.A;
public class B extends A {
	public B() {
 		super(10, 20, 30);
 	}
 
	public void display() {
 		System.out.println("Class B:");
 		System.out.println("Public: " + pubVar);
 		System.out.println("Protected: " + protVar);
 	}
}

package cpack;
import apack.A;
public class C {
 	public void display() {
 		A obj = new A(10, 20, 30);
 			System.out.println("\nClass C:");
 			System.out.println("Public: " + obj.pubVar);
 	}
}

package dpack;
import bpack.B;
import cpack.C;
public class D{
 	public static void main(String[] args) {
 		System.out.println("Dhruvi Patel");
		System.out.println("240390107027");
 		B b = new B();
 		C c = new C();
 		b.display();
 		c.display();
 	}
}
