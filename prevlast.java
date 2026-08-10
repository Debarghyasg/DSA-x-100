class prevlast1{
    void prevlast2(int[] arr,int target){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                for(int j=0;j<i;j++){
                    System.out.println(arr[j]);
                }
            }
        }


    }

}



public class prevlast{
    public static void main(String[] args){
        int[] arr={2,3,5,6};
        int target=5;
        prevlast1 obj=new prevlast1();
        obj.prevlast2(arr,target);

    }
}