class Armstrong
{
    public static void main (String args[])
    {
        int n=153,arm=0,rem;
        int num=n;
        while(n>0)
        {
            rem=n%10;
            rem=(int)Math.pow(rem, 3);
            arm=arm+rem;
            // arm=rem*rem*rem + arm;
            n=n/10;
        }
        if(arm==num)
        {
            System.out.println("This is Armstrong number");
        }
        else
        {
            System.out.println("This is not Armstrong number");
        }
    }
}