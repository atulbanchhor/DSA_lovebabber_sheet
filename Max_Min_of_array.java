package Love_Babber_Sheet;

public class Max_Min_of_array {
    public static void main(String[] args) {
        int arr[] = {2, 5, 4, 336, 4, 9, 2};
        int max = arr[0];                                // yaha par mai arr[0] ko he max le lera hu aur aage nu. s compare kar ra hu 
        int min = arr[0];                                // yaha par mai arr[0] ko he min le lera hu aur aage nu. s compare kar ra hu 

        for (int i = 1; i < arr.length; i++) {    
            if (arr[i] > max) {                            // aur agar max aage wale no. s jyada hai to us value ko max s replace kr dera hu
                max = arr[i];
            }
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){                              // aur agar min aage wale no. s chota  hai to us value ko min s replace kr dera hu
                min = arr[i];
            }
        }

        System.out.println(min);
        System.out.println(max);
    }
}
