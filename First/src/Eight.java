
class Calc1
{
    int num1,num2,result;
    public  Calc1()
    {
        num1=6;
        num2=10;
    }
    public  Calc1(int num1,int num2)
    {
        this.num1=num1;
        this.num2=num2;
    }


}

public class Eight {
    public static void main(String[] args) {
        System.out.println("this keyword:to differentiate between instance(this) variable and local variable");
        Calc1 obj=new Calc1();
        Calc1 obj1=new Calc1(10,20);

        System.out.println(obj.num1 + " "+ obj.num2);
        System.out.println(obj1.num1+" "+ obj1.num2);


    }
}
