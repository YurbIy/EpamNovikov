package HW170811;

import java.util.*;

public class SearchTimeComputation {

	public static void main(String[] args) {

		TimeComputer[] tc = {
				new TimeComputer(new LinkedList<>()),
				new TimeComputer(new ArrayList<>()),
				new TimeComputer(new TreeSet<>())
			};

		for (TimeComputer t : tc) {
			t.fulfil();
			t.sort();
			t.search();

			System.out.println(t.toString());
			System.out.println();
		}
	}
}

