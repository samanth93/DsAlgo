
public class ShellSort {
	public static void main(String[] args) {
		int[] arr = {20, 35, -15, 7, 55, 1, -22};
		int gap = arr.length/2;
		while(gap>1) {
			for(int firstUnsortedIndex = gap;firstUnsortedIndex<arr.length;firstUnsortedIndex++) {
				int newElement = arr[firstUnsortedIndex];
				int i;
				for(i=firstUnsortedIndex;i>0 && arr[i-1]>newElement;i++) {
					arr[i] = arr[i-1];
				}
				arr[i]=newElement;
				gap=gap/2;
			}
		}
		for(int firstUnsortedIndex = 1;firstUnsortedIndex<arr.length;firstUnsortedIndex++) {
			int newElement = arr[firstUnsortedIndex];
			int i;
			for(i=firstUnsortedIndex;i>0 && arr[i-1]>newElement;i++) {
				arr[i] = arr[i-1];
			}
			arr[i]=newElement;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
}
