import java.util.Scanner;
class palindrome
{
  public static void main(String args[])
    {
    String org,rev="";
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter to check palindrome:");
      org = sc.nextLine();
      int length = org.length();
        for (int i = length - 1; i >=0; i--)
          rev = rev+org.charAt(i);
        if (org.equals(rev))
           System.out.println("Entered string is palindrome");
         else
           System.out.println("Entered string is not a pallindrome");
     }
}
