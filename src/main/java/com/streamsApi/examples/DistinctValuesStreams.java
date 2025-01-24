package com.streamsApi.examples;

import java.util.List;
import java.util.stream.Collectors;

public class DistinctValuesStreams {

	public static void main(String[] args) {
		List<Integer> inputList = List.of(1, 2, 2, 4, 4, 6, 7, 7, 9, 10);
		
		List<Integer> outputList = inputList.stream().distinct().collect(Collectors.toList());
		
		System.out.println(outputList);

	}

}
