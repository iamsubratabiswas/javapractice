//Runnable interface has only one method called run()
//Thread has start() method but Runnable has no start() method
class Hi1 implements Runnable
{
    public void run()
    {
        for (int i=0;i<10;i++)
        {
            try { Thread.sleep(1000); } catch (Exception e) {}
            System.out.println("Hi");
        }
    }
}

class Hello1 implements Runnable
{
    public void run()
    {
        for (int i=0;i<10;i++)
        {
            try { Thread.sleep(1000); } catch (Exception e) {}
            System.out.println("Hello");
        }
    }
}

public class Forty {
    public static void main(String[] args) {
        System.out.println("MultiThreading using interface | Runnable Interface ");
//        Hi1 obj1=new Hi1();
//        Hello1 obj2 =new Hello1();   //But reference should be interface Runnable //not compulsory
        Runnable obj1=new Hi1();
        Runnable obj2 =new Hello1();
//Runnable has no start() method so we created Thread t1 and t2 to use start()
//        Thread t1=new Thread();
//        Thread t2=new Thread();
//but here t1.start() and t2.start() will call the run() of Thread itself,it will not call the run() of our class,how to link them ?
//ok just pass the object of Runnable (obj1,obj2) inside Thread() ==>  as Tread t1=new Thread(obj1) to link t1 with obj1
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
//        obj1.start();
//        try { Thread.sleep(10); } catch (Exception e) {}
//        obj2.start();
        t1.start();
        try { Thread.sleep(10); } catch (Exception e) {}
        t2.start();

    }
}

