package _03_More_Algorithms;

import java.util.ArrayList;
import java.util.List;

/*
 * Write your methods in this class
 */


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

	public static List<Double> sortScores(List<Double> words) {
		/*List<Double> results = new ArrayList<Double>();
		results = results2;
		
		List<Double> sortedResults = new ArrayList<Double>();
		List<Integer> usedIndexes = new ArrayList<Integer>();
		for (int i = results.size(); i > 0; i--) {
			int lowestResult = 0;
			for (int j = 0; j < results.size(); j++) {
				if(results.get(j)<results.get(lowestResult)  && !usedIndexes.contains(j)) {
					lowestResult = j;
				}
			}
		
			sortedResults.add(results.get(lowestResult));
			usedIndexes.add(lowestResult);
		}
		System.out.println(sortedResults);
			return sortedResults;*/
		
			
//			List<Double> sortedSequences = new ArrayList<Double>();
//			List<Double> usedValues = new ArrayList<Double>();
//			for (int i = unsortedSequences.size(); i > 0; i--) {
//				int indexOfShortest = 0;
//				for (int j = 0; j < unsortedSequences.size(); j++) {
//					if(unsortedSequences.get(j) < unsortedSequences.get(indexOfShortest) && !usedValues.contains(unsortedSequences.get(j))) {
//						
//						indexOfShortest = j;
//					}
//				}
//				sortedSequences.add(unsortedSequences.get(indexOfShortest));
//				//System.out.println(indexOfShortest);
//				usedValues.add(unsortedSequences.get(indexOfShortest));
//			}
//			//System.out.println(sortedSequences);
//			return sortedSequences;
			
			for (int i = 0; i < words.size(); i++) {
				//Put best word at i index
				int indexOfBestWord = words.size()-1;
				
				for (int j = i; j < words.size(); j++) {
					if(words.get(j).compareTo(words.get(indexOfBestWord)) < 0) {
						indexOfBestWord = j;
					}
					
				}
				Double temp = words.get(i);
				words.set(i, words.get(indexOfBestWord));
				words.set(indexOfBestWord, temp);
			}
			System.out.println(words);
			return words;
	}

	public static Object sortDNA(List<String> unsortedSequences) {
		List<String> sortedSequences = new ArrayList<String>();
		List<Integer> usedIndexes = new ArrayList<Integer>();
		for (int i = unsortedSequences.size(); i > 0; i--) {
			int indexOfShortest = 0;
			for (int j = 0; j < unsortedSequences.size(); j++) {
				if(unsortedSequences.get(j).length() < unsortedSequences.get(indexOfShortest).length() && !usedIndexes.contains(j)) {
					indexOfShortest = j;
				}
			}
			sortedSequences.add(unsortedSequences.get(indexOfShortest));
			usedIndexes.add(indexOfShortest);
		}
		return sortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		for (int i = 0; i < words.size(); i++) {
			//Put best word at i index
			int indexOfBestWord = words.size()-1;
			
			for (int j = i; j < words.size(); j++) {
				if(words.get(j).compareTo(words.get(indexOfBestWord)) < 0) {
					indexOfBestWord = j;
				}
				
			}
			String temp = words.get(i);
			words.set(i, words.get(indexOfBestWord));
			words.set(indexOfBestWord, temp);
		}
		System.out.println(words);
		return words;
	}	 
}
