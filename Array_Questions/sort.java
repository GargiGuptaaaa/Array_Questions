import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 4, 7, 5 };
        int target = 4;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int start = 0;
        int end = arr.length - 1;
        // // step 2 begins

        while (start < end) {
            if (arr[start] + arr[end] == target) {
                System.out.println("indexces : " + start + " , " + end);
                start++;
                end--;
            } else if (arr[start] + arr[end] > target) {
                end--;
            } else {
                start++;
            }
        }
    }

}
