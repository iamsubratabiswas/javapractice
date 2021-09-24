//IS-A==>CLASS EXTENDS ANOTHER CLASS=> CalcAdv extends Calculator=>CalcAdv is a type of Calculator
//HAS-A==>IN WHICH CREATING ANOTHER CLASS OBJECT=>Fifteen has other class objects
class Calculator             //SUPERCLASS,parent,base=>java,oops,c++
{
    public int add(int i,int j)
    {
        return i+j;
    }
}

class CalcAdv extends Calculator //SUBCLASS,child,derived //single level
{
    public int sub(int i,int j)
    {
        return i-j;
    }

}

class CalcVeryAdv extends CalcAdv //SUBCLASS,child,derived //all 3=>multi level,last two=>also single level
{
    public int mul(int i,int j)
    {
        return i*j;
    }
    public int div(int i,int j)
    {
        return i/j;
    }

}

public class Fifteen {
    public static void main(String[] args) {
        System.out.println("INHERITANCE =>SUB EXTENDS SUPER CLASS and inherit elements of superclass");
        CalcAdv c1 =new CalcAdv();
        System.out.println(c1.add(12,8));
        System.out.println(c1.sub(12,8));

        CalcVeryAdv c2=new CalcVeryAdv();
        System.out.println(c2.add(12,8));
        System.out.println(c2.sub(12,8));
        System.out.println(c2.mul(12,8));
    }
}
