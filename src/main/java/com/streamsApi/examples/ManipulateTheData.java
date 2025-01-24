package com.streamsApi.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManipulateTheData {

	public static void main(String[] args) {
		
		List<Integer> inputList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
//		List<Integer> outputSquareList = new ArrayList<Integer>();
//		
//		for(int val : inputList) {
//			outputSquareList.add(val * val);
//		}
		
		List<Integer> outputSquareList = inputList.stream().map( val -> val*val).collect(Collectors.toList());
		System.out.println(outputSquareList);
	}

}
