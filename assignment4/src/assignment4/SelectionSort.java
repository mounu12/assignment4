package assignment4;

public class SelectionSort {

	public static void main(String[] args) {
		int array[]={2,6,4,7,9,5,1,6,15,11,10};
		System.out.println(selectionSorting(array));


	}

	public static String selectionSorting(int[] array) {

		String Result="";

		int j;
		for(int i=0;i<array.length-1;i++){
			int minindex = i;
			for ( j = i + 1; j < array.length; j++)
				if (array[j] < array[minindex]){
					minindex = j;
				}
			int smallerNumber = array[minindex]; 
			array[minindex] = array[i];
			array[i] = smallerNumber;

		}
		for(int k:array){
			Result+=k+" ";
		}
		System.out.println(Result);
		return Result;
	}

}
