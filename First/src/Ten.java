class Emp
{
    int eid;
    int salary;
    static String ceo,company;

    public Emp() //executed when create object of a class
    {
        System.out.println("constructor : loaded every time we creates objects");
        eid=1;
        salary=7000;
    }

    static   //executed when load a class
    {
        company="AMAZON";
        ceo="LARRRY";
        System.out.println("static block: Execute only once");
    }


    public void show()
    {
        System.out.println(eid+ " " +salary+" "+ceo+" "+company);
    }
}


public class Ten {

    static int i;
    int j; //nonstatic variable is not accessible by static method,so though i is accessible by main but j not
    public static void main(String[] args) {
        System.out.println("STATIC KEYWORD:" +
                "\nmust be same ceo for all if anyone's ceo change:so ceo must be static\nto initialize nonstatic use " +
                "constructor\nto initialize static variable use static block\n");
        i=10;
//        j=10; //error because nonstatic variable is not accessible by static method


        Emp navin=new Emp();
        navin.eid=10;
        navin.salary=4000;
        navin.ceo="Mahesh";

        Emp rahul=new Emp();
        rahul.eid=120;
        rahul.salary=6000;
        rahul.ceo="NIKITA"; //navin ceo also be same because it loaded on class loader memory

        navin.show();
        rahul.show();

        Emp.ceo="SUBRATA"; //accessible without object also just with class name
        navin.show();
        rahul.show();

        System.out.println(Emp.ceo);



    }
}
