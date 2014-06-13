public class Insertion extends AbstractSorter {
	public void sort(int[] data) {
		for (int i=1, j; i<data.length; i++) {
			int tmp=data[i];
			for(j=i; j>0 && tmp<data[j-1]; j--) {
				data[j] = data[j-1];
			}
			data[j]=tmp;
			p(data);
		}
	}
}