package sortdemo;

import java.util.ArrayList;
import java.util.Collections;

public class SortDemo {
	public static void main(String[] args) {

		ArrayList<Name> names = new ArrayList<Name>();
		names.add(new Name("bob", "smith", "222"));
		names.add(new Name("fred", "jones", "233"));
		names.add(new Name("alan", "kostrick", "333"));
		names.add(new Name("zach", "billiams", "423"));

		CompareFirst firstName = new CompareFirst();
		CompareLast lastName = new CompareLast();
		CompareNum numEmply = new CompareNum();
		Collections.sort(names, firstName);

		System.out.println(names);

		Collections.sort(names, lastName);

		System.out.println(names);

		Collections.sort(names,numEmply);

		System.out.println(names);

	}
}
