//API = application programming interface
//for generalisation
interface Abc
{
    void show();
}
class Implementor implements Abc
{
   public void show()
   {
       System.out.println("inside Implementor");
   }
}

public class TwentySix {
    public static void main(String[] args) {
        System.out.println("MORE ABOUT INTERFACE");
        Abc obj=new Implementor() ;  //we can create reference but not object //SO object of subclass
        obj.show();
    }
}
