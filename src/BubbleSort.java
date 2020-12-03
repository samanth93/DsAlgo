
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {20, 35, -15, 7, 55, 1, -22};
		int unSortedPartionIndex = arr.length;
		for(int k=unSortedPartionIndex;k>-1;k--) {
			for(int i=0;i<k-1;i++) {
				swapValues(arr, i, i+1);
			}	
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print("\t"+arr[i]);
		}
	}
	public static void swapValues(int[] arr, int i, int j) {
		if(arr[i]>arr[j]) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;	
		}
	}
}
