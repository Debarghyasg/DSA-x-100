import java.util.*;
class inttoroman2{
    String inttoroman3(int num){
        StringBuilder ans=new StringBuilder();
        int[] val={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        if(num==0){
            return "";
        }
        for(int i=0;i<val.length;i++){
            int c=num/val[i]; //267/100=2
            while(c!=0){
            ans.append(roman[i]);
            c--;
            }
            num=num%val[i];
            


        }
        return ans.toString();
    }
}


public class inttoroman{
    public static void main(String[] args){
        int num=267;
        inttoroman2 obj=new inttoroman2();
        System.out.println(obj.inttoroman3(num));
    }
}