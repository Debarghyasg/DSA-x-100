class twosum1{
    public int[] twosum2(int[] arr,int target){
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


