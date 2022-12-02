public class Find_elem {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 4, 4, 5, 5, 6, 6 };
        General general = new General();
        System.out.println(general.getSingleElement(arr));


    }
    static class General {
        int getSingleElement (int arr[]){
            int reserch = -1;
            for (int i = 0; i < arr.length; i+=2) {
                if (arr[i] != arr[i+1]){
                    reserch = arr[i];
                    break;
                }

            }
                return reserch;
        }


    }
}
