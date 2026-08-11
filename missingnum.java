class missingnum1{
    void missingnum2(int[] arr){
        int n=arr.length+1;
        int expectsum=n*(n+1)/2;  
        int s=0;
        for(int i=0;i<n-1;i++){
            s+=arr[i];
        }
        System.out.println(expectsum-s);
    }
}



public class missingnum {
    public static void main(String[] args){
        int[] arr={1,2,3,5,6,7};
        missingnum1 obj=new missingnum1();
        obj.missingnum2(arr);

    }
}
