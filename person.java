package firsttask;

class person {
	
	String name;
	int age;
	
	person(){
		age = 18;
	}

	person(String name, int age ){
		
		this.name = name;
		this.age = age;
				
	}
	
	
	void display () {
		
		System.out.println("Name : " + name);
		System.out.println("Age  : " + age);
		
	}
	
	
	public static void main(String[] args) {
		
		person p1 = new person();
		p1.name= "Akbar";
		p1.display();
		
		System.out.println();
		
		
		person p2 = new person();
		p2.name = "Imran";
		p2.age  = 40;
		p2.display();
	
		
		
		
	}
		
}
