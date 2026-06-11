import java.util.*;
class linear{
    void linear2(int[] arr,int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                System.out.print(i);
            }

        }
    }
}
public class linearsearch {
    public static void main(String[] args){
        int k=4;
        int[] arr={2,3,4,46};
        linear obj=new linear();
        obj.linear2(arr,k);

    }
}
