//Collections class //sort(List) is a method of collection class by which we can sort the list

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FortyNine {
    public static void main(String[] args) {
        System.out.println("Collection and Generics | Collections class");

        List<Integer> values=new ArrayList<>();  //Mutable    //Eg: Stream API is Immutable
        values.add(404);
        values.add(908);
        values.add(639);
        values.add(265);

        System.out.println("Before sorting");
        for(Object o:values)
        {
            System.out.println(o);
        }

//we can sort it by applying various sorting algorithm
// but we can do it easily by using sort(List) method of Collections class

        Collections.sort(values);   //all values of List will be sorted by this method
                                    //sort() is a static method so we can call it by class name
        //sort() method originally changing the value inside List, so List is by default Mutable/Changeable
//sort
        System.out.println("After sorting");
        for(Object o:values)
        {
            System.out.println(o);
        }
//reverse order
        Collections.reverse(values);

        System.out.println("After sorting we do it revere,so sort()+reverse()=reverse sort=>Descending order");
        for(Object o:values)
        {
            System.out.println(o);
        }
//shuffle
        Collections.shuffle(values);   //it will shuffle the elements
        System.out.println("After shuffling");
        for(Object o:values)
        {
            System.out.println(o);
        }

        System.out.println("There are a lot more method in Collections class => copy(),max(),min() etc");

    }
}
