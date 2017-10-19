package sortdemo;

import java.util.Comparator;

public class CompareNum implements Comparator<Name> {
	public int compare(Name three, Name another) {
		return three.getNumEmploy().compareTo(another.getNumEmploy());

	}
}
