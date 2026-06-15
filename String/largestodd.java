import java.util.*;
class largestodd1{
    void largestodd3(String s){
        char temp=0;
        for(int i=0;i<s.length();i++){
            
            char c=s.charAt(i);
            if(c%2!=0){
                if(c>temp){
                    temp=c;
                }
                


            }
            
        }
        System.out.println(temp);
        
    }
}

public class largestodd {
    public static void main(String[] args){
        String s="1,3,4,12,9";
        largestodd1 obj=new largestodd1();
        obj.largestodd3(s);

    }
    
}
