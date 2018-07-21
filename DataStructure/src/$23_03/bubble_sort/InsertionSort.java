package $23_03.bubble_sort;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[] = { 28, 18, 56, 17, 32, 19 };
		insertionSort(arr);
		display(arr);
	}

	static void insertionSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int ele = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > ele) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = ele;
		}
	}

	static void display(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
