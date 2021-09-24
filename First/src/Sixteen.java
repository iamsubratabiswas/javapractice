class AA
{
  AA()
  {
      System.out.println("inside class AA default constructor");
  }
    AA(int a)
    {
        System.out.println("inside class AA parameterized constructor");
    }

}
class B extends AA
{
    B()
    {
        super(10); //to call parameterized of AA
        System.out.println("inside class B default constructor");
    }
    B(int b)
    {
        //       super(); //no need to use by default remain in every constructor
        //       but there is no parametrized by default super() available
        super(b);
        System.out.println("inside class B parameterized constructor");
    }
}


public class Sixteen {
    public static void main(String[] args) {
        System.out.println("SUPER KEYWORD");
        B obj= new B();//BOTH default CONSTRUCTOR CALLED
        System.out.println();

        B obj1= new B(3);//one default others parameterized CONSTRUCTOR CALLED
                            // so inside subclass parameterized super(b) to be used to call both parameterizd

    }
}
