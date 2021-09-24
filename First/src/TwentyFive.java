//AS WE CAN NOT EXTEND MULTIPLE CLASSES but we can implements multiple interfaces
//multiple inheritance is advantage of interface
//such as class pen1 extends Writer,Abc                //NOT POSSIBLE
// class Pen1 extends Abc implements Writer1          //is possible
//DIFFERENCE BETWEEN ABSTRACT class AND INTERFACE=>
// abstract class may have Both abstract and normal methods But interface can Only have abstract methods
//By default all method in interface is=> public abstract => So no need to mention those keyword inside interface
//we can create reference of interface but not object of it
//IF YOU DON'T WANT DEFINE METHOD THEN INTERFACE IS BETTER THAN ABSTRACT CLASS



interface Writer1              //interface instead abstract class
{
    void  write();
}

class  Pen1 implements Writer1
{
    public void write()
    {
        System.out.println("write using pen");
    }
}
class Pencil1 implements Writer1
{
    public void write()
    {
        System.out.println("write using pencil");
    }
}

class Kit1
{
    public void doSomething(Writer p)  //here Writer type argument accepting in doSomething() in Kit class
    {
        p.write();  //calling Writer => write method selected according to the passing subclass object
    }
}


public class TwentyFive {
    public static void main(String[] args) {
        System.out.println("INTERFACE");
        Kit k=new Kit();  //object Kit class object

        Writer p=new Pen();  //NOW we can create reference of super and object of subclass
        Writer pc= new Pencil();

        k.doSomething(p);   //Pen class version Writer and write used in doSomething() inside Kit class
        k.doSomething(pc);  //Pencil class version Writer and write used in doSomething() inside Kit class

    }
}