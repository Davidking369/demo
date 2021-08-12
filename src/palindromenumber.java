import java.util.Scanner;
public class palindromenumber {

    public static void main(String[] args) {

        System.out.println("Enter the number want to check:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        int orginal=number;
        int check = 0;
        int temp = 0;

        while (number> 0) {
            temp = number % 10;
            check = (check * 10)+temp;
            number=number/10;
            if (orginal==check)
            {
                System.out.println("The number is polindrome");
                break;
            }
            else
            { System.out.println("The number is not polindrome");
               break;}
        }
    }
}