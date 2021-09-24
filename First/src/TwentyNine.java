//Abstract class=>both define and declare methods
//Interface=>Only declare method->up to java 1.7
//from java 1.8=>we can define method in interface=>with special keyword =>default
//reason of default will be clear in collection and generic
@FunctionalInterface     //here it is also functional interface because we used 1 abstract function only
interface A29
{
    void abc();
    default void show()
    {
        System.out.println("inside default void show() defined in interface");
    }
}

class B29 implements A29
{
    public void abc()
    {
        System.out.println("Inside abc()");
    }

    public void show()
    {
        System.out.println("override is possible of default method in interface");
    }
}

public class TwentyNine {
    public static void main(String[] args) {
        System.out.println("DEFAULT METHOD IN INTERFACE");
        A29 obj=new B29();
        obj.show();
        obj.abc();
    }
}
