//100,200,300,400,200,500,200

class tcs2{
    int tcs3(int[] arr,int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=target){
                count++;
            }
        }
        return count;


    }
}

public class tcs1{
    public static void main(String[] args){
        int[] arr={100,200,300,400,200,500,200};
        int target=200;
        tcs2 obj=new tcs2();
        
        int ans=obj.tcs3(arr,target);
        System.out.println(ans);
        for(int i=1;i<=ans;i++){
            System.out.println(i);
        }
    }
}