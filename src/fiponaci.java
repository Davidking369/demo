import java.util.Scanner;
public  class fiponaci {
 public static void main(String []args)
 {
     int num=0;
     int num2=1;
     int nextnum;
     int leng;
     System.out.println("Enter the length Scer:");
     Scanner scan=new Scanner(System.in);
    leng=scan.nextInt();
    scan.close();
for (int i=0;i<leng;i++) {
    System.out.print(num + " ");
    nextnum = num + num2;
    num = num2;
    num2 = nextnum;
}


 }


}
