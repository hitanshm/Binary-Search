public class Main {
    public  static int binarySearch(int x, int [] arr, int start, int end){

        int mid= (end+start)/2;

        if (arr[mid]==x){
            return mid;
        }
        else{
            if (x>mid) {
                return binarySearch(x, arr, mid + 1, end);
            }
            else {
                return binarySearch(x,arr,start, mid-1);
            }
        }
    }

    //selection sort
    public static void sort(int n, int [] arr){
        if (n==arr.length){
            return;
        }
        int min=arr[n];
        int minlock=n;
        for (int i=n+1;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
                minlock=i;
            }
        }
        int temp = arr[n];
        arr[n]=min;
        arr[minlock]=temp;
        sort(n+1, arr);
    }

    public static void main(String[] args) {

        int [] arr = {1,9,6,4,5,3,7,8,10,2};
        sort(0, arr);
        //location of number in sorted arr
        System.out.println((binarySearch(6, arr,0,9)));

    }
}