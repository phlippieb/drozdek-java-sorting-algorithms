public class Heap extends AbstractSorter {
	public void sort(int[] data) {
		System.out.println("Transform data to heap:");
		for (int i=data.length/2 -1; i>=0; --i) {
			moveDown(data, i, data.length-1);
			p(data);
		}
		System.out.println("Heapsort:");
		for (int i=data.length-1; i>=1; --i) {
			swap(data, 0, i);
			moveDown(data, 0, i-1);
			p(data);
		}
	}

	void moveDown(int[] data, int first, int last) {
		int largest = 2*first + 1;
		while (largest <= last) {
			if (largest < last && data[largest] < data[largest+1]) {
				largest++;
			}
			if (data[first] < data[largest]) {
				swap(data, first, largest);
				first = largest;
				largest = 2*first +1;
			}
			else largest = last + 1;
		}
	}
}