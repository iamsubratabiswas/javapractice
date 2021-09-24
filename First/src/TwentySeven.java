import org.w3c.dom.ls.LSOutput;

class A27
{
    public void show()
    {
        System.out.println("INSIDE A27 show()");
    }
}

//class B27 extends A27       //if only purpose is to override,OR ONE TIME USE a method then no need to make subclass
//{                           //we can do it by inner class,if don't want  not reuse it tp save memory
//    public void show()
//    {
//        System.out.println("i am the best");
//    }
//}

public class TwentySeven {
    public static void main(String[] args) {
        System.out.println("ANONYMOUS INNER CLASS");
//        A27 obj = new B27();
//        obj.show();

        A27 obj = new A27() {//THIS CURLY BRACES after REPRESENT CLASS AND THIS CLASS DOESN'T HAVE NAME=>ANONYMOUS
            public void show()
            {
                System.out.println("i am the best");
            }
        };
        obj.show();  //it is calling anonymous class show()
    }
}
