class twosum1{
    int[] twosum2(int[] arr,int target){
        int[] result=new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    result[0]=arr[i];
                    result[1]=arr[j];
                }
            }
        }
        return result;

    }
}

public class twosum {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int target=7;
        twosum1 obj=new twosum1();
        obj.twosum2(arr,target);

    }
}
