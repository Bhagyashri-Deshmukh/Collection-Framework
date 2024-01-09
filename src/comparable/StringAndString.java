package comparable;

public class StringAndString implements Comparable<StringAndString> {

	private String city;
	private String state;
	
	public StringAndString(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}

	@Override
	public int compareTo(StringAndString o) {
		// TODO Auto-generated method stub
		if(this.city.compareTo(o.city)!=0) {
			
			return this.city.compareTo(o.city);
		}
		else {
			return this.state.compareTo(o.state);
		}
	}

	@Override
	public String toString() {
		return "StringAndString [city=" + city + ", state=" + state + "]";
	}
}
