package ArrayListconcepts;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args)
    {
        Map<String,Integer> obj=new HashMap<String,Integer>();
        //Add key and value pair in to map by using put method
        obj.put("Naveen",100);
        obj.put("Srinivas",200);
        obj.put("Raju",300);
        obj.put(null,800);
        obj.put(null,900);
        obj.put("cb",null);
        obj.put("cb1",null);
        obj.put("cb",400);
        System.out.println(obj);
        //retrieving values from hashmap
        System.out.println(obj.get("Naveen"));
        //foreach
        obj.forEach((k,v)->System.out.println(k+":"+v));

        //EntrySet
        for(Map.Entry m:obj.entrySet()){
            System.out.println(m.getKey()+":"+m.getValue());
        }
        //containskey
        System.out.println(obj.containsKey("Navee"));
        //Replace
        obj.replace("Naveen",200);
        System.out.println(obj);
        //remove
        obj.remove("cb1");
        System.out.println(obj);
    }
}
