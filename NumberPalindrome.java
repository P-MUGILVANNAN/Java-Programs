class NumberPalindrome
{
    public static void main(String args[])
    {
        int n=18181,rev=0,i,rem;
        i=n;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(i==rev)
        {
            System.out.println("It is a palindrome");
        }
        else
        {
            System.out.println("It is not a palindrome");
        }
    }
}