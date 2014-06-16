public class Counting extends AbstractSorter {
	public void sort(int[] data) {
		int i, largest=data[0], n=data.length;
		int[] tmp = new int[n];
		for(i=1; i<n; i++) {
			if(largest<data[i]) {
				largest=data[i];
			}
		}
		int[] count = new int[largest+1];
		for(i=0; i<=largest; i++) {
			count[i]=0;
		}
		for(i=0; i<n; i++) {
			count[data[i]]++;
		}
		for(i=1; i<=largest; i++) {
			count[i] = count[i-1] + count[i];
		}
		for (i=n-1; i>=0; i--) {
			tmp[count[data[i]]-1] = data[i];
			count[data[i]]--;
			p(tmp);
		}
		for (i=0; i<n; i++) {
			data[i] = tmp[i];
		}
	}
}