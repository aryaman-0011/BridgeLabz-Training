package com.day_10.productinventory;

public class InventoryMain {

	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.insert(new Product(40, "Laptop", 80000));
		bst.insert(new Product(60, "Keyboard", 2000));
		bst.insert(new Product(20, "Mouse", 800));
		bst.insert(new Product(3, "Controller", 1200));
		bst.insert(new Product(5, "RTX 5090", 150000));
		
		System.out.println("Sorted Product");
		bst.display();
		
		System.out.println();
		
		System.out.println("Update graphics price");
		bst.updatePrice(5, 180000);
		
		System.out.println("Search product with (SKU = 20)");
		System.out.println(bst.search(20));
		
		System.out.println();
		
		bst.display();
		
		
	}
}
