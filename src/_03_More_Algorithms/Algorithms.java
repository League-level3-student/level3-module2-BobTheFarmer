package _03_More_Algorithms;

import java.util.ArrayList;
import java.util.List;

/*
 * Write your methods in this class
 */

//WORKING ON THIS LINE 100, ASK TEACHER ABOUT ERROR

public class Algorithms {
    
    public static String multiply(int num1, int num2) {
        int anwser = num1*num2;
        return num1 + " x " + num2 + " = " + anwser;
    }
    
    public static int findBrokenEgg(List<String> eggs) {
        for (int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i) == "cracked") {
				return i;
			}
		}
		return -1;
    }

	public static boolean isPrime(int num) {
		for(int i = 2; i<num; i++) {
			for(int e = 2; e<num; e++) {
				if(e*i==num) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean isSquare(int num) {
		for(int i = 0; i<num; i++) {
			int wholeNum = (int) Math.sqrt(num);
			double doubleNum = Math.sqrt(num);
			if(wholeNum == doubleNum) {
				return true;
			}
		}
		return false;
	}

	public static boolean isCube(int num) {
		for(int i = 0; i<num; i++) {
			int wholeNum = (int) Math.cbrt(num);
			double doubleNum = Math.cbrt(num);
			if(wholeNum == doubleNum) {
				return true;
			}
		}
		return false;
	}

	public static int countPearls(List<Boolean> oysters) {
		int pearlCount = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if(oysters.get(i)) {
				pearlCount++;
			}
		}
		return pearlCount;
	}

	public static double findTallest(List<Double> peeps) {
		double currentTallest = 0;
		for (int i = 0; i < peeps.size(); i++) {
			if(peeps.get(i)>currentTallest) {
				currentTallest = peeps.get(i);
			}
		}
		return currentTallest;
	}

	public static Object findLongestWord(List<String> words) {
		int currentLongest = 0;
		for (int i = 0; i < words.size(); i++) {
			if(words.get(i).length()>words.get(currentLongest).length()) {
				currentLongest = i;
			}
		}
		return words.get(currentLongest);
	}

	public static Object containsSOS(List<String> message) {
		for (int i = 0; i < message.size(); i++) {
			if(message.get(i).contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results2) {
		List<Double> results = new ArrayList<Double>();
		results = results2;
		
		List<Double> sortedResults = new ArrayList<Double>();
		for (int i = results.size(); i > 0; i--) {
			int lowestResult = 0;
			for (int j = 0; j < results.size(); j++) {
				if(results.get(j)<=results.get(lowestResult)) {
					lowestResult = j;
				}
			}
		
			sortedResults.add(results.get(lowestResult));
			results.remove(lowestResult);
		}
		System.out.println(sortedResults);
			return sortedResults;
		
	}

//	public static Object sortDNA(List<String> unsortedSequences) {
//		int currentShortest = 0;
//		for (int i = 0; i < unsortedSequences.size(); i++) {
//			if(unsortedSequences.get(i).length()>unsortedSequences.get(currentShortest).length()) {
//				currentShortest = i;
//			}
//		}
//		return unsortedSequences.get(currentShortest);
//		
//	 
}
