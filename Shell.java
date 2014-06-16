public class Shell extends AbstractSorter {
	public void sort(int[] data) {
		int i, j, k, h, hCnt, increments[] = new int[20];
		for (h=1, i=0; h<data.length; i++) {
			increments[i]=h;
			h = 3*h + 1;
		}

		for (i--; i>=0; i--) {
			h = increments[i];
			for (hCnt=h; hCnt<2*h; hCnt++) {
				for( j=hCnt; j<data.length; ) {
					int tmp = data[j];
					k=j;
					while (k-h >= 0 && tmp < data[k-h]) {
						data[k] = data[k-h];
						k -= h;
					}
					data[k] = tmp;
					j += h;
				}
			}
		}
	}
}