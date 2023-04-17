import java.util.Scanner;
import java.util.*;
public class Get_Sub_Sequence {
static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
String str=scn.next();
ArrayList<String> ans=gss(str);
System.out.println(ans);
    }

    public static ArrayList<String> gss(String str){
        if(str.length()==0){
            ArrayList<String>base=new ArrayList<>();
            base.add("");
            return base;
        }
        char ch=str.charAt(0);
        String ros=str.substring(1);

        ArrayList<String> recans=gss(ros);
        ArrayList<String> myans =new ArrayList<>();
        for(String ele:recans){
            myans.add(ele);
        }
        for(String ele:recans){
            myans.add(ch + ele);
        }
    
    return myans;}
}
