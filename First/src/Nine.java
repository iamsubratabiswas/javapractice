class Casio
{
    public void add(int i,int j)
    {
        System.out.println(i+j);
    }

    public void add(double i,double j)
    {
        System.out.println(i+j+2);
    }

    public void add(int i,int j,int k)
    {
        System.out.println(i+j+k);
    }
}

public class Nine {
    public static void main(String[] args) {
        System.out.println("METHOD OVERLOADING");
        Casio obj=new Casio();
        obj.add(10,20);
        obj.add(10.3,20);
        obj.add(10,20,30);

    }
}
