package com.day_10.productinventory;

public class BinarySearchTree {

	Node root;

	public Product search(int sku) {
		Node result = searchRec(root, sku);
		return result == null ? null : result.data;
	}

	private Node searchRec(Node root, int sku) {
		if (root == null || root.data.sku == sku) {
			return root;
		}

		if (sku < root.data.sku) {
			return searchRec(root.left, sku);
		}

		return searchRec(root.right, sku);
	}

	public boolean updatePrice(int sku, double newPrice) {
		Node node = searchRec(root, sku);
		if (node == null) {
			return false;
		}

		node.data.price = newPrice;
		return true;
	}

	public void insert(Product product) {
		root = insertRec(root, product);
	}

	private Node insertRec(Node root, Product product) {

		if (root == null) {
			return new Node(product);
		}

		if (product.sku < root.data.sku) {
			root.left = insertRec(root.left, product);
		} else if (product.sku > root.data.sku) {
			root.right =  insertRec(root.right, product);
		}
		
		return root;

	}
	
	public void display() {
		inorder(root);
	}
	
	private void inorder(Node root) {
		if(root != null) {
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
		}
	}
}
