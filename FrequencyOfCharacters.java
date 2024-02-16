class FrequencyOfCharacters
{
    public static void main(String[] args) 
    {
        String s="Mugil vannan";
        int freq[]=new int[s.length()];
        char string[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            freq[i]=1;
            for(int j=i+1;j<s.length();j++)
            {
                if(string[i]==string[j])
                {
                    freq[i]++;
                    string[j]='0';  //to avoid printing visited character
                }
            }
        }
        System.out.println("Frequencies");
        for(int i=0;i<freq.length;i++)
        {
            if(string[i]!=' ' && string[i]!='0')
            {
                System.out.println(string[i]+"-"+freq[i]);
            }
        }
    }
}