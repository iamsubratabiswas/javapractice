//List has index number and List extends/has all the features of Collection

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class FortySeven {
    public static void main(String[] args) {
        System.out.println("Collection and Generics | List Interface");
        List values=new ArrayList();
        values.add(4);
        values.add("Subrata");   //we can add any type of object until mentioning Generics
        values.add(9);
        values.add(2,3); //it will add 3 before 9 at index 2
        System.out.println(values);
// we can use Iterator with List also,because List inherit all feature of Collection
// but for loop is better option as we have index
        System.out.println("using Iterator");

        Iterator it=values.iterator() ;
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
//Using for loop
        System.out.println("using for loop");

        for (int i = 0; i < values.size(); i++)   //we have a method size() in Collection interface
        {
            System.out.println(values.get(i)); //get(index i) is a method of List interface
        }
//Using Enhanced for loop
        System.out.println("Using Enhanced for loop");

        for(Object o:values)
        {
            System.out.println(o);
        }

    }
}
