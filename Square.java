class SquareCount 
{
    static int square(int n)
    {

        int count=0;
        for(int i=1;i<=n;i++)
        {
            count+=i*i;
        }
        return count;
    }
    public static void main(String args[])
    {
        int n=5;
        System.out.println(square(n));
    }
}
