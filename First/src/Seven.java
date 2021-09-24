class A
{
    int i;
    float f;
    A()
    {
        i=10;
        f=100;
        System.out.println("no parameter Constructor");
    }

    A(int k)
    {
        i=k;
        f=k;
        System.out.println("one Parameterized constructor");
    }
    A(double k)
    {
        i=(int)k;
        f=(float)k;
        System.out.println("one Parameterized constructor type casted");
    }
    A(int k,float ff)
    {
        i=k;
        f=ff;
        System.out.println("two Parameterized constructoor");
    }

}



public class Seven {
    public static void main(String[] args) {
        System.out.println("Constructor(),Constructor overloading:\n is a member method\nnever return anything thats why public" +
                "\nused to allocate memory\n");

    A obj= new A();
    A obj1=new A(100);
    A obj2=new A(7.6);
    A obj3=new A(200,400);


        System.out.println(obj.i+" "+obj.f);
        System.out.println(obj1.i+" "+obj1.f);
        System.out.println(obj2.i+" "+obj2.f + " Type casted");
        System.out.println(obj3.i+" "+obj3.f);

    }
}
