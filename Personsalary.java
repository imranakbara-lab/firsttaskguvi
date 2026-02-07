package firsttask;

import java.util.Scanner;

class Person1 {
	 
	 String name;
	 int age;
	 
	 Person1 (String name, int age){
		 this.name = name;
		 this.age = age;
		 
	 }
		
}


 
 class Employee1 extends Person1{
 
  int employeeid;
  double salary;
  
  Employee1 (String name,int age, int employeeid,double salary){
	  
	  super (name, age);
	  this.employeeid =employeeid;
	  this.salary = salary;
  }


 void display() {

  System.out.println("Name        : " +name);
  System.out.println("Age         : " +age);
  System.out.println("Employee ID :" + employeeid);
  System.out.println("Salary      :" +salary);
	 
	 
 }
 }
 
 
public class Personsalary {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Name :");
		String name =sc.nextLine();
		
		System.out.println("Enter Age :");
		int age = sc.nextInt();
		
		System.out.println("Enter Employee ID :");
		int employeeid = sc.nextInt();
		
		System.out.println("Enter Salary :");
		double salary =sc.nextDouble();
		
		Employee1 emp = new Employee1(name, age, employeeid,salary);
		emp.display();
		
		sc.close();
		
		
		
	}

}
