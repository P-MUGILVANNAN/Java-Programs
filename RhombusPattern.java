class RhombusPattern 
{
    public static void main(String[] args) 
    {
        int n=6;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=2*n-1;j++)
            {
                if(i<=j&&j-i<=n-1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

    