class matrix
{
	public static void main(String[] args)
	{
		int[][]  a={{1,10,20},{2,30,40},{3,50,60}};
		int sum1=0;
		int sum2=0;
		int sum3=0;
					int col1=0;
					int col2=0;
					int col3=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
					if(i==0)
						sum1+=a[i][j];
					if(i==1)
						sum2+=a[i][j];
					if(i==2)
						sum3+=a[i][j];
					if(j==0)
						col1+=a[i][j];
					if(j==1)
						col2+=a[i][j];
					if(j==2)
						col3+=a[i][j];
					
			}
			
			System.out.println();
		}
		System.out.println("sum1 of row="+sum1);
		System.out.println("sum2 of row="+sum2);
		System.out.println("sum3 of row="+sum3);
		System.out.println("col0 of col1="+col1);
		System.out.println("col1 of col2="+col2);
		System.out.println("col2 of col3="+col3);
	}
}