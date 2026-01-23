package com.day_10.songorganizer;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {

	Node root;
	
	public void insert(Song song) {
		root = insertSong(root, song);
	}
	
	private Node insertSong(Node root, Song song) {
		if(root == null) {
			return new Node(song);
		}
		
		if(song.trackId < root.data.trackId) {
			root.left = insertSong(root.left, song);
		} else if(song.trackId > root.data.trackId) {
			root.right = insertSong(root.right, song);
		}
		
		return root;
	}
	
	public Song search(int trackId) {
		Node result = searchSong(root, trackId);
		return result == null ? null : result.data;
	}
	
	private Node searchSong(Node root, int  trackId) {
		if(root == null || root.data.trackId == trackId) {
			return root;
		}
		
		if(trackId < root.data.trackId) {
			return searchSong(root.left, trackId);
		}
		
		return searchSong(root.right, trackId);
	}
	
	public void displayAlphabetical() {
		List<Song> list = new ArrayList<>();
		collect(root, list);
		
		list.sort((a, b) -> a.songName.compareTo(b.songName));
		
		for(Song s : list) {
			System.out.println(s);
		}
	}
	
	private void collect(Node root, List<Song> list) {
		if(root != null) {
			collect(root.left, list);
			list.add(root.data);
			collect(root.right, list);
		}
	}
}
