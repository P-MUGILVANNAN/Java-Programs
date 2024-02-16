class DivideStringNParts
{
    public static void main(String[] args) 
    {
        String s="jagadish";
        int size=s.length();
        int n=4;
        int temp=0;
        int chars=size/n;
        String equalStr[]=new String[n];
        if(size%n!=0)
        {
            System.out.println("String cannot be divide");
        }
        else
        {
            for(int i=0;i<size;i=i+chars)
            {
                String part=s.substring(i,i+chars);
                equalStr[temp]=part;
                temp++;
            }
            for(int i=0;i<equalStr.length;i++)
            {
                System.out.println(equalStr[i]);
            }
        }
    }
}