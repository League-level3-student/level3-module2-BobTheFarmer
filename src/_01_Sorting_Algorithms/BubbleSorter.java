package _01_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
    public BubbleSorter() {
        type = "Bubble";
    }

    /* 
     * Use the bubble sorting algorithm to sort the array.
     * You can use display.updateDisplay() to show the current
     * progress on the graph.
     */
    @Override
    void sort(int[] array, SortingVisualizer display) {
    		int currentBest;
    		for (int i = 0; i < array.length; i++) {
    			currentBest = 0;
				for (int j = i; j < array.length; j++) {
					if(array[j]>currentBest) {
						int temp = array[j];
						array[j] = currentBest;
						currentBest = temp;
						array[i] = currentBest;
					}
					display.updateDisplay();
					}
				
				
				
			}
    		display.updateDisplay();
    }
}
