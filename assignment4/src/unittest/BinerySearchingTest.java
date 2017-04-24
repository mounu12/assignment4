package unittest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import assignment4.BinarySearch;

public class BinerySearchingTest {
	BinarySearch binerySearching=null;
	@Before
	public void setUp() throws Exception {
		BinarySearch bs=new BinarySearch();
	}

	@Test
	public void binerySearching_test() {
		int array[]={2,6,4,7,9,5,1,6,15,11,10};
		assertEquals(4,binerySearching.BinerySearch(array,15));
	}
}

/*
	@Test
	public void binerySearching_nottest() {
		int array[]={2,6,4,7,9,5,1,6,15,11,10};
		assertEquals(-1,binerySearching.binerySearch(array,25));
	}
}
*/