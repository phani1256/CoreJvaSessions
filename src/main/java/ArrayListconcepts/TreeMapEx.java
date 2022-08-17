package ArrayListconcepts;

import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<Integer,String> tmap=new TreeMap<Integer,String>();
        tmap.put(101,"Naveen");
        tmap.put(102,"cb");
        tmap.put(100,"cb1");
        tmap.put(99,"cb2");
        tmap.forEach((k,v)->System.out.println(k+":"+v));

    }
}
