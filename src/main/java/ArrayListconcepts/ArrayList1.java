package ArrayListconcepts;

import java.awt.*;
import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList obj=new ArrayList();
        //retrieving size of an array
        System.out.println(obj.size());
        //Adding elements in to arraylist
        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add("Naveen");
        System.out.println(obj);
        System.out.println(obj.size());
        //retrieving elements in to the arraylist
        System.out.println(obj.get(0));
        //print all the elements in the arraylist
        for(int i=0;i<=obj.size()-1;i++){
            System.out.println(obj.get(i));
        }
        //print all the elements using foreach loop
        for(Object e:obj){
            System.out.println(e);
        }

        //generic collections
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(20);
        ArrayList<String> linknames=new ArrayList<String>();
        linknames.add("Naveen");
        linknames.add("Srinivas");
        linknames.add("Suhasini");
        linknames.add("cb");
        int count=linknames.size();
        for(int i=0;i<=count-1;i++){
            System.out.println(linknames.get(i));
            if(linknames.get(i)=="Suhasini"){
                System.out.println("click operation");
                break;
            }
        }
        //Normal array declaration
        //int a[]=new int[5];
        //a[0]=1;

    }
}
