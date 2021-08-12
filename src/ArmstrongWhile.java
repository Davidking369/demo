import java.util.Scanner;

    class ArmstrongWhile
{
    public static void main(String[] arg)
    {
        int i=0,arm;
        System.out.println(" Enter the limit of  Armstrong numbers between 0 to:");
        Scanner sr= new Scanner(System.in);
        int b= sr.nextInt();
        sr.close();
        while(i<b)
        {
            arm=armstrongOrNot(i);
            if(arm==i)
                System.out.println(i);
            i++;
        }
    }
    static int armstrongOrNot(int num)
    {
        int x,a=0;
        while(num!=0)
        {
            x=num%10;
            a=a+(x*x*x);
            num/=10 ;
        }
        return a;
    }
}

