public class Comb extends AbstractSorter {
	public void sort(int[] data) {
		int step = data.length, j, k;
		while ((step = (int)(step/1.3)) >1 ) {
			for (j=data.length-1; j>=step; j--) {
				k = j-step;
				if (data[j] < data[k]) {
					swap(data, j, k);
				}
			}
			p(data);
		}
		boolean again = true;
		for (int i = 0; i < data.length-1 && again; i++) {
			for (j = data.length-1, again=false; j>i; j--) {
				if (data[j] < data[j-1]) {
					swap(data, j, j-1);
					again=true;
				}
			}
			p(data);
		}
	}
}