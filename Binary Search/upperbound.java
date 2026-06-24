import java.util.*;
class upperbound1{
    int upperbound2(int[] arr ,int target){
        int low=0;
        int high=arr.length;
        
        while(low<high){
            int mid = low + (high - low) / 2;
            if(arr[mid]<=target){
                low=mid+1;

            }
            else if(arr[mid]>target){
                return mid;

            }
            else{
                return arr.length;
            }

        }
        return arr.length;
    }
}



public class upperbound {
    public static void main(String[] args){
        int[] arr ={1,2,2,3};
        int target=2;
        upperbound1 obj=new upperbound1();
        System.out.println(obj.upperbound2(arr,target));

        
    }
}
