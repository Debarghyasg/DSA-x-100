import java.util.*;

class anagram1{
    boolean anagram2(String s,String t){
        char[] arr1=s.toCharArray();
        char[] arr2=t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(arr1.length!=arr2.length){
            return false;
        }
 
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                {return false;}


        }
        


    }
    return true;
    }

}



public class anagram {
    public static void main(String[] args){
        String s="abcd";
        String t="cdaz";
        anagram1 obj=new anagram1();
        System.out.println(obj.anagram2(s,t));


    }
}