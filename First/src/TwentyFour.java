/*
class  Pen
{
    public void write()
    {
        System.out.println("write using pen");
    }
}
class Pencil
{
    public void write()
    {
        System.out.println("write using pencil");
    }
}

class Kit
{
    public void doSomething(Pen p)
    {
        p.write();
    }
    public void doSomething(Pencil pc)
    {
        pc.write();
    }
}

public class TwentyFour {
    public static void main(String[] args) {
        System.out.println("WITHOOUT ABSTRACT CLASS PROBLEM ");
        Kit k=new Kit();  //Creating object of Kit class
        Pen p=new Pen();  //Creating object of Pen class
        k.doSomething(p);  //calling method of kit passing pen
        Pencil pc=new Pencil();//Creating object of Pencil class
        k.doSomething(pc);   //run overloaded doSomething() inside Kit
    }
}
 */



//ANOTHER SOLUTION BELOW USING ABSTRACT CLASS Writer (NO NEED TO MAKE MANY OVERLOADED METHODS)


abstract class Writer              //this class does nothing and Pen and PenCil class extends writer
{
    public abstract void  write(); //abstract method Write()
}

class  Pen extends Writer
{
    public void write()
    {
        System.out.println("write using pen");
    }
}
class Pencil extends Writer
{
    public void write()
    {
        System.out.println("write using pencil");
    }
}

class Kit
{
    public void doSomething(Writer p)  //here Writer type argument accepting in doSomething() in Kit class
    {
        p.write();  //calling Writer class => write method selected according to the passing subclass object
    }
}


public class TwentyFour {
    public static void main(String[] args) {
        System.out.println("ABSTRACT CLASS ASSIGNMENT SOLUTION GIVEN IN 22");
        Kit k=new Kit();  //object Kit class object

        Writer p=new Pen();  //NOW we can create reference of super and object of subclass
        Writer pc= new Pencil();

        k.doSomething(p);   //Pen class version Writer and write used in doSomething() inside Kit class
        k.doSomething(pc);  //Pencil class version Writer and write used in doSomething() inside Kit class

    }
}
