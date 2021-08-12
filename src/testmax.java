public class testmax {


    public   static void main(String[] args) {
        int[] arr = {10, 20, 30, 50, 70, 40, 20};
        int first = 0;
        int second = 0;
        for(int i = 0; arr.length > i; i++)
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                second = arr[i];
            }
        System.out.println("The second max is:" + second);
    }
}