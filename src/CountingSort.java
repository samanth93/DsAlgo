
public class CountingSort {
	public static void main(String[] args) {
		int arr[] = {1, 2, 5, 9, 8, 2, 8, 7, 10, 4, 3};
		countingSort(arr, 1, 10);
		for(int i=0;i<arr.length;i++) {
			System.out.print("\t"+arr[i]);
		}		
	}
//	min and max are the respective values in the range
//	here we will be sending 1 and 10 as we have these as possible min and max values
	public static void countingSort(int[] input, int min, int max) {
//		int[] countArray = new int[(max-min)+1];
//		for(int i=0;i<input.length;i++) {
//			countArray[input[i]-min]++;
//		}
//		int j=0;
//		for(int i=min;i<=max;i++) {
//			while(countArray[i-min]>0) {
//				input[j++] = i;
//				countArray[i-min]--;
//			}
//		}
		
		int[] countArray = new int[(max-min)+1];
		for(int i=0;i<input.length;i++) {
			countArray[input[i]-min]++;
		}
		int j=0;
		for(int i=min;i<=max;i++) {
			while(countArray[i-min]>0) {
				input[j++]=i;
				countArray[i-min]--;
			}
		}
	}
}
