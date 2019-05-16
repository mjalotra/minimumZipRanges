package nisumTask.helper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import nisumTask.comparator.RangeComparator;
import nisumTask.vo.ZipRange;

public class MinRangesHelper {
	
	public static List<ZipRange> minRanges(List<ZipRange> rangeList){
		if(rangeList == null || rangeList.size() == 0)
			return rangeList;
 
		Collections.sort(rangeList, new RangeComparator());
		List<ZipRange> minRangeList = new ArrayList<ZipRange>();
		ZipRange firstRange = rangeList.get(0);
 
		for(int i = 1; i < rangeList.size(); i++){
			ZipRange currRange = rangeList.get(i);
 
			if(firstRange.getTo() >= currRange.getFrom()){
				ZipRange merged = new ZipRange(firstRange.getFrom(), Math.max(firstRange.getTo(), currRange.getTo()));
				firstRange = merged;
			}else {
				minRangeList.add(firstRange);
				firstRange = currRange;
			}
		}
		minRangeList.add(firstRange);
		return minRangeList;
	}
}
