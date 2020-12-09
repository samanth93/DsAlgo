
public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {20, 35, -15, 7, 55, 1, -22};
		for(int firstUnsortedIndex = 1;firstUnsortedIndex<arr.length;firstUnsortedIndex++) {
			int newElement = arr[firstUnsortedIndex];
			int insertionPoint;
			for(insertionPoint =firstUnsortedIndex;insertionPoint>0 && arr[insertionPoint-1]>newElement;insertionPoint--) {
				arr[insertionPoint] = arr[insertionPoint-1];
			}
			arr[insertionPoint] = newElement;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
}
