import java.util.*;
class searchX1{
    int searchX2(int[] arr,int target){
       int low = 0;                  // Start index
        int high = arr.length - 1;    // End index
        
        while (low <= high) {
            int mid = low + (high - low) / 2; // Safe middle calculation

            // Case 1: Target is found
            if (arr[mid] == target) {
                return mid; // Exits the loop AND the method instantly
            }
            // Case 2: Target is smaller, look in the left half
            else if (target < arr[mid]) {
                high = mid - 1;
            }
            // Case 3: Target is larger, look in the right half
            else {
                low = mid + 1;
            }
        }

        // If the loop finished and we never found the target
        return -1;

        }

}

public class searchX {
    public static void main(String[] args){
        int[] arr={-1,0,3,5,9,2}; 
        int target=9;
        searchX1 obj=new searchX1();
        System.out.println(obj.searchX2(arr,target));

    }
    
}
