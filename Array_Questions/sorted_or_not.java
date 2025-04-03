public class sorted_or_not {
    static boolean sort(int arr[]) {
        boolean check = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                check = false;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6 };
        sort(arr);
        System.out.println(sort(arr));

    }

}
