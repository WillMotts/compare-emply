package sortdemo;

public class Name {

	private String fName;
	private String lName;
	private String numEmply;

	public Name(String fName, String lName, String numEmply) {
		this.fName = fName;
		this.lName = lName;
		this.numEmply = numEmply;
	}

	public String getFName() {
		return fName;
	}

	public String getLName() {
		return lName;
	}

	public String getNumEmploy() {
		return numEmply;
	}

	@Override
	public String toString() {
		return fName + " " + lName + " " + numEmply;
	}

}
