public class CoinChangingMinimumCoins {
    long[] ans;
    long getChanges(long[] coins,long total)
    {
         ans=new long[coins.length];
         getChangesHelper(coins,total);
         return 1;
    }

    private void getChangesHelper(long[] coins, long total) {
        long temp[][] = new long[coins.length+1][(int)total+1];
        for(int i=0;i<coins.length+1;i++)
        temp[i][0]=1;

        for(int i=1;i<coins.length+1;i++)
        {
            for(int j=1;j<total+1;j++)
            {
                if(coins[i-1]>j)
                {
                    
                }
                else
                {
                    temp[i][j]=temp[i][j-(int)coins[i-1]]+temp[i-1][j];
                }
            }
        }
    }

}
