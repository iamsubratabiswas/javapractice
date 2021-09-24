//If you want (key,value) pair then go for Map interface  Map<K,V>
//we cn repeat values but not Keys, If we use same Key for two times key will replace value with latest one
//HashMap and HashTable class can implements Map
//HashMap not follow the sequence
//We can also use HashTable exactly at place of HashMap in below code
//HashMap is not Synchronized/not Thread safe but HashTable is Synchronized =>Thread Safe
//if there is no need to use MultiThreading then it is recommended to go for HashMap

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FiftyThree {
    public static void main(String[] args) {
        System.out.println("Collection and Generics | Map Interface");
//Type unsafe
        Map people=new HashMap();

        people.put("actress","Sunny Leone");   //in map put() method instead add(),because it can take two parameter
        people.put("actress","Dani Daniel");  //Here "actress" is Key and "Dani Daniels" is value
        people.put(10,20);                 //all type of object can accept
        people.put("100","200");
        people.put("100","20");            //duplicate key=value lost,latest value will be taken
        people.put("cricketer","Virat Kohli");

//print individual elements using key
        System.out.print("\nindividual elements of Type Unsafe Map is =  ");
        System.out.print(people.get("actress")+", ");//get()  is a method we can return Value  by their Key
        System.out.println(people.get("subrata")+", ");  //there ins no Key named subrata ,so it will print null

//print all elements in random order
        System.out.print("All element of Type unsafe Map (Random order) is=  ");
        System.out.print(people);       //printing the map

//print all elements following the key order (type unsafe)
        System.out.print("\nAll element of Type unsafe Map (following key order) is=  ");
        Set sunnykey=people.keySet();              //keySet() method will give you Set of keys
        for(Object key1:sunnykey)                  //enhance for loop,taking each sunnykey to key1
        {
            System.out.print(key1+" "+people.get(key1)+", ");  //key1 representing Keys ,get() returns values
        }


//Type safe
//we can make it type safe also =>Generics
        Map<String,String> work=new HashMap<>(); //Making it type safe

        work.put("Sunny Leone","actress");
        work.put("Dani Daniels","actress");
//        work.put(10,20);                     //Error  //Because String not accept Integer //Type safe
        work.put("Virat Kohli","cricketer");

//print individual elements using key
        System.out.print("\n\nIndividual Element of Type safe Map is =  ");
        System.out.print(work.get("Sunny Leone"));//get()  is a method we can return Value  by their Key

//print all elements
        System.out.print("Type safe Map is =  ");
        System.out.println(work);


//print all elements following the key order for type safe
        System.out.print("All element of Type safe Map (following key order) is=  ");
        Set<String> workKey=work.keySet();         //mentioning type eg:<String> is mandatory  //keySet() give Set of Keys
        for(String key2:workKey)                   // String at place of Object but not compulsory
        {
            System.out.print(key2+" "+work.get(key2)+", ");  //key2 representing Keys ,get() returns values
        }



//Working with HashTable


    }
}
