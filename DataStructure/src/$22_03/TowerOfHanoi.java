package $22_03;

public class TowerOfHanoi {
	public static void main(String[] args) {
		towerOfHanoi(3, 's', 't', 'd');

	}

	private static void towerOfHanoi(int n, char src, char tem, char dst) {
		if (n == 1) {
			System.out.println("Move " + n + " Disk from " + src + " To " + dst);
			return;
		}
		towerOfHanoi(n - 1, src, dst, tem);
		System.out.println("Move " + n + " Disk from " + src + " To " + dst);
		towerOfHanoi(n - 1, tem, src, dst);
	}

}
