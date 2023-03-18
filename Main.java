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
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println((binarySearch(5, arr,0,9)));
    }
}