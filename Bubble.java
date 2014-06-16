public class Bubble extends AbstractSorter {
	public void sort(int[] data) {
		for (int i=0; i<data.length-1; i++) {
			for (int j=data.length-1; j>i; j--) {
				if(data[j] < data[j-1]) {
					swap(data, j, j-1);
				}
			}
			p(data);
		}
	}
}