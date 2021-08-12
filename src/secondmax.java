import java.text.MessageFormat;

public class secondmax {
    public static void main( String[] args)
    {

        int[] arr= {1, 2, 3, 4, 8, 5};
        int first=0;
        int second=0;
        for(int i=0;i<arr.length;i++)
        {
        if( arr[i]>first)
            {
               second=first;
               first=arr[i];
            }
               else if(arr[i]>second )
            {
                   second=arr[i];}}
                System.out.println("First max is "+first);
                System.out.println("Second max is "+second);
            }
    }

