package unittest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import assignment4.LinearSearch;

public class LenierSearchTest {
	LinearSearch lenierSearch=null;
	@Before
	public void setUp() throws Exception {
		lenierSearch=new LinearSearch();
	}

	@Test
	public void insertion_test() {
		int array[]={2,4,5,65,8,9,45,8,56};
		assertEquals(6,lenierSearch.searchLenier(array,9));
	}
	@Test
	public void insertion_nottest() {
		int array[]={2,6,4,7,9,5,1,6,15,11,10};
		assertEquals(-1,lenierSearch.searchLenier(array,25));
	}
	
}
