import java.util.Scanner;
import java.util.*;
public class Get_Stair_Path {
    static   Scanner scn=new Scanner(System.in);
    public static void main(String []args){
      int n=scn.nextInt();
      ArrayList<String> ans= gsp(n);
      System.out.println(ans);
    }
    public static ArrayList<String> gsp(int n){
        if(n==0){
            ArrayList<String>base=new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String>myans=new ArrayList<>();

        if(n-1>=0){
            ArrayList<String>nm1=gsp(n-1);
            for(String ele:nm1){
                myans.add("1"+ele);
            }
        }
        if(n-2>=0){
            ArrayList<String>nm2=gsp(n-2);
            for(String ele:nm2){
                myans.add("2"+ele);
            }
        }
        if(n-3>=0){
            ArrayList<String>nm3=gsp(n-3);
            for(String ele:nm3){
                myans.add("3"+ele);
            }
        }

        return myans;

    }

}
