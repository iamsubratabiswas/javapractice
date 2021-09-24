class Aaa
{
    int i;
    public void show()
    {
        System.out.println("inside Aaa: show()");
    }
    public void display()
    {
        System.out.println("inside Aaa: display()");
    }
}
class Bbb extends Aaa
{
    int i;
    @Override //this indentation check speeling mistakes /really show() overriden or not/give error if not overriden
    public void show() //method overriding
    {
        i=8;
        super.i=i; //to assign i value to super class i
        super.show(); // to call superclass show() method
        System.out.println("inside Bbb:show()");
    }
    //if we write @Override here it will give error because then it must be display()
    public void display1() //method overriding
    {
        System.out.println("inside Bbb:display1()");
    }
}


public class seventeen {
    public static void main(String[] args) {
        System.out.println("MULTIPLE INHERITANCE,abstract class,method overriding");
        Bbb obj=new Bbb();
        obj.show();  //child class version
        obj.display(); //parent class version because not available in child class
    }
}
