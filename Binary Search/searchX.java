import java.util.*;
class searchX1{
    void searchX2(int[] arr,int target){
        int low=arr[0];
        int high=arr[arr.length-1];
        int mid=(low+high)/2;
        if(target<mid){
        for(int i=0;i<mid;i++){
            if(arr[i]==target){
                System.out.print(i);
                break;
            }
            else{
                System.out.print(-1);
            }


        }
        }
        else if(target>mid){
            for(int i=mid;i<arr.length;i++){
            if(arr[i]==target){
                System.out.print(i);
                break;
            }
            else{
                System.out.print(-1);
            }


        }


        }
        else{

        }

        }

}

public class searchX {
    public static void main(String[] args){
        int[] arr={2,3,4,5,6,7,8,9,10}; 
        int target=8;
        searchX1 obj=new searchX1();
        obj.searchX2(arr,target);

    }
    
}
