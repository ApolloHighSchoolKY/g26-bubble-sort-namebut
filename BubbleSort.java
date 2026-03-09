import java.util.Arrays;

public class BubbleSort
{
	public static void main(String[] args)
  	{
    	int[] unsorted = {12, 15, 0, 44, 13, 1, 2};
		int[] sorted;
		
		System.out.println(Arrays.toString(unsorted));
		sorted = SortTheBubble(unsorted);
		System.out.println(Arrays.toString(sorted));
  }

  	public static int[] SortTheBubble(int[] unsorted)
	{
		int[] sorted = unsorted;
		
		int passes;
		int comparisons;
		int tempNum;
		//Loop once for each pass, where passes is one less than the number of items.
		passes = (sorted.length - 1);
		for(int i = 1; i <= passes; i++)
		{
			//Loop once for each comparison, where comparisons are one less than the number of unsorted.
			comparisons = (sorted.length - i);
			for(int x = 0; x < comparisons; x++)
			{
				//If they are out of order, swap the values
				if(sorted[x] > sorted[x+1])
				{
					tempNum = sorted[x];
					sorted[x] = sorted[x+1];
					sorted[x+1] = tempNum;
				}
			}
			
		}
		return sorted;
	}
}
