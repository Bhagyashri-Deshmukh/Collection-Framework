package comparable;

public class NumbersAndString implements Comparable<NumbersAndString> {

	private int x;
	private String y;	
	
	public NumbersAndString(int x, String y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(NumbersAndString o) {
		// TODO Auto-generated method stub
		
		// if the string are not equal
		if(this.y.compareTo(o.y)!=0) {
			
			return this.y.compareTo(o.y);
		}
		else {
			 // we compare int values
            // if the strings are equal
			return this.x - o.x;
		}
	}

	@Override
	public String toString() {
		return "NumbersAndString [x=" + x + ", y=" + y + "]";
	}
}
