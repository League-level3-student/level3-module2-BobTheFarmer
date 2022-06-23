package _01_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
    public BogoSorter() {
        type = "Bogo";
    }

    /*
     * Bogo sort is a joke sorting algorithm. It is considered the most
     * inefficient sorting algorithm while still maintaining the possibility
     * of eventually sorting data.
     * 
     * It works by following these steps:
     * STEP 1. Is the array in order?
     * if yes, finished; if no, go to step 2.
     * STEP 2. Take two random elements in the array and swap them.
     * STEP 3. Go back to step 1.
     */
    @Override
    void sort(int[] array, SortingVisualizer display) {
    	Random rando = new Random();
    	int index1;
    	int index2;
    	int temp;
    	
     for (int i = 0; i > -1; i++) {
    		if(!intArraySorted(array)) {
    			index1 =  rando.nextInt(array.length);
    			index2 =  rando.nextInt(array.length);
    			temp = array[index2];
    			array[index2] = array[index1];
    			array[index1] = temp;
        } else {
        		break;
        }
    		
    		display.updateDisplay();
    }
     display.updateDisplay();
    }
   
    public static boolean intArraySorted(int[] arr) {
    	boolean acendingOrder = true;
        for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i<j) {
					if(arr[i]>arr[j]) {
						acendingOrder = false;
					}
				} else if(i>j) {
					if(arr[i]<arr[j]) {
						acendingOrder = false;
					}
				}
			}
		}
        return acendingOrder;
    }
}
