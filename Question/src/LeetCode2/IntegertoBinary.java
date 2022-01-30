package LeetCode2;


public class IntegertoBinary {

	public static void main(String arg[]) {
		int num = 25;
		System.out.println();
		System.out.println(findComplement(num));
		System.out.println();
		System.out.println(Integer.toBinaryString(num));
		
		System.out.println(Integer.toBinaryString(6));

	}

	public static int findComplement(int num) {
		int arr[] = new int[20];
		int idx = 0;
		while (num > 0) {

			arr[idx] = num % 2;
			idx++;
			num = num / 2;
		}
		for (int i = idx - 1; i >= 0; i--) {

			System.out.print(arr[i]);
		}
		
		System.out.println();
		/*--------------------------------*/

		for (int i = 0; i < idx; i++) {

			if (arr[i] == 0) {
				arr[i] = 1;
			} else {
				arr[i] = 0;
			}
		}
		System.out.println();
		
		for (int i = idx - 1; i >= 0; i--) {

			System.out.print(":"+arr[i]);
		}
		/*--------------------------------*/
        double sum=0;
        int id=0;
        
        System.out.println();
        for (int i =0; i <idx; i++) {

			System.out.print(":"+arr[i]);
		}
        System.out.println();
        System.out.println("idx: "+idx);
		System.out.println(arr[3]);
		 for (int i =0; i <idx; i++) {

			System.out.print("arr[i] "+arr[i]+"i "+i);
			sum=sum+(Math.pow(2, id))*arr[i];
			System.out.println("sum"+sum);
			id++;
		}
		
		return (int )sum;

	}
}
