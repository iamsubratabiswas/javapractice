//code from FortyOne.java
// if I want to print bye at the end of the Threads how to do that ?? // problem is main thread do it simultaneously
//so main Thread to wait till the both child Treads come to at end of execution .. t1.join(),t2.join()
//isAlive return boolean , to check Thread is in running state or not ?
public class FortyTwo {
    public static void main(String[] args) throws Exception   //to handle Exception of join
    {
        System.out.println("MultiThreading Join | isAlive method ");
        Thread t1=new Thread(()->
        {
            for (int i=0;i<10;i++)
            {
                try { Thread.sleep(1000); } catch (Exception e) {}
                System.out.println("Hi");
            }
        });
        Thread t2=new Thread(()->
        {
            for (int i=0;i<10;i++)
            {
                try { Thread.sleep(1000); } catch (Exception e) {}
                System.out.println("Hello");
            }
        });

        t1.start();
        try { Thread.sleep(10); } catch (Exception e) {}
        t2.start();

        System.out.println(t1.isAlive()); //print true

        t1.join();//join() will make the main Thread to wait until they join to the main Thread again
        t2.join(); //But join may throws Exception so we need to handle the Exception

        System.out.println(t1.isAlive());  //print false because after join() Thread is dead

        System.out.println("Bye");   // after t1,t2 join to the main Thread this line will execute at end

    }
}
