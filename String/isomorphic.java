import java.util.*;
class isomorphic1{
    boolean isomorphic2(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        //Character mapping store
        Map<Character,Character>  charobj=new HashMap<>();
        for(int i=0;i<s.length();i++){

            //iterate throght both string
            char c=s.charAt(i);
            char d=t.charAt(i);
            if(!charobj.containsKey(c)){
                if(!charobj.containsValue(d)){
                    charobj.put(c,d);
                }
                else{
                    return false;
                }
            }
            else{
                char mappedchar=charobj.get(c);
                if(mappedchar!=d){
                    return false;
                }
            }


        }
        return true;
    }
}


public class isomorphic {
    public static void main(String[] args){
        String s="banana";
        String t="appled";
        isomorphic1 obj=new isomorphic1();
        System.out.println(obj.isomorphic2(s,t));


    }
}
