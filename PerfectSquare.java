class PerfectSquare
{
    public static void main(String[] args) 
    {
        int n=36;
        int a=(int) Math.sqrt(n);
        if(a*a==n)
        {
            System.out.println(n +" is a perfect square");
        }
        else
        {
            System.out.println(n +" is not a perfect square");
        }
    }
}