
public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {20, 35, -15, 7, 55, 1, -22};
		for(int lastUnsortedIndex=arr.length-1;lastUnsortedIndex>0;lastUnsortedIndex--) {
			int highestIndex = 0;
//			here below we need <= not only < as bubble sort, because in bubble sort we will compare i and i+1, not like here
			for(int i=1;i<=lastUnsortedIndex;i++) {
				if(arr[highestIndex] < arr[i]) {
					highestIndex = i;
				}
			}
			swapItems(arr, highestIndex, lastUnsortedIndex);
		}
		for(int l=0;l<arr.length;l++) {
			System.out.print("\t"+arr[l]);
		}
		
	}
	public static void swapItems(int[] arr,int i ,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
