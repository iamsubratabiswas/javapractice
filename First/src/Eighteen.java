class A18
        {
           int i=10;
           public void show()
           {
               System.out.println("inside superclass A18 ");
           }
        }
class B18 extends A18
{
    int i=20;
    public void show()
    {
        System.out.println("inside subclass B18");
    }
    public void config()
    {
        System.out.println("inside B18 config()");
    }
}

class C18 extends A18
{
    int i=20;
    public void show()
    {
        i=30;
        System.out.println("inside subclass C18");
    }
}

public class Eighteen {
    public static void main(String[] args) {
        System.out.println("Dynamic method ditchpatch,reference of superclass and object of subclass");

        A18 obj=new B18(); //reference of super and object of subclass
        System.out.println(obj.i); //superclass variable
        obj.show();  //subclass method //runtime polymorphism
        //  obj.config();  //error because we dont have config() in class A18,but refernce is of A18
        obj=new C18(); //same reference but creating object of C18
        System.out.println(obj.i); //superclass version
        obj.show(); //call sub class C18 mathod show()  //Dynamic Method Dispatch
    }
}
