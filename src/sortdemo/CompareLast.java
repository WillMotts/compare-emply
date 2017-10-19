package sortdemo;

import java.util.Comparator;

class CompareLast implements Comparator<Name> {
	public int compare(Name two, Name another) {
		return two.getLName().compareTo(another.getLName());

	}
}
