
public class QuickSort {
	public static void main(String[] args) {
		int[] arr = {20, 35, -15, 7, 55, 1, -22};
		quickSort(arr, 0, arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

	private static void quickSort(int[] arr, int start, int end) {
		if(end-start<2) {
			return;
		}
		int pivotIndex = findPivot(arr, start, end);
		quickSort(arr, start, pivotIndex);
		quickSort(arr, pivotIndex+1, end);
	}

	private static int findPivot(int[] arr, int start, int end) {
		int pivotValue = arr[start];
		int i =start;
		int j = end;
		while(i<j) {
			while(i<j && arr[--j]>=pivotValue) {
				
			}
			if(i<j) {
				arr[i] = arr[j];
			}
			while(i<j && arr[++i]<=pivotValue) {
				
			}
			arr[j] = arr[i];
		}
		arr[j] = pivotValue;
		return j;
	}
}























