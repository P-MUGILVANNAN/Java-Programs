class SeriesGenerator 
{
    public static void main(String[] args) 
    {
        int num = 1;
        System.out.print(num + " "); // print the first number in the series

        for (int i = 1; i <= 5; i++) 
        {
            num = num * 2 + 1; // generate the next number in the series
            System.out.print(num + " "); // print the next number in the series
        }
    }
}
