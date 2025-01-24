package com.training.java.assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Assignment8 {

	public static void main(String[] args) {

		Map<String, Double[]> empData = new HashMap<String, Double[]>();
		empData.put("Alice Johnson", new Double[] { 75000.0, 5.0, 4.2 });
		empData.put("Bob Smith", new Double[] { 68000.0, 3.0, 3.8 });
		empData.put("Carol Davis", new Double[] { 82000.0, 7.0, 4.5 });
		empData.put("David Brown", new Double[] { 90000.0, 10.0, 2.0 });
		empData.put("Eva Green", new Double[] { 60000.0, 2.0, 3.5 });

		// Bonus and variable pay data
		int bonusHigh = 1500;
		int bonusMedium = 1200;
		int bonusLow = 300;

		double payHigh = 0.15;
		double payMedium = 0.10;
		double payLow = 0.03;

		int extraReward = 5000;

		Set<String> employees = empData.keySet();

		Map<String, Double> empNameWithHikePercentage = new HashMap<String, Double>();

		for (String emp : employees) {

			double hike = 0;
			double hikePercentage = 0;
			if (empData.get(emp)[2] >= 4) {
				hike = (empData.get(emp)[0] * payHigh) + bonusHigh;
			} else if (empData.get(emp)[2] >= 3 && empData.get(emp)[2] < 4) {
				hike = (empData.get(emp)[0] * payMedium) + bonusMedium;
			} else if (empData.get(emp)[2] < 3) {
				hike = (empData.get(emp)[0] * payLow) + bonusLow;
			}

			if (empData.get(emp)[0] >= 5) {
				hike = hike + extraReward;
			}
			hikePercentage = hike / empData.get(emp)[0];
			empNameWithHikePercentage.put(emp, hikePercentage*100);
		}

		System.out.println(empNameWithHikePercentage);

	}

}
