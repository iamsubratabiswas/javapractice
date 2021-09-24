class A23
{
    final int I=10;  //constant
    final int DAY;   //we must have to assign value to it,until giving value error//see inside constructor

    public final void show()  //if you want to prevent method show() from override then use final method
    {
        System.out.println("inside A23");
    }

    public A23()  //constructor
    {
     //   I=20;  //changing value of I give error because it declared as final
                //naming convention constants== CAPITAL letters
        DAY=23;
//        DAY=28;   //assign assign value 2nd time=>error
    }


}
final class B23 extends A23    //if you want to prevent extends/inherit class B23 then final class
{
//    public void show()       //override of show() give Error Because it is final method declared in super class
//    {
//        System.out.println("inside class B23 overridden method");
//    }

}

//class C23 extends B23  //extends B23 GIVE ERROR  because B23 is final class
//{
//
//}


public class TwentyThree {
    public static void main(String[] args) {
        System.out.println("FINAL KEYWORD=>with variables,methods and class");
        A23 obj=new A23();
        System.out.println(obj.I+"   "+obj.DAY);

        A23 obj1=new B23();
        obj1.show();
    }
}
