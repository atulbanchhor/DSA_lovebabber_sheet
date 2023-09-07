package Love_Babber_Sheet;

public class Max_Min_of_array {
    public static void main(String[] args) {
        int arr[] = {2, 5, 4, 336, 4, 9, 2};
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println(min);
        System.out.println(max);
    }
}
