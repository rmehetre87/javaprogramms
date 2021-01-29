package Collections;

import java.util.HashMap;

public class HashMapExample 
{
    public static void main(String[] args) throws CloneNotSupportedException 
    {
        HashMap<Integer, String> map = new HashMap<>();
         
        map.put(1,  "A");
        map.put(1,  "B");
        map.put(3,  "C");
         
        System.out.println(map);
        String value = map.get(2);
        System.out.println("The value is ::"+  value );
        
        return;
    }
}
