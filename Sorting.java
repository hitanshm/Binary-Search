public class Main {
    public static void main(String[] args) {


        int [] arr = {1,11,4,10,7,9,6};
        sort(arr,6);
        for(int i=0;i<arr.length;i++) {

            System.out.println(arr[i]);
        }
    }
    public static void sort(int [] arr, int n){

        for (int i=1;i<arr.length;i++){

            if (n==0){
                return;
            }
            if (arr[i]<arr[i-1]){
                int temp=arr[i-1];
                arr[i-1]=arr[i];
                arr[i]=temp;
            }
        }
        sort(arr, n-1);
    }
}