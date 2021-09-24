//I you want to sort your own class elements how to do that ?
//Use Comparable interface

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//creating class Stud
class Stud implements Comparable<Stud>      //to Compare/sort the class object we implements it
{
    int roll,marks;
    String name;
//I want to assign value using constructor
    public Stud(int roll, int marks, String name) {
        super();
        this.roll = roll;
        this.marks = marks;
        this.name = name;
    }
//I need a toString() method to print the value  //append the object to print the value

    @Override
    public String toString() {
        return "Stud{" +
                "roll=" + roll +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }
    public int compareTo(Stud s)
    {
//        return marks> s.marks?1:-1;     //we are sorting based on their marks
//        return name.length()> s.name.length()?1:-1;     //we are sorting based on their name length
        return roll>s.roll?1:-1;        //sorting based on roll
    }

}
public class FiftyOne {
    public static void main(String[] args) {
        System.out.println("Collection and Generics | Comparable Interface");

        List<Stud> studs=new ArrayList<>();  //But there is no class named Stud, so we need to create a Stud class
        studs.add(new Stud(28,80,"Mahesh"));
        studs.add(new Stud(23,82,"Prakash"));
        studs.add(new Stud(20,78,"Akash"));
        studs.add(new Stud(30,60,"Bikash"));

 //Printing value by Enhance for loop
        for(Stud s: studs)
        {
            System.out.println(s);         //it will call the toString() method
        }


//printing is perfect, but now i want to sort this element ,is it possible ?

        Collections.sort(studs);  //show Error,Until implements Comparable and define method compareTo()
                                 // sorting using logic for roll
                                 //if you want to a class objects to be compared implements it with interface Comparable

//        Collections.sort(studs,(i,j)->i.marks>j.marks?1:-1); //sorting based on marks without changing class

        //Printing value after sorting
        System.out.println("            ---------------Printing value after sorting--------------                ");
        for(Stud s: studs)
        {
            System.out.println(s);         //it will call the toString() method
        }


    }
}


//When you create a List of elements of your own class and you want to sort them then implements Comparable interface
//and @Override compareTo() method of it according to your requirements