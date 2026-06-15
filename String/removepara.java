//Remove outermost paranthesis from a given string
//If (()())(()) is given then ans is ()()()



//if ( para is there count++ if count is zero else it will be added to ans
//if ) para is there count-- if count is bigger than zero and it will be added to ans

import java.util.*;
class paran{
    String paran2(String s){
        StringBuilder result= new StringBuilder();
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                if(count>0){
                    result.append(c);            //count check

                }
                count++;                            //count++

            }
            else if(c==')'){
                count--;                            //count--

                if(count>0){
                    result.append(c);               //count check         
                }
                

            }



        }
        return result.toString();
    }
}





public class removepara{

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s="(()())(())";
    paran obj=new paran();
    System.out.println(obj.paran2(s));


}
}