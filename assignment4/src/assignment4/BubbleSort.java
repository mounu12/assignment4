package assignment4;

public class BubbleSort {

	/*public static void main(String[] args) {
		int array[]={2,6,4,7,9,5,1,6,15,11,10};
		System.out.println(bubbleSorting(array));
		
	}
*/
	public static String bubbleSorting(int[] array) {
		 int count=0;
		 String Result="";
		 for(int i=0;i<array.length;i++)
		 {   
			 for(int j=0;j<array.length-1;j++){
				 if(array[j]>array[j+1]){
					 array[j]=array[j]+array[j+1];
					 array[j+1]=array[j]-array[j+1];
					 array[j]=array[j]-array[j+1];
					 count ++;
				 }
			 }
				 if(count==0)
					 break;
			 
		 }
		 for(int k:array){
			Result+=k+" ";
		 }
		return Result;
	}
   
}
