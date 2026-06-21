import java.util.*;

class stringtoint1{
    int stringtoint2(String s){
        s=s.trim();
        int num=0;
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
            i++;

        }
        num=sign*num;
        if(num>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;

        }

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
 