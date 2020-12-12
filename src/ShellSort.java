
public class ShellSort {
	public static void main(String[] args) {
		int[] arr = {20, 35, -15, 7, 55, 1, -22};
		for(int gap=arr.length/2;gap>0;gap=gap/2) {
			for(int i=gap;i<arr.length;i++) {
				int newElement = arr[i];
				int j;
				for(j=i;j>=gap && arr[j-gap]>newElement;j-=gap) {
					arr[j] = arr[j-gap];
				}
				arr[j]=newElement;
			}
		}
		for(int l=0;l<arr.length;l++) {
			System.out.print("\t"+arr[l]);
		}
	}
}
