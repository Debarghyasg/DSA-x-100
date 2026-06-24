import java.util.*;
class lowerbound1{
    int lowerbound2(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        
        while(low<high){
        int mid=(low+high)/2;
        if(arr[mid]>=target){
            return mid;
        }
        else if(arr[mid]<target){
            low=mid+1;
        }
        else{
            return arr.length;
        }

    }
    return arr.length;
}
}


public class lowerbound{
    public static void main(String[] args){
        int[] arr={1,2,2,3};
        int target=2;
        lowerbound1 obj=new lowerbound1();
        System.out.println(obj.lowerbound2(arr,target));
    }
}