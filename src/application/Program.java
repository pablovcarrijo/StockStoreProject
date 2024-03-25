package application;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Map<Integer, Product> map = new HashMap<>();
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("1 - Add product");
		System.out.println("2 - Check availability");
		System.out.println("3 - Product list on stock");
		System.out.println("4 - Calculate total value of stock");
		System.out.println("5 - Exit");
		
		int opc;
		
		do {
			
			System.out.print("type a option: ");
			opc = sc.nextInt();
			
			switch(opc) {
			case 1:
				System.out.print("Code: ");
				Integer code = sc.nextInt();
				
				if(map.containsKey(code)) {
					System.out.println("Code already exists");
					System.out.println();
					break;
				}
				
				else {
					System.out.print("Name: ");
					sc.nextLine();
					String name = sc.nextLine();
					
					System.out.print("Quantity: ");
					Integer quantity = sc.nextInt();
					
					System.out.print("Price per unit: ");
					Double pricePerUnit = sc.nextDouble();
					
					map.put(code, new Product(name, code, quantity, pricePerUnit));
					System.out.println("Product added successfully");
					System.out.println();
					break;
				}
		
			case 2:
				System.out.print("Code: ");
				code = sc.nextInt();
				if(map.containsKey(code)) {
					System.out.println("Product: " + map.get(code).getName());
				}
				else if(map.containsKey(code) == false) {
					System.out.println("Product not found");
				}
				System.out.println();
				break;
			case 3:
				for(Integer mp : map.keySet()) {
					System.out.println(map.get(mp).toString());
				}
				System.out.println();
				break;
				
			case 4:
				double totalValue = 0;
				for(Product product : map.values()) {
					totalValue += product.getPricePerUnit() * product.getQuantity();
				}
				System.out.println("Total value: " + String.format("%.2f", totalValue));
				System.out.println();
				break;
				
			case 5:
				System.out.println("Programa encerrado!");
				break;
				
			default:
				System.out.println("Invalid option");
				System.out.println();
			}
		} while(opc != 5);
		
		
		sc.close();
	}
	
}
