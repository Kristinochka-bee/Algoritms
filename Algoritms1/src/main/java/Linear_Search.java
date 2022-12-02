import java.util.Arrays;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 9, 10, 100, 44, 55, 78, 2};
    Linear linear = new Linear();

        System.out.println(linear.search(arr,4));

    }
    static class Linear{
        int search (int arr[], int n){
            int x = n;
            int research = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == n){
                    research = i;
                    break;
                }
            }
            return research;
        }
    }
}