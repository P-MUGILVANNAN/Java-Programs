class AlternativePrimeNumber
{
    public static void main(String[] args) 
    {
        int factor=0;
        int count=0;
        for(int num=2;num<=20;num++)
        {
            factor=0;
            for(int i=2;i<num;i++)
            {
                if(num%i==0)
                {
                    factor++;
                    break;
                }
            }
            if(factor==0)
            {
                if(count%2==0)
                System.out.println(num);
                count++;
            }
        }
    }
}