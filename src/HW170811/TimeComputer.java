package HW170811;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by Yurbly on 13.08.2017.
 */
class TimeComputer {

	String name;
	private Collection<A> collection;

	private long fulfilmentTime;
	private long sortTime;
	private long searchTime;


	TimeComputer(Collection<A> collection){

		this.collection = collection;
	}


	public void fulfil() {
		long start = System.currentTimeMillis();

		for (int i = 0; i < 1_000_000; i++) {
			this.collection.add(new A());
		}

		long end = System.currentTimeMillis();

		this.fulfilmentTime = end - start;
	}

	public void sort() {
		if(!(this.collection instanceof List)){
			sortTime = 0;
			return;
		}
		long start = System.currentTimeMillis();

		Collections.sort((List<A>) this.collection);

		long end = System.currentTimeMillis();

		sortTime = end - start;
	}

	public void search() {
		A a = new A();
		if(collection instanceof TreeSet){
			long start = System.currentTimeMillis();
			boolean b = collection.contains(a);
			long end = System.currentTimeMillis();
			this.searchTime = end - start;
			return;
		}
		long start = System.currentTimeMillis();
		Collections.binarySearch((List<A>) collection, a);
		long end = System.currentTimeMillis();
		this.searchTime =  end - start;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(collection.getClass().getSimpleName());
		sb.append("\n").append("Fulfilment time : ").append(Long.toString(fulfilmentTime)).append("\n").
		append("Sort time : ").append(Long.toString(sortTime)).append("\n").
		append("Search time: ").append(searchTime).append("\n").
		append("Full time: ").append(Long.toString(fulfilmentTime + sortTime + searchTime));
		return sb.toString();
	}
}
