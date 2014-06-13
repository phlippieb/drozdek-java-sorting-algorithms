public class Main {
	public static void main(String[] args) {
		int[] a = {21055, 6, 47, 5, 12345, 11, 80, 100, 3, 2};
		Sorter s = new Insertion();
		s.sort(a);

	}

	static void p(int[] a) {
		System.out.print('[');
		int i;
		for (i=0; i<a.length-1; i++)
			System.out.print(a[i]+",");
		System.out.println(a[i]+"]");
	}
}