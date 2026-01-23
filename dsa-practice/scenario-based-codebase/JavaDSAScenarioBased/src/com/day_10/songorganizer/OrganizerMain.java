package com.day_10.songorganizer;

public class OrganizerMain {

	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.insert(new Song(1, "In the End"));
		bst.insert(new Song(4, "Fall Apart"));
		bst.insert(new Song(2, "After Dark"));
		bst.insert(new Song(3, "Kids"));
		
		System.out.println("Search (Track ID : 4)");
		System.out.println(bst.search(4));
		
		System.out.println();
		
		bst.displayAlphabetical();
	}
}
