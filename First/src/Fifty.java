//How to sort element  depending upon only the last digits

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Fifty {
    public static void main(String[] args) {
        System.out.println("Collection and Generics | Comparator Interface");


        List<Integer> values=new ArrayList<>();  //Mutable    //Eg: Stream API is Immutable
        values.add(404);
        values.add(908);
        values.add(639);
        values.add(265);

        //As Comparator is an interface and no inbuilt class implements it so we need to create our own class to make object
        //aas the class is for one time use so we are creating here anonymous class
//By normal anonymous class
//        Comparator<Integer> c=new Comparator<Integer>() {
//            public int compare(Integer i, Integer j)     //This logic will sort element according to last digit
//            {
//                 return i%10>j%10?1:-1;
//            }
//        };
//as Comparator is a @Funcional interface so we can use Lambda Expression also below
//by Lambda Expression
                Comparator<Integer> c=(i,j)-> i%10>j%10?1:-1;
                                             //we can remove the type of the element //it is optional
                                            //return keyword also optional
//We can put this Lambda expression directly inside sort() method also

//By Comparator object in sort()
        Collections.sort(values,c);  //c is Comparator reference  //sort is based on when to swap and when not to swap

//By Lambda Expression inside sort()
//        Collections.sort(values,(i,j)-> i%10>j%10?1:-1);

        System.out.println("After sorting");
        for(Object o:values)
        {
            System.out.println(o);
        }
    }
}


//Explanation : steps to build or  own logic we have to find how sort works
//sort() uses Comparable interface and Comparable defines logic for it
// Integer extends Number implements Comparable<Integer>{ }
//in Comparable a method int compareTo(T o) is responsible i mean Integer class has implemented it
//simply the logic :compareTo() using method=> public static int compare(int x,int y) {return (x<y)?-1:((x==y)?0:1}
//i want t0 change this logic to sort my element according to last digits
//to use it we use sort(list,Comparator) version of sort() method