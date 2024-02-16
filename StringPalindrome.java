class StringPalindrome
{  
   public static void main(String args[])  
   {  
     String s="racecar";
     int n=s.length();
     String r="";
     for(int i=n-1;i>=0;i--)
     {
      r=r+s.charAt(i);
     }
     if(s.equals(r))
     {
      System.out.println("Yes");
     }
     else
     {
      System.out.println("No");
     }
   }  
}