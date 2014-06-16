import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Radix extends AbstractSorter {
	int radix = 10;
	int digits = 10;

	public void sort(int[] data) {
		int d, j, k, factor;
		Queue<Integer>[] queues = new Queue[radix];
		for (d=0; d<radix; d++) {
			queues[d] = new LinkedBlockingQueue<>();
		}
		for (d=1, factor=1; d<=digits; factor *= radix, d++) {
			for (j=0; j<radix; j++) {
				queues[(data[j] / factor) % radix].add(data[j]);
			}
			for (j=k=0; j<radix; j++) {
				while (!queues[j].isEmpty()) {
					data[k++] = ((Integer)queues[j].remove());
				}
			}
			p(data);
		}
	}
}