import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//Set extends Collection
//class HashSet and TreeSet implements Set
public class FiftyTwo {
    public static void main(String[] args) {
        System.out.println("Collection and Generics | Set Interface");

        System.out.println("Using Set=>to prevent duplicate element and HashSet=> to get Random order ");

        Set<Integer> values =new HashSet<>();

        values.add(10);
        values.add(20);
        values.add(30);
        values.add(20);     //main difference with List is Set doesn't accept and print duplicate value
                             //we input 20 for two times but it will be printed once //because 2nd time it not be added

//add() returns boolean ,to check that print it inside  System.out.println(); //check will it add or not
        System.out.println(values.add(40));   //it will add 40  //not duplicate
        System.out.println(values.add(30));   //it will not add  //duplicate not acceptable

        for (int i:values)
        {
            System.out.println(i);     //HashSet print in random order,
            // because HasSet uses the concept of Hashing, an algorithm fetch the nearest value stored in heap memory
        }

//What if you want the sorted elements in ascending order ?
 //Use TreeSet

        System.out.println("Using Set=>to prevent duplicate element and TreeSet=> to get sorted order ");
        Set<Integer> val =new TreeSet<>();

        val.add(20);
        val.add(10);
        val.add(30);
        val.add(90);
        System.out.println(val.add(40));
        System.out.println(val.add(30));

        for (int i:val)
        {
            System.out.println(i);     //TreeSet print in sorted order you can also reverse it by applying method
        }


    }
}
