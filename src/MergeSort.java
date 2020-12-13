
public class MergeSort {
	public static void main(String[] args) {
		int[] arr = { 20, 35, -15, 7, 55, 1, -22 };
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
//	{ 20, 35, -15, 7, 55, 1, -22 }
	public static void mergeSort(int[] input, int start, int end) {
		if(end-start < 2) {
			return;
		}
		int mid = (start+end)/2;
		mergeSort(input, start, mid);
		mergeSort(input, mid, end);
		merge(input, start, mid, end);
	}
private static void merge(int[] input, int start, int mid, int end) {
	// TODO Auto-generated method stub
	
}
}
