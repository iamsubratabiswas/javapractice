import java.util.*;
//Collection is collection of elements
//in consecutive codes: collection API,Generics,merge collection API into Generics
// we will discuss collection 3 different concepts
//small C: collection=it is concept
//cap C: Collection=it is an interface
//at end s and cap C: Collections = it is a class
public class FortyFive {
    public static void main(String[] args) {
        System.out.println("Collection  and Generics in Java\nCollection API is a big package where " +
                "A lot of classes and interfaces are there" +
                "\nCollection,Generics,ArrayList,List,Set,HashSet,TreeSet,Map,HashMap,HashTable");

        //Collection
//        int arr[]=new int[4];   //array is fixed size so we use Collection
        Collection arr=new ArrayList();//AS collection is interface so no object creation possible,so we can use class Arraylist
                                     //Arraylist implements List, List extends Collection,so List is also an interface
        arr.add(10);                 //add is a method to add elements
        arr.add(20);                  //Advantage is Arraylist automatically resize when you add or delete elements
                                      //that's why we use Collection instead of Arrays
                                     //NB: if fixed size is enough then go for Array,because Array is fast
        arr.add("SUBRATA");         //it takes all object instead mentioning int,float etc//you can add any value
        arr.add("BISWAS");
 //If i want only specific value (eg:only Integer or only Foat ) what to do ? //use Generics=> <> angular bracket
 //in java 1.2 we got Collection API and in java 1.5 we got Generics

        //Generics
        Collection<Integer> pageNo =new ArrayList<Integer>(); //this Collection will only accept Integer values
 //before 1.7 we have to mention class Type :eg=>Integer in both side but in 1.7 we use Type in single side like below
        Collection<Integer> price=new ArrayList<>();
        price.add(10);
        price.add(20);
        price.add(30);
//but Collection not work with index number: if i want to add 12 in between 10 and 20 what to do ?
//so instead of using Collection we will use List, because List works with index number And ArrayList implements List
        List<Integer> num =new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(30);
        num.add(1,12);
//But in List we may have duplicate elements,What to do if we don't want duplicate elements to be printed ?
//Instead of using List use Set,here class HashSet,TreeSet implements Set
        Set<Integer>  numbers=new HashSet<>();
//But in Set if you add elements and you fetch them they don't follow the order of sequence unlike List
//So instead of HashSet use TreeSet //Because TreeSet give you everything in sorted order
//TreeSet if you add 4,7,8,9,1,3,2,10  and when you fetch values it will come as 1,2,3,4,7,8,9,10
        Set<Integer> roll=new TreeSet<>();  //we get everything in a sorted format

//Map<k,v>

//in list we have index number and duplicate numbers but in Map we have key and value (key,value) //key-value pair
//every value has key
//class HashMap and HashTable can implements interface Map //one is synchronized/Thread safe and one is not

        Map<Integer,String> student=new HashMap<>();   //first one key,second one value



    }
}

