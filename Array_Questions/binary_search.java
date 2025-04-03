import java.util.*;

public class binary_search {
    public static int bin_search(int key, int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == arr[mid]) {
                return mid;
            }
            if (key > arr[mid]) {
                start = mid + 1;

            }
            if (key < arr[mid]) {
                end = mid - 1;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to be searched : ");
        int key = sc.nextInt();
        int arr[] = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(bin_search(key, arr));
    }
}
