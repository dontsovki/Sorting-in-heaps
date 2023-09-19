import progect.heaps;
public class Main {
    public static void main(String[] args) {
        int[] arr = {1234, 4, 7, 2, 1, -3, 0, 567, 45, 90, 34,2, 234};

        new heaps(arr);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}