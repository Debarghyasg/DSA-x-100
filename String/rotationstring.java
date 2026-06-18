class rotationstring1{
    void rotationstring2(String s,String t){

        String temp=s+s;  //abcdeabcde
        if(temp.contains(t)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}


public class rotationstring {
    public static void main(String[] args){
        String s="abcde";
        String t="cdeab";
        rotationstring1 obj= new rotationstring1();
        obj.rotationstring2(s,t);

    }
}
