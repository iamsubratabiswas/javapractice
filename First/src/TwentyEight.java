//@FunctionalInterface   //this indentation prevent interface from declaring more than one method
interface A28
{
    void show();
//    void m();    //Error because @FunctionalInterface
}



//class B28 implements A28
//{
//    public void show()
//    {
//        System.out.println("i am the best");
//    }
//}



public class TwentyEight {
    public static void main(String[] args) {
        System.out.println("FUNCTIONAL INTERFACE | LAMBDA EXPRESSION\n TYPES OF INTERFACE :"+
                "\n1.NORMAL INTERFACE=>more than one method" +
                "\n2.SINGLE ABSTRACT INTERFACE=>only one method(Functional interface ,Lambda interface(Scala concept))" +
                "\n3.MARKER INTERFACE=>no method(Example:java inbuilt Serializable interface)\n");
//        A28 obj=new B28();
//        obj.show();

//        A28 obj = new A28() {
//            public void show()
//            {
//                System.out.println("i am the best");
//            }
//        };
        //instead this we will  use below expression
        //steps://interface knows show method so no need to mention method name as well as =>new A28 also removed
               //as we have only one method so we remove curly braces as well

        A28 obj = () -> System.out.println("i am the best");  //Lambda Expression ()->function elements
        obj.show();


    }
}
