
class check{
    boolean check2(int[] arr){
        boolean issorted=true;
        int j=arr[0];
        for(int i=j+1;i<arr.length;i++ ){
            if(arr[i]<arr[j] ){
                issorted=false;
                break;
            
                

            }
            else{
                issorted=true;
            }
        }
        return issorted;
    }
}



public class Checksorted {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        check ob=new check();
        System.out.print(ob.check2(arr));


    }
}
