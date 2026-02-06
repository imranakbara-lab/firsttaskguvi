package firsttask;

import java.util.Scanner;

public class ProductMain{
	

static class Product {
	
	int pid;
	double price;
	int quantity;
	
	Product(int pid, double price, int quantity) {
		
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}
	
}


	
	public static double calculateTotalAmount(Product[] products) {
		double total  = 0;
	
		for (Product p : products ) {
			total += p.price * p.quantity;
						
		}
		return total;
		
	}
	
	
 public static void main (String[] args) {
	 
	 Scanner sc =new Scanner (System.in);
	 
	 Product[] products = new Product [5];
	
	 for(int i = 0; i < 5; i++) {
		 
		 System.out.println("Enter the Details for Product: " + (i+1));
		 
		 System.out.println("Enter the Product ID:");
		 int pid = sc.nextInt();
		 
		 System.out.println("Enter Price         :");
		 double price =sc.nextDouble();
		 
		 System.out.println("Enter Quantity      : ");
		 int quantity =sc.nextInt();
		 
		 products [i] =new Product(pid, price, quantity);
		 	 
	 }
	 
	 double maxprice = products[0].price;
	 int maxpid = products[0].pid;
	 
	 for (int i =1; i< products.length; i++) {
		 
		 if(products[i].price > maxprice) {
			 
			 maxprice = products[i].price;
			 maxpid = products[i].pid;
			 
			 }
		 
		 }

	 System.out.println("Product Id with Hight price ->  " +maxpid);
	 
	 
	 double totalamount = calculateTotalAmount( products);
	 
	 System.out.println("Total Amount Spent          ->  " + totalamount);
	 sc.close();
 }

 
	 
 }
	

