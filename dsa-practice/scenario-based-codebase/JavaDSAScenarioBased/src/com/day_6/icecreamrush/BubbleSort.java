package com.day_6.icecreamrush;

public class BubbleSort {

	public static void bubbleSort(Flavour[] flavours) {
		
		int n = flavours.length;
		
		for(int i = 0; i < n; i++) {
			boolean swapped = false;
			
			for(int j = 0; j < n -1 - i; j++) {
				if(flavours[j].sold > flavours[j + 1].sold) {
					
					Flavour temp = flavours[j];
					flavours[j] = flavours[j + 1];
					flavours[j + 1] = temp;
					
					swapped = true;
				}
			}
			
			if(!swapped) {
				break;
			}
		}
	}
}
