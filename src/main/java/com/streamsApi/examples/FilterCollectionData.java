package com.streamsApi.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterCollectionData {

	public static void main(String[] args) {

		List<Integer> inputList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//		List<Integer> outputList = new ArrayList<Integer>();
//
//		for (int value : inputList) {
//			if (value % 2 != 0) {
//				outputList.add(value);
//			}
//		}		
		
		List<Integer> outputList = inputList.stream().filter(value ->  value % 2 != 0).collect(Collectors.toList());
		System.out.println(outputList);

	}

}
