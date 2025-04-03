import java.util.Scanner;

public class rotateby_kth {
    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotate(int arr[], int key) {
        reverse(arr, 0, key);
        reverse(arr, key + 1, arr.length - 1);
        reverse(arr, 0, arr.length - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index from where the array should be rotated: ");
        int key = sc.nextInt();
        System.out.println("Enter the length of the array :");
        int m = sc.nextInt();
        int arr[] = new int[m];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        rotate(arr, key);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
