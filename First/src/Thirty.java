
@FunctionalInterface
interface A30
{
    void abc();
    default void show()
    {
        System.out.println("inside default void show() defined in interface A30");
    }
}
interface B30
{
    default void show()              //it will show ERROR=>show() method in both A30 and B30=>ambiguity
                                     //so we can use show() method in subclass C30 also to solve this problem

    {
        System.out.println("inside default void show() defined in interface B30");
    }
}

class C30 implements A30,B30
{
    public void abc()
    {
        System.out.println("Inside abc()");
    }

//SOLUTION TO REMOVE AMBIGUITY PROBLEM //OUTPUT IS C30 class version of show() method
    @Override
    public void show() {
        System.out.println("inside default void show() defined in class C30");
        A30.super.show();  //call A30 version of show()
        B30.super.show();  //call B30 version of show()
    }

}


public class Thirty {
    public static void main(String[] args) {
        System.out.println(" Multiple Inheritance issue with Interface");
        A30 obj=new C30();
        obj.show();
    }
}
