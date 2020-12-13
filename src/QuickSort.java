
public class QuickSort {
	public static void main(String[] args) {
		int[] arr = {20, 35, -15, 7, 55, 1, -22};
		quickSort(arr, 0, arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	public static void quickSort(int[] input, int start, int end) {
//		this means we are dealing with one element array, that means we don't have to do anything
//		just return, and the end index will be one greater
		
		if(end-start<2) {
			return;
		}
		
//		it we return the position of the pivot and at that position the left will be smaller and 
//		right will be larger
		int pivotIndex = partition(input, start, end);
		quickSort(input, start, pivotIndex);
		quickSort(input, pivotIndex+1, end);
	}
	private static int partition(int[] input, int start, int end) {
//		This is using the first element as pivot
		int pivot = input[start];
		int i = start;
		int j = end;
//		because if i>j that means they have crossed
		while(i<j) {
//			--j is a prefix operator that means we will decreament index and then use it
			while(i<j && input[--j]>=pivot) {
				
			}
			if(i<j) {
				input[i]=input[j];
			}
			while(i<j && input[++i]<=pivot) {
				
			}
			if(i<j) {
				input[j] = input[i];
			}
		}
		input[j] = pivot;
		return j;
	}
}
