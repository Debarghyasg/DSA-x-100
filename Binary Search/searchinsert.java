class searchinsert1{
    int searchinsert2(int[] arr,int  target){
        int low=0;
        int high=arr.length;
        int index=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            {
                if(arr[mid]<target){
                    low=mid+1; 
                    

                }
                else if(arr[mid]>=target){
                    index=mid;
                    high=mid-1;
                }
                // else{
                //     index=mid;
                //     return index;
                // }
            }
        }
        return index;
    }
}



public class searchinsert {
    public static void main(String[] args){
        int[] arr={1,2,4,7};
        int target=6;
        searchinsert1 obj=new searchinsert1();
        System.out.println(obj.searchinsert2(arr,target));
    }
}
