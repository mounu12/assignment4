package assignment4;

public class InsertionSort {

	public static String sorting(int[] array)

	{
		String s = "";
		int N = array.length;
		int i, j, temp;
		for (i = 1; i < N; i++) {
			j = i;
			temp = array[i];
			while (j > 0 && temp < array[j - 1]) {
				array[j] = array[j - 1];
				j = j - 1;
			}
			array[j] = temp;
		}
		for (i = 0; i < N; i++) {
		//sorting(array);
			s = s + array[i];
		}
		System.out.println(s);
		return s;

	}
}
