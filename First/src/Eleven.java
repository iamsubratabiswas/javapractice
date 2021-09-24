class Outer
{
    static int a;
    public static void show()
    {
        System.out.println("inside outer class method\n");

    }

    class  Inner  //INNER CLASS/MEMBER CLASS Outer$Inner.class
    {
      public void display()
      {
          System.out.println("inside inner class method=>\nOuter.Inner obj1=obj.new Inner()\nobj1.display(); \n");
      }
    }

    static class  Inner1  //STATIC INNER CLASS/MEMBER CLASS
    {
        public void display()
        {
            System.out.println("inside static inner class method=>\nOuter.Inner1 obj2=new Outer.Inner1();\nobj2.display(); ");
        }
    }

}

public class Eleven {
    //VARIABLE,METHOD

    public static void main(String[] args) {
        System.out.println("INNER CLASS\nINNER CLASS ONLY FOR OUTER CLASS\n3 TYPES:\nMEMBER CLASS" +
                "\nSTATIC CLASS\nANONYMOUS CLASS\n IN COMPILED 3 CLASS:" +
                "\n Eleven.class,Outer.class and Outer$Inner.class\n ");
        Outer obj=new Outer();
        obj.show();
        //inner obj1=new inner() //ERROR ,directly cant be accessed
        Outer.Inner obj1=obj.new Inner();//reference of inner class with the help of outer class
                                         // (Outer.Inner obj1) and
                                         // inner class object with th help of object of outer class object
                                         //( obj.new Inner)
        obj1.display();

        Outer.Inner1 obj2=new Outer.Inner1(); //for static Inner class no need to Outer class object
        obj2.display();

    }
}
