package com.functionalinterface.runnable;

import java.io.File;

public class FileCleanup {

	public static void main(String[] args) {

		Runnable cleaupTask = () -> {
			File folder = new File(
					"D://Java programming workspace//java8-programming-practice//scenario-based-codebase//Java8ScenarioBased//src//com//functionalinterface//runnable//temp");
			
			if(folder.exists() && folder.isDirectory()) {
				File[] files = folder.listFiles();
				if(files != null) {
					for(File f : files) {
						if(f.delete()) {
							System.out.println("Deleted: " + f.getName());
						}
					}
				}
			} else {
				System.out.println("Temp folder not found!");
			}
		};
		
		new Thread(cleaupTask).start();
	
	}
}
