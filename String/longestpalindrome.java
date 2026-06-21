class longestpalindrome1{
    String longestpalindrome2(String s){
        StringBuilder ans=new StringBuilder();
        int left=0;
        int right=0  ;
        if(s.length()%2!=0){    //babad
            for(int i=1;i<s.length()-1;i++){
                char c=s.charAt(i);     //a
                char d=s.charAt(i+1);   //b
                char z=s.charAt(i-1);   //b
                if(d==z){
                    if(i+1>left ){ 
                    left=i-1; //0
                    right=i+1; //1
                    }


                }

            }
        }
        if(s.length()%2==0){
            for(int i=0;i<s.length()-1;i++){
                char c=s.charAt(i);     //cbbd
                char d=s.charAt(i+1);   //b
                
                if(c==d){
                    if(i+1>left ){ 
                    left=i;
                    right=i+1;
                    }


                }

            }
        }
        for(int i=left;i<=right;i++){
            char c=s.charAt(i);
            ans.append(c);
        }
        return ans.toString();
    }
}


public class longestpalindrome {
    public static void main(String[] args){
        String s="cbbd";
        longestpalindrome1 obj=new longestpalindrome1();
        System.out.println(obj.longestpalindrome2(s));
    }
}
