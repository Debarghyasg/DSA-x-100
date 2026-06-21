import java.util.*;

class stringtoint1{
    long stringtoint2(String s){
        if(s.isEmpty()){
            return 0;
        }
        s=s.trim();
        
        long num=0;
        int sign=0;
        int i=0;
        int n=s.length();
        if(s.charAt(i)=='+'){
            sign=+1;
            i++;

        }
        else if(s.charAt(i)=='-'){
            sign=-1;
            i++;
            

        }
        else{
            sign=+1;
            
        }
        while(i<n && Character.isDigit(s.charAt(i))){
            num=((num*10)+s.charAt(i)-'0');
            if (sign * num > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign * num < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;

        }
        num=sign*num;


        return num;

    }

}


public class stringtoint {
    public static void main(String[] args){
        String s="987ajs";
        stringtoint1 obj=new stringtoint1();
        System.out.println(obj.stringtoint2(s));
    }
}
 