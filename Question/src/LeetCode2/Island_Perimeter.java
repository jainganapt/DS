package LeetCode2;


public class Island_Perimeter {

	public static void main(String arg[]) {
		int arr[][] = { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 0 } };

		System.out.println(islandPerimeter(arr));
	}

	public static int islandPerimeter(int[][] grid) {

		int peri = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {

				if (grid[i][j] == 1) {
					peri = peri + 4;

					if (i >= 0 && j >= 0) {
						if ((i - 1) >= 0 && grid[i - 1][j] == 1) {
							peri = peri - 1;
						}
						if ((i + 1) < grid.length && grid[i + 1][j] == 1) {
							peri = peri - 1;
						}
						if ((j - 1) >= 0 && grid[i][j - 1] == 1) {
							peri = peri - 1;
						}
						if ((j + 1) < grid[i].length && grid[i][j + 1] == 1) {
							peri = peri - 1;
						}
					}
				}

				//System.out.println("permi" + peri);
			}
		}

		return peri;

	}
}
