import java.util.*;
class largestnum{
    int largest2(int[] arr){
        int max=arr[0];
        
        for(int i=2;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];

            }
            
        }
        return max;
    }

}
public class largest{
public static void main(String[] args){
int[] arr = {10,20,50,6,40};
    largestnum obj=new largestnum();
    System.out.println(obj.largest2(arr));


}


}