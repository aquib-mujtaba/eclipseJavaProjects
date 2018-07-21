
public class Arrary {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 4, 6, 5, 3, 4, 1, 4, 2 };
		display(arr);
		int na[] = getUnique(arr);
		System.out.println("Unique");
		display(na);
	}

	private static int[] getUnique(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = arr[n - 1];
					n--;
					j--;
				}
			}
		}
		int na[] = new int[n];
		for (int i = 0; i < n; i++) {
			na[i] = arr[i];
		}
		return na;
	}

	private static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}

	}

}
