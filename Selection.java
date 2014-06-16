public class Selection extends AbstractSorter {
	public void sort(int[] data) {
		int i, j, least;
		for (i=0; i<data.length-1; i++) {
			for(j=i+1, least=i; j<data.length; j++) {
				if (data[j] < data[least]) {
					least=j;
				}
			}
			if (i!=least) {
				swap(data, least, i);
			}
			p(data);
		}
	}
}