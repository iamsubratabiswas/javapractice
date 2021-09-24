

class Printer
{
//    public void show(Integer i)
//    {
//        System.out.println(i);
//    }

//    public void show(Double i)
//    {
//        System.out.println(i);
//    }

    //instead above two method below single method to handle all type of data
    public void show(Number i)
    {
        System.out.println(i);
    }

}

public class TwentyTwo {
    public static void main(String[] args) {
        System.out.println("WHY TO USE ABSTRACT CLASS ?");
        Printer obj = new Printer();
        obj.show(10.4); //double value accepted by wrapper class Number
        obj.show(10); //integer value accepted by wrapper class Number
                        //because Number is an abstract class and Integer,Double,Float etc extends Number
                        // so here one fuction doing all is possible

    }
}



//another exaple both pen and pencil can use same method without defining multiple overloaded method same as before


//class Pencil extends Writer
//{
//    public void write()
//    {
//        System.out.println("write using pencil");
//    }
//}
//
//class Kit
//{
//    public void doSomething(Writer p)  //here Writer type argument accepting in kit
//    {
//        p.write();
//    }
//}
//
//
//
//public class TwentyTwo {
//    public static void main(String[] args) {
//        System.out.println("INTERFACE");
//        Kit k=new Kit();
//
//        Writer p=new Pen();  //NOW we can create refernce of super and object of subclass
//        Writer pc= new Pencil();
//
//        k.doSomething(p);
//        k.doSomething(pc);
//
//    }
//}

