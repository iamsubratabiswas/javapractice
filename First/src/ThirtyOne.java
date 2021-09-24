// If we use function body inside interface
// can we call them without implementing them with any class ? ( interface object creation not possible )
//yes static method instead default

interface A31
{
    int NUM=10;   //variable inside interface is by default final/constant
    void abc();
    static void show()
    {
        System.out.println("inside static void show() defined in interface");
    }
}
//class B31 implements A31
//{
//    public void abc()
//    {
//       // NUM=20;    //Error because in interface A31 NUM is by default final
//    }
//}

public class ThirtyOne {
    public static void main(String[] args) {
        System.out.println("STATIC METHOD IN INTERFACE");
        A31.show();  //as static so we can call it directly with interface //NO NEED TO CREATE OBJECT
    }
}
