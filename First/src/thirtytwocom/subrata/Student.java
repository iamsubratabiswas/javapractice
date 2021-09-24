package thirtytwocom.subrata;

import thirtytwocom.subrata.test.*;   //import Student1 class here to make object of it

public class Student {
    public static void main(String[] args) {
        Student1 s=new Student1();
//        s.roll=20;   //ERROR by default package private class not in same package
                      //But it is okey in Student2 class because Student1 and Student2 are in same package
        s.i=30;
        System.out.println(s.i);
//        s.marks=90;   //Error : protected only accessible within same package and subclasses
    }
}
