class reverse1{
    int[] reverse2(int[] arr){
        int[] result=new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            result[j]=arr[i];
            j++;
        }
        return result;

    }
}


public class reverse{
    public static void main(String[] args){
        int[] arr ={2,3,4,6};
        reverse1 obj=new reverse1();

        int[] result=obj.reverse2(arr);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}