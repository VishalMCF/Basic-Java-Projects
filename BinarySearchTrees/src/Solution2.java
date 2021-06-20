import  java.util.*;

public class Solution2 {
    public static void main(String[] args) {
            int n;     // size of array input
            Scanner scan = new Scanner(System.in);
            System.out.println("\n");
            n = scan.nextInt();
            int key;
            key = scan.nextInt();
            int[] arr = new int[n+1];
            arr[0] = -1*n;
            for (int i = 1; i < n+1; i++) {
                arr[i] = scan.nextInt();
            }
            System.out.println("\n");
            int index = binarySearch(arr,key);
            System.out.println(index==-1?"NOT_FOUND":index);
    }

    private static int binarySearch(int[] arr,int key) {
        int start = 1;
        int end = 2;
        while(arr[end] < key){
            int tempEnd = end + (end - start + 1) * 2; // Increase end index to double the previous sub array bound size
            start = end + 1;  // increase start index by 1
            end = lastValidIndex(arr, start, tempEnd); // Get valid end index
            if(tempEnd > end) {  // Limit reached
                break;
            }
        }
        return binarySearchUtil(arr,start,end,key);
    }

    private static int binarySearchUtil(int[] arr, int start, int end,int key) {
        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid]==key){return mid;}

            else if(arr[mid]>key){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }

    public static int lastValidIndex(int arr[], int start, int end) {
        try {
            int temp = arr[end]; // Throws exception if array is out of bound
            return end;   // Return end index if value is valid
        } catch(ArrayIndexOutOfBoundsException e) {
            if(end > start && end >= 1) {   // Check if end index is greater than start index
                end -= 1;  // Reduce end index by 1
                return lastValidIndex(arr, start, end); // Call recursively getValidEndIndex() with new end to check its validity
            }
            else {
                return end; // Return valid end
            }
        }
    }


}
