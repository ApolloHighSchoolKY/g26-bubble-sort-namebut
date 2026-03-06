public class BubbleSort
{

	public static void main(String[] args)
  	{
    	int[] myNums = {12, 15, 0, 44, 13, 1, 2};
		int passes;
		int comparisons;
		int tempNum;
		//Loop once for each pass, where passes is one less than the number of items.
		passes = (myNums.length - 1);
		for(int i = 1; i <= passes; i++)
		{
			//Loop once for each comparison, where comparisons are one less than the number of unsorted.
			comparisons = (myNums.length - i);
			for(int x = 0; x < comparisons; x++)
			{
				//If they are out of order, swap the values
				if(myNums[x] > myNums[x+1])
				{
					tempNum = myNums[x];
					myNums[x] = myNums[x+1];
					myNums[x+1] = tempNum;
				}
			}
			//The next pass will use one less comparison
		}
  }
}
