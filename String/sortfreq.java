import java.util.*;


class sortfreq1{
    void sortfreq3(String s){
        HashMap<Character,Integer> obj=new HashMap<>();  //Hashmap initialization
        for(int i=0;i<s.length();i++){
        char c=s.charAt(i); //Iterate throgh string
    if(obj.containsKey(c)){
        obj.put(c,obj.get(c)+1); //if key present
    }
    else{
        obj.put(c,1); // if key not present
    }
    


    }
    List<Character> list=new ArrayList<>(obj.keySet()); //list ini  // keyset contains only the keys
    //Values contains values of map
    //entrySet contains both key and value
    list.sort((a,b)->obj.get(b)-obj.get(a));
    System.out.println(list);

    }
}




public class sortfreq{
    public static void main(String[] args){
        String s="Banana";
        sortfreq1 obj=new sortfreq1();
        obj.sortfreq3(s);

    }

}