public class Missing {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 8 };
        int n = arr.length;
        int sum_of_natural = ((n + 1) * (n + 2)) / 2;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        int missing = 0;
        missing = sum_of_natural - sum;
        System.out.println("Missing Number is : " + missing);
    }

}
