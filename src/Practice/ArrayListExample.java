package Practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
 
public class ArrayListExample  //serialization
{
    public static void main(String[] args) throws Exception 
    {
        ArrayList<String> namesList = new ArrayList<String>();
         
        namesList.add("alex");
        namesList.add("brian");
        namesList.add("charles");
 
        
            FileOutputStream fos = new FileOutputStream("C:/Users/mehetrr/Project workspace/Java/src/listData.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(namesList);
            oos.close();
            fos.close();
        } 
        
    }

