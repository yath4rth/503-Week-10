import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
//import java.util.LinkedHashSet;

public class MyList2 {
	
	public ArrayList<Double> merge(ArrayList<Double> list1,ArrayList<Double> list2)
		{
		 HashSet<Double> uniqueValues = new HashSet<>();
	        
	        // Add elements from the first list
	        uniqueValues.addAll(list1);
	        
	        // Add elements from the second list
	        uniqueValues.addAll(list2);
	        
	        // Convert the HashSet back to an ArrayList
	        return new ArrayList<>(uniqueValues);
		}
}