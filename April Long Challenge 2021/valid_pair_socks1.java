
public class Solution {
	

	public void solveAPair(int[] arr)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
		}
		if(count>0)
		{
			System.out.println("YES");
		}
		else
			System.out.println("NO");
	}
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		int[] arr = new int[3];
		for(int i=0;i<3;i++)
		{
			int n = s.nextInt();
			if(n>=1 && n<=10)
			{
				arr[i]=n;
			}
			else
			{
				System.out.println("System Exiting");
				System.exit(0);
			}
				
				
		}
		
		Solution s1 = new Solution();
		s1.solveAPair(arr);
		
	}
}