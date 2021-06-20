import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int n;     // size of array input
        Scanner scan = new Scanner(System.in);
        System.out.println("\n");
        n = scan.nextInt();
        int[] arr = new int[n+1];
        arr[0] = -1*n;
        for (int i = 1; i < n+1; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("\n");
        int index = binarySearchUtil(arr,1,n);
        System.out.println(index==-1?"NOT_FOUND":index);
    }

    public static int binarySearchUtil(int[] arr,int i,int j){

        while(i<=j){
            int mid = i+(j-i)/2;
            if(arr[mid]==mid && arr[mid-1]==(mid-1)){
                return binarySearchUtil(arr,i,mid-1);
            }
            else if(arr[mid]==mid && arr[mid-1]!=mid-1){
                return mid;
            }
            else if(arr[mid]>mid){
                j = mid-1;
            }
            else if(arr[mid]<mid){
                i = mid+1;
            }

        }
        return -1;
    }
}
