package Love_Babber_Sheet;

public class Reverse_Array {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5,6};
        int temp = 0;
        int k = arr.length / 2;
        int l = arr.length - 1;

        if (k / 2 == 0) {
            for (int i = 0; i <= k; i++) {
                temp = arr[i];
                arr[i] = arr[l];
                arr[l] = temp;
                l--;
            }
        }else {
            for (int i = 0; i < k ; i++) {
                temp = arr[i];
                arr[i] = arr[l];
                arr[l] = temp;
                l--;
            }
        }

        System.out.println("the output of the array");
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
