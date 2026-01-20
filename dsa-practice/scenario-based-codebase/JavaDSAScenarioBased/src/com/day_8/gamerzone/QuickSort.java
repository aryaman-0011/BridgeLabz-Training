package com.day_8.gamerzone;

public class QuickSort {

	public static void quickSort(Player[] players, int low, int high) {

		if (low < high) {

			int pivotIndex = partition(players, low, high);

			quickSort(players, low, pivotIndex - 1);
			;
			quickSort(players, pivotIndex + 1, high);
		}

	}

	private static int partition(Player[] players, int low, int high) {

		Player pivot = players[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {

			if (players[j].score > pivot.score) {
				i++;
				swap(players, i, j);
			}
		}

		swap(players, i + 1, high);
		return i + 1;

	}
	
	private static void swap(Player[] players, int i, int j) {
		Player temp = players[i];
		players[i] = players[j];
		players[j] = temp;
	}
}
