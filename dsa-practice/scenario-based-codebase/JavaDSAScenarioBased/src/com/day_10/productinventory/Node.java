package com.day_10.productinventory;

public class Node {
	
	Product data;
	Node left;
	Node right;
	
	public Node(Product data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

}
