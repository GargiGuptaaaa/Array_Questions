import java.util.Scanner;

public class last_occuring {
    public static void last_occuring(int arr[], int key) {
        int last_index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                last_index = i;
            }

        }
        System.out.println(last_index);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("enter the element to be count  : ");
        int key = sc.nextInt();
        last_occuring(arr, key);
    }

}
