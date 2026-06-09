
class secsmall{
    int secsmall2(int[] arr){
        int max=arr[0];
        int secsmall=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>secsmall && arr[i]<max){
                secsmall=arr[i];
            }

        }
        return secsmall;

    }
}

public class Secondlargest {
    public static void main(String[] args){
    int[] arr = {10,20,50,6,40};
    secsmall obj=new secsmall();
    System.out.println(obj.secsmall2(arr));
    
}
}
