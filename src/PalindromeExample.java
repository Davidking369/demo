import java.util.Scanner;

class PalindromeExample2
{
    public static void main(String[] args)
    {
        String str;  // Objects of String class
        StringBuilder rev = new StringBuilder();
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter a string/number to check if it is a palindrome");
            str = in.nextLine();
        }
        int length = str.length();
        for ( int i = length - 1; i >= 0; i-- ) {
            rev.append(str.charAt(i));
        }
        if (str.equals(rev.toString()))
            System.out.println("Entered string/number is a palindrome.");
        else
            System.out.println("Entered string/number isn't a palindrome.");
    }
}