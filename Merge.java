public class Merge extends AbstractSorter {
	public void sort(int[] data) {
		mergesort(data, 0, data.length-1);
	}

	void mergesort(int[] data, int first, int last) {
		int mid;
		if (first < last) {
			mid = (first+last)/2;
			mergesort(data, first, mid);
			mergesort(data, mid+1, last);
			merge(data, first, last);
		}
		p(data);
	}

	void merge(int[] data, int first, int last) {
		int[] tmp = new int[data.length];
		int mid = (first+last)/2;
		int i1=0, i2=first, i3=mid+1;
		while (i2 <= mid && i3 <= last) {
			if (data[i2] < data[i3]) {
				tmp[i1++] = data[i2++];
			} else {
				tmp[i1++] = data[i3++];
			}
		}
		// if one sub-array still has elements in, load that into tmp
		while (i2 <= mid) {
			tmp[i1++] = data[i2++];
		}
		while (i3 <= last) {
			tmp[i1++] = data[i3++];
		}

		// load only the changed values of tmp into data
		for (i1=0, i2=first; i2<=last; i1++, i2++) {
			data[i2] = tmp[i1];
		}
	}
}