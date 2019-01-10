import java.lang.reflect.Constructor;
import java.util.Scanner;

class Demo{
	
	String name;
	int age;
	double marks;
	
	//Constructor don't have return value
	
	Demo(){
		
		age = 30;
	}
	void setData()
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter name");
		name = obj.nextLine();
		
		//System.out.println("enter age");
	//	age = obj.nextInt();
		
		System.out.println("enter marks");
		marks = obj.nextDouble();
		
	}
	
	void display()
	{
		System.out.println("name=="+name+"=age=="+age+"=marks="+marks);
	}
}

class checkOverloading{
	
	// method overloading. Method name can be same but input parameters signature should not be same.
	void car(String s){
		
		System.out.println("car is s="+ s);
	}
	
	void car(int a){
		
		System.out.println("car is a="+ a);
	}
}

class checkOveridingBase{
	
	int i;
	checkOveridingBase(){
		
		i =5;
	}
	
	void hello(){
		
		System.out.println("base method i ="+i);
		
	}
}

class checkOveridingChild extends checkOveridingBase{
	
	void hello(){
		//Super calls base class methods and constructors
		super.hello();
		System.out.println("child method i ="+i);
		
	}
}

public class AllOops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int a, b;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter input");
		a = obj.nextInt();
		System.out.println("welcome to oops");*/
		
		/*Demo d = new Demo();
		d.setData();
		d.display();*/
		
		/*checkOverloading ch = new checkOverloading();
		ch.car(1);
		ch.car("new");*/
		
		checkOveridingChild ch = new checkOveridingChild();
		
		ch.hello();
		
		//Runtime polymorhism 
		checkOveridingBase bs = new checkOveridingChild();
		bs.hello();

	}
	
	
}
//Abstraction

abstract class person{
		
		String name;
		String gender;
		
		
		
		abstract void work();
		
		public String toString(String n){
		return "hello"+this.name+"=gender="+this.gender;
			
		}
		
		void changeName(String n){
			
			name = n;
		}
	}

class emp extends person{
	
	//
	void work(){
		
		System.out.println("method overidden");
	}
	
	
}

