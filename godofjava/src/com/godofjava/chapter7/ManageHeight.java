package com.godofjava.chapter7;

public class ManageHeight {
	public static void main(String[] args) {
		ManageHeight sample = new ManageHeight();
		sample.setData();
		for(int classNo = 1;classNo <= 5; classNo++) {
//			sample.printHeight(classNo);
			sample.printAverage(classNo);
		}
	}
	
	int gradeHeights[][];
	public void setData() {
		gradeHeights = new int [5][];
		gradeHeights[0] = new int []{170, 180, 173, 175, 177};
		gradeHeights[1] = new int []{160, 165, 167, 186};
		gradeHeights[2] = new int []{158, 177, 187, 176};
		gradeHeights[3] = new int []{173, 182, 181};
		gradeHeights[4] = new int []{170, 180, 165, 177, 172};
	}
	public void printHeight(int classNo) {
		System.out.println("Class No." + classNo);
		for(int height:gradeHeights[classNo-1]) {
			System.out.println(height);
		}
	}
	public void printAverage(int classNo) {
		double sum = 0.0;
		double average = 0.0;
		int count = gradeHeights[classNo-1].length;
		System.out.println("Class No." + classNo);
		for(int height:gradeHeights[classNo-1]) {
			sum += height;
		}
		average = sum / count;  
		System.out.println("Height Average: " + average);
	}
}
