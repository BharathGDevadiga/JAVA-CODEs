import java.util.*;
public class HashMapBasics{
    public static void main(String[] args)
    {
        HashMap<String,Integer>map=new HashMap<>();
        map.put("English",85);
        map.put("Maths",90);
        map.put("Science",95);
        System.out.println(map.containsKey("English"));
        System.out.println(map.containsValue(90));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        

    for(Map.Entry<String,Integer>entry:map.entrySet()){
        if(entry.getValue()>=90){
            System.out.println(entry.getKey()+" ");
        }
    }
}
}
