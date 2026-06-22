import java.util.*;
class union2{
    int[] union3(int[] arr1,int[] arr2){
        
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]<arr2[j]){
                    break;
                }
                if(arr1[i]>arr2[j]){
                    int temp=arr1[i];
                    arr1[i]=arr2[j];
                    arr2[j]=temp;
                    break;
                    


                }
                if(arr1[i]==arr2[j]){
                    int temp=arr1[i];
                    arr1[i]=arr2[j];
                    arr2[j]=temp;
                }
                
            }

        }
        return arr1;
    }
}



public class union{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int[] arr1={2,4,5,9};
        int[] arr2={3,4,6,12};
        union2 obj=new union2();
        int[] result = obj.union3(arr1, arr2);


        System.out.println(Arrays.toString(result));


    }
}