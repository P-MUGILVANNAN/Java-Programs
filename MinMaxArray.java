class MinMaxArray
{
    public static void main(String[] args)
    {
        int arr[]={22,242,24,5,46,6};
        int min=arr[0]; //Assumption
        int max=arr[0]; //Assumption
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Minimum number " + min);
        System.out.println("Maximum number " + max);
     
    }
}