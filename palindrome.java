class palindrome1{
    boolean palindrome2(int[] arr){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            if(arr[low]!=arr[high]){
                return false;
            }
            low++;
            high--;

        }
        return true;
    }
}



public class palindrome {
    public static void main(String[] args){
        int[] arr={1,2,2,1};
        palindrome1 obj= new palindrome1();
        System.out.println(obj.palindrome2(arr));


    }
}
