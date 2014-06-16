public abstract class AbstractSorter implements Sorter {
	void p(int[] a) {
		System.out.print('[');
		int i;
		for (i=0; i<a.length-1; i++)
			System.out.print(a[i]+",");
		System.out.println(a[i]+"]");
	}

	void swap(int[] data, int l, int r) {
		int tmp = data[l];
		data[l] = data[r];
		data[r] = tmp;
	}
}