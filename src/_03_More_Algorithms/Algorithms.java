package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */

//WORKING ON THIS, KEEP UNCOMMENTING STUFF FROM SECOND MEATHOD IN PACKAGE, UNCOMMENT W COMMAND / AND USE ERROR TO AUTO MAKE MEATHOD
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
}
