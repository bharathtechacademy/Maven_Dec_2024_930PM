package assignments;

import java.util.List;
import java.util.Map;

public class ReadExcelAssignment13 {

	public static void main(String[] args) {
		List<Map<String,String>> data = Excel.readAssignmentData("CollectionsAssignment.xlsx", "ProductDetails");
		System.out.println(data);
	}

}
