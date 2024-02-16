class PunctuationCharactersInString
{
    public static void main(String[] args) 
    {
        String s="GoodNight!Mr.J.Had ur dinner?";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='.'||s.charAt(i)==','||s.charAt(i)=='?'||s.charAt(i)==';'||s.charAt(i)==':'||s.charAt(i)=='/'||s.charAt(i)=='!')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}