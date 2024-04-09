package oops;

abstract class Car
{
	abstract public void speedlimit();
	public void design() {
		System.out.println("SUV");

	}
	
}
class Audi extends Car{

	@Override
	public void speedlimit() {
		// TODO Auto-generated method stub
		System.out.println("Brand new");

	}
	
}
class Benz extends Car{

	@Override
	public void speedlimit() {
		// TODO Auto-generated method stub
		System.out.println("New Mercidez");

	}
	
}
public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Benz B=new Benz();
		Audi A=new Audi();
		A.design();
		A.speedlimit();
		B.design();
		B.speedlimit();
	}

}
/*
abstract 

2 methods


regular and abstract methods
focus on main thing dont need to go through the internal implementation
hiding the implementation details from user only the functionality will be provided to the user
Abstraction can achieve in 2 ways 
abstract class
interface
abstract class
**********
it is a restricted class that cannot be used to create object. to access it it must be inherited from another class
abstract method can only be used in an abstract class and it does not have a body. the body is provided by subclass
an abstract class can have both regular and abstract methods

interface
*********
interface in java is a blue print of class
interface contains final and static variable by default
interface contains abstract method
methods in interface are public by default
interface supports the functionality of multiple inheritance
we can define interface using interface key word
a class extends another class interface extends another interface and but a class implements an interface
we can create object reference for interface but we cannot instantiate interface


*
*/