package JavaArray30;

public class DDsprirlPrint {

	public static void main(String arg[]) {

		int a[][] = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 },
				{ 19, 20, 21, 22, 23, 24 }, { 25, 26, 27, 28, 29, 30 }, { 31, 32, 33, 34, 35, 36 } };

		System.out.println("row" + a.length);
		System.out.println("col" + a[0].length);

		spiralPrint(a);

	}

	private static void spiralPrint(int[][] a) {
		
		int r1=0;//stating point
		int r2=a.length;//final point
		
		int c1=0;
        int c2=a[0].length;
        
        int i, j = 0, k = 0;
        
        while(r1<r2 && c1 <c2 )
        {
        	
        	for(i=c1;i<c2;i++)
        	{
        		System.out.print(" "+a[r1][i]);
        	}
        	r1++;
        	
        	for(i=r1;i<r2;i++)
        	{
        		System.out.print(" "+a[i][c2-1]);
        	}
        	c2--;
        	
        	if(r1<r2)
        	{
        		for(i=c2-1;i>=c1;i--)
        		{
        			System.out.print(" "+a[r2-1][i]);
        		}
        		
        		r2--;
        	}
        	
        	if(c1<c2)
        	{
        		for(i=r2-1;i>=r1;i--)
        		{
        			System.out.print(" "+a[i][r2-1]);
        		}
        		
        		c1++;
        	}
        	
        	
        }
		
	}

}
