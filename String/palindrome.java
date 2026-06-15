import java.util.*;
class reverse{
    String reverse2(String s){
        StringBuilder temp= new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            temp.append(c);


        }
        return temp.toString();
        }
        

    }


public class palindrome {
    public static void main(String[] args){
        String s="Kolkata";
        reverse obj=new reverse();
        System.out.println(obj.reverse2(s));

        if(obj.reverse2(s)==s){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is a not palindrome");
        }
        


    }
    
}
