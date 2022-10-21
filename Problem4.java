package firstroundinterview;

public class Problem4 {
	public static void main(String[] args) {
		int[] a= {1,2,8,9,12,46,76,82,15,20,30};
		for(int k=1;k<=9;k++)
		{
			int count=0;
			for(int i=0;i<a.length ;i++)
			{
				if(a[i]%k==0)
				{
					count++;
				}
			}
			System.out.println(k+":"+count);
		}
	}


}
