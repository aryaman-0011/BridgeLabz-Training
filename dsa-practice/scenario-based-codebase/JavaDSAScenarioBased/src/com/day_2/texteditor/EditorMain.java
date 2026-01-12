/*
6. TextEditor – Undo/Redo Functionality (Stack)
Story: Shanaya is building a basic text editor app. Every action (insert, delete, format) is
pushed onto a Stack. An Undo action pops from the stack, and Redo uses another stack to
reapply actions.
Requirements:
● Support insert/delete operations.
● Undo using a stack.
● Maintain redo stack separately.
*/

package com.day_2.texteditor;

public class EditorMain {
	public static void main(String[] args) {
		
		TextEditor editor = new TextEditor();
		
		editor.insert("Hello");
		editor.insert("World");
		editor.showContent();
		
		editor.undo();
		editor.showContent();
		
		editor.redo();
		editor.showContent();
		
		editor.delete("World");
		editor.showContent();
		
		editor.undo();
		editor.showContent();
	}
}
