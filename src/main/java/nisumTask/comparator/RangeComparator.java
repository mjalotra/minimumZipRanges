package nisumTask.comparator;

import java.util.Comparator;

import nisumTask.vo.ZipRange;

public class RangeComparator implements Comparator<ZipRange>
{
 
	@Override
	public int compare(ZipRange rangeObj1, ZipRange rangeObj2) {
		return rangeObj1.getFrom() - rangeObj2.getFrom();
	}
}