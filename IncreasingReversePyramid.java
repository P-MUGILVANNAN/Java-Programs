class IncreasingReversePyramid 

{
    public static void main(String[] args) 
    {
        
        int n=8;
       
        for (int i = 1; i <= n; i++) 
        {
            int count=1;
            for (int j = 1; j <= n; j++) 
            {
                if(i<=j-1&&i+j<=n+1)
                {
                    System.out.print(count+++" ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            
            System.out.println();
        }
     
    }
}
