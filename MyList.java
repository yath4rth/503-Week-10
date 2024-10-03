import java.util.ArrayList;
import java.util.Collections;
//import java.util.LinkedHashSet;

public class MyList {
	
	public ArrayList<Double> merge(ArrayList<Double> list1,ArrayList<Double> list2)
		{
			ArrayList<Double> mergedList = new ArrayList<>(list1);
			mergedList.addAll(list2);
			//Collections.sort(mergedList);
			return mergedList;
		}
}