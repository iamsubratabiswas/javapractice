package thirtytwocom.subrata.test;

public class Student2 {
    public static void main(String[] args) {
        Student1 s=new Student1();  //Student1 is located at same package of Student class
        s.i=30;                   //public accessible everywhere
        s.roll=2;                 //default same package accessible
//        s.name="subrata";       //error because name is private//not accessible outside same class of Student1
        s.marks=92;     //ok because protected is accessible within same package
    }
}
