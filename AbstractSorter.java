public abstract class AbstractSorter implements Sorter {
	void p(int[] a) {
		System.out.print('[');
		int i;
		for (i=0; i<a.length-1; i++)
			System.out.print(a[i]+",");
		System.out.println(a[i]+"]");
	}
}