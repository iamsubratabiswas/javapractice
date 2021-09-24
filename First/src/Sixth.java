
class Calc
{
    int num1;
    int num2;
    int result;

    public void perform()
    {
        result=num1+num2;
    }

}

public class Sixth {
    public static void main(String[] args) {
        System.out.println("Classes and Objects");
        Calc obj; //creation of  reference obj
        obj=new Calc(); //return object[new calc()] of type Calc to reference obj   //space allocation takes place here

        Calc obj1=new Calc();//single line //object knows something=variables and does something=mehtods

        obj.num1=4;
        obj.num2=6;
        System.out.println(obj.result);
        obj.perform();
        System.out.println(obj.result);

        obj1.num1=14;
        obj1.num2=6;
        System.out.println(obj1.result);
        obj1.perform();
        System.out.println(obj1.result);



    }
}
