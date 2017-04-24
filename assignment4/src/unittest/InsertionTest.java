package unittest;

import static org.junit.Assert.*;

import org.junit.Test;

import assignment4.InsertionSort;

public class InsertionTest {

	static InsertionSort insertionSort = null;

	@Test
	public void insertion_test() {
		int arr[] = new int[]{2,5,4,5,6};
	InsertionSort sort=new InsertionSort();
		String result=sort.sorting(arr);
		assertEquals("24556", result);
		
		
		//int array[]={2,6,4,7,9,5,1,6,15,11,10};
		//assertEquals("1 2 4 5 6 6 7 9 10 11 15" ,InsertionSort.sorting(array));
	}
}