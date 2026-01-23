package com.day_10.universityrecords;

public class BinarySearchTree {
	
	Node root;

	public void insert(Student student) {
		root = insertRec(root, student);
	}
	
	private Node insertRec(Node root, Student student) {
		if(root == null) {
			return new Node(student);
		}
		
		if(student.rollNumber < root.data.rollNumber) {
			root.left = insertRec(root.left, student);
		} else if (student.rollNumber > root.data.rollNumber) {
			root.right = insertRec(root.right, student);
		}
		
		return root;
	}
	
	public Student search(int rollNum) {
		Node result = searchRec(root, rollNum);
		return result == null ? null : result.data;
	}
	
	private Node searchRec(Node root, int rollNum) {
		if(root == null || root.data.rollNumber == rollNum) {
			return root;
		}
		
		if(rollNum < root.data.rollNumber) {
			return searchRec(root.left, rollNum);
		}
		
		return searchRec(root.right, rollNum);
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
	
	private Student deletedStudent;
	
	public Student delete(int rollNum) {
		deletedStudent = null;
		root = deleteRec(root, rollNum);
		return deletedStudent;
	}
	
	private Node deleteRec(Node root, int rollNum) {
		if(root == null) {
			return root;
		}
		
		if(rollNum < root.data.rollNumber) {
			root.left = deleteRec(root.left, rollNum);
		} else if(rollNum > root.data.rollNumber) {
			root.right = deleteRec(root.right, rollNum);
		} else {
			
			deletedStudent = root.data;
			
			if(root.left == null) return root.right;
			if(root.right == null) return root.left;
			
			Student successor = minValue(root.right);
			root.data = successor;
			root.right = deleteRec(root.right, successor.rollNumber);
		}
		
		return root;
	}
	
	private Student minValue(Node root) {
		Student min = root.data;
		
		while(root.left != null) {
			root = root.left;
			min = root.data;
		}
		
		return min;
	}
}
