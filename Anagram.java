import java.util.Arrays;
class Anagram
{
    public static void main(String[] args) 
    {
        String s1="heart";
        String s2="earth";
        if(s1.length()!=s2.length())
        {
            System.out.println("It is not Anagram");
        }
        else
        {
            char[] string1=s1.toCharArray();
            char[] string2=s2.toCharArray();
            Arrays.sort(string1);
            Arrays.sort(string2);
            if(Arrays.equals(string1,string2)==true)
            {
                System.out.println("Both strings are Anagram");
            }
            else
            {
                System.out.println("Both strings are not Anagram");
            }
        }
    }
}