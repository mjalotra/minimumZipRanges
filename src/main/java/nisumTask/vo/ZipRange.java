package nisumTask.vo;
public class ZipRange {
	 
	int to;
	int from;
 
	public ZipRange(int from, int to)
	{
		this.from = from;
		this.to = to;
	}
 
	public int getTo() {
		return to;
	}
 
	public void setTo(int to) {
		this.to = to;
	}
 
	public int getFrom() {
		return from;
	}
 
	public void setFrom(int from) {
		this.from = from;
	}
 
	@Override
	public String toString() {
		return "[" + this.from + "," + this.to +  "]";
	}
}