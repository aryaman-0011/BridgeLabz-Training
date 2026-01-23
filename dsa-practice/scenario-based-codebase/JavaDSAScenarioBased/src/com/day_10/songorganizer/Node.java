package com.day_10.songorganizer;

public class Node {

	Song data;
	Node left;
	Node right;
	
	public Node(Song data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
}
