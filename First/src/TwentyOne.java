//I dont want to create object of class Human
//abstract: no one can create object of it /abstract class can not be instantiated
//expectation :in future someone will extend this class and methods
//if we use abstract method inside class then class must be abstract
// but in case of abstract class abstract method is not mandatory



abstract class Human              //abstract class
{
    public abstract void eat();  //instead define method to declare method =>abstract mandatory//abstract method

    public void walk()
    {
        System.out.println("Normal method Already defined inside abstract super class,not compulsory to define again");
    }
}

class Man extends Human  //to create object LIKE of abstract class we make subclass of that
                         //here Man= Concrete class
                         //trick:  reference of Human and object of Man  IF you are man then I can REFER you as a Human
                         // and in this class it is compulsory to define abstract methods of the abstract class
{
    public void eat() {
        System.out.println("Abstract method defined in subclass,mandatory to override inside subclass/Concrete class");
    }
}
public class TwentyOne {
    public static void main(String[] args) {
        System.out.println("ABSTRACT KEYWORD-class and method");
        Human obj= new Man();

        obj.walk();
        obj.eat();
    }
}
