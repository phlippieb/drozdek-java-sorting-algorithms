public class Main {
	public static void main(String[] args) {
		
		/*
		 * The sorter to use can be changed by changing the class below: */
		Sorter s = new Counting();

		// other stuff...
		int[] a = {21055, 6, 47, 5, 12345, 11, 80, 100, 3, 2};
		s.sort(a);

		if (!isSorted(a)) {
			System.out.println("Sorter failed!");
		}

	}

	static void p(int[] a) {
		System.out.print('[');
		int i;
		for (i=0; i<a.length-1; i++)
			System.out.print(a[i]+",");
		System.out.println(a[i]+"]");
	}

	static boolean isSorted(int[] data) {
		for (int i=0; i<data.length-2; i++) {
			if (data[i] > data[i+1]) {
				return false;
			}
		}
		return true;
 	}
}