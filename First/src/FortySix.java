import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//Collection extends Iterable in java 1.2  ,
// Iterable has methods int size(),boolean contains(Object o),toArray(),boolean add(E e),boolean remove(Object o),
// boolean containsAll(Collection<?> c),boolean addAll(Collection<?> extends E> c),boolean removeAll(Collection<?> c) etc
//Vector extends AbstractList implements List in java 1.0 //so before 1.2 people used Vector as there was no Collection
public class FortySix {
    public static void main(String[] args) {
        System.out.println("Collection and Generics | Iterator Interface");
        Collection values=new ArrayList();
        values.add(4);
        values.add(6);
        values.add(9);
        values.add(3);  //it will store 3 after 9

 //print
        System.out.println(values);  //it will print all the values in same line
 //Collection doesn't have index number
 //what if i want to print values in different lines or individual values how to do that ?  use Iterator
 // Iterator is an interface which response to fetch the value of Collection//Iterator iterates over Collection
 //Iterator method boolean hasNext(), E next() ,iterator() etc

         Iterator it=values.iterator() ;  //small i: iterator() is a method //to fetch all values from Collection
        System.out.println(it.next());  //print the value comes inside Iterator //next() method print next element

         while(it.hasNext())             //hasNext returns boolean ,so loop will stop when all the values fetched
         {
             System.out.println(it.next());
         }

    }
}
